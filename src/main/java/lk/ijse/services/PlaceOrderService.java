package lk.ijse.services;

import lk.ijse.dto.OrderDTO;
import lk.ijse.dto.OrderDetailDTO;

import java.util.List;

public interface PlaceOrderService {
    void addPlaceOrder(OrderDTO orders, List<OrderDetailDTO> orderDetails1);
}
