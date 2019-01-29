package lk.ijse.dto;

public class ItemDTO {
    private Integer id;
    private String itemName;
    private Double price;
    private Integer qty;

    public ItemDTO() {
    }

    public ItemDTO(Integer id, String itemName, Double price, Integer qty) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
