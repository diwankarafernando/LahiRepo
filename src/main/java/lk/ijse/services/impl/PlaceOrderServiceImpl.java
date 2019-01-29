package lk.ijse.services.impl;

import lk.ijse.dto.OrderDTO;
import lk.ijse.dto.OrderDetailDTO;
import lk.ijse.entity.Customer;
import lk.ijse.entity.Item;
import lk.ijse.entity.OrderDetails;
import lk.ijse.entity.Orders;
import lk.ijse.repository.CustomerRepo;
import lk.ijse.repository.ItemRepo;
import lk.ijse.repository.OrderDetailRepo;
import lk.ijse.repository.OrderRepo;
import lk.ijse.services.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderDetailRepo orderDetailRepo;

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private CustomerRepo customerRepo;

    Customer customer;

    @Override
    @Transactional
    public void addPlaceOrder(OrderDTO orders, List<OrderDetailDTO> orderDetails1) {
            Optional<Customer> cus = this.customerRepo.findById(orders.getId());
            if (cus.isPresent()) {
                customer= cus.get();
            } else {

            }

            Orders orders1=new Orders(orders.getOid(),customer,orders.getOrderDate());
            orderRepo.save(orders1);
            OrderDetailDTO orderDetailDTO;
            OrderDetails orderDetail = new OrderDetails();
            Item item1 = new Item();

            for (int i=0;i<=orderDetails1.size()-1;i++){
                orderDetailDTO=orderDetails1.get(i);
                System.out.println(orderDetailDTO.getId());

                Optional<Item> byId = itemRepo.findById(orderDetailDTO.getId());
                if (byId.isPresent()) {
                    item1=byId.get();

                } else {

                }
                orderDetail.setOdid(orderDetailDTO.getOdid());
                orderDetail.setOrders(orders1);
                orderDetail.setId(item1);
                orderDetail.setQty(orderDetailDTO.getQty());
                orderDetail.setAmount(orderDetailDTO.getAmount());
                orderDetailRepo.save(orderDetail);

                if(item1.getId()!=null){
                    item1.setQty((int) (item1.getQty()-orderDetail.getQty()));
                    itemRepo.save(item1);

                }

            }
    }
}
