package lk.ijse.dto;

import javafx.collections.ObservableList;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class OrderDTO implements Serializable {
    private Integer oid;
    private String orderDate;
    private Integer id;
    private ObservableList<OrderDetailDTO> orderDetailDTOS;


    public OrderDTO() {
    }

    public OrderDTO(Integer oid, String orderDate, Integer id, ObservableList<OrderDetailDTO> orderDetailDTOS) {
        this.oid = oid;
        this.orderDate = orderDate;
        this.id = id;
        this.orderDetailDTOS = orderDetailDTOS;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ObservableList<OrderDetailDTO> getOrderDetailDTOS() {
        return orderDetailDTOS;
    }

    public void setOrderDetailDTOS(ObservableList<OrderDetailDTO> orderDetailDTOS) {
        this.orderDetailDTOS = orderDetailDTOS;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "oid=" + oid +
                ", orderDate='" + orderDate + '\'' +
                ", id=" + id +
                ", orderDetailDTOS=" + orderDetailDTOS +
                '}';
    }
}
