package lk.ijse.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderDetails {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odid")
    private int odid;

    @ManyToOne
    @JoinColumn(name = "oid")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "itemid")
    private Item id;

    @Column(name = "qty")
    private double qty;

    @Column(name = "amount")
    private double amount;

    public OrderDetails() {
    }

    public OrderDetails(int odid, Orders orders, Item id, double qty, double amount) {
        this.odid = odid;
        this.orders = orders;
        this.id = id;
        this.qty = qty;
        this.amount = amount;
    }

    public OrderDetails(int odid, double qty) {
        this.odid = odid;
        this.qty = qty;
    }

    public int getOdid() {
        return odid;
    }

    public void setOdid(int odid) {
        this.odid = odid;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getId() {
        return id;
    }

    public void setId(Item id) {
        this.id = id;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "odid=" + odid +
                ", orders=" + orders +
                ", id=" + id +
                ", qty=" + qty +
                ", amount=" + amount +
                '}';
    }
}
