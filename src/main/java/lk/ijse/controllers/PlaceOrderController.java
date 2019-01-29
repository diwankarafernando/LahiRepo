package lk.ijse.controllers;

import lk.ijse.dto.OrderDTO;
import lk.ijse.dto.OrderDetailDTO;
import lk.ijse.entity.Customer;
import lk.ijse.entity.Item;
import lk.ijse.services.CustomerService;
import lk.ijse.services.ItemService;
import lk.ijse.services.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/placeOrder")

public class PlaceOrderController {
    @Autowired
    private PlaceOrderService placeOrderService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ItemService itemService;

    Item item;
    Item item1;
    Customer customer;

    @GetMapping("/find/{id}")
    public Customer searchCustomer(@PathVariable Integer id){
        customer= customerService.searchCustomer(id);
        return customer;

    }

    @GetMapping(value="/findById/{id}")
    public Item searchItem(@PathVariable Integer id){
        item= itemService.searchItem(id);
        System.out.println(item);
        return item;
    }
    @GetMapping(value="/findBy/{id}")
    public Item searchItem2(@PathVariable Integer id){
        item1= itemService.searchItem(id);
        System.out.println(item1);
        return item1;
    }

    @PostMapping(value = "/add")
    public void addPlaceOrder(@RequestBody OrderDTO orders, List<OrderDetailDTO> orderDetails){
        placeOrderService.addPlaceOrder(orders,orderDetails);
    }
}
