package lk.ijse.dto;


public class OrderDetailDTO{

    private Integer odid;
    private Integer id;
    private Integer qty;
    private Double unitPrice;
    private Double amount;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(Integer odid, Integer id, Integer qty, Double unitPrice, Double amount) {
        this.odid = odid;
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" +
                "odid=" + odid +
                ", id=" + id +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
}
