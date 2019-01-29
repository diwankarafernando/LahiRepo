package lk.ijse.services;

import lk.ijse.dto.ItemDTO;
import lk.ijse.entity.Item;

import java.util.List;

public interface ItemService {
    List<ItemDTO> getAllItem();
    void addItem(ItemDTO customerDTO);
    void updateItem(ItemDTO customerDTO);
    Item searchItem(Integer id);
    void deleteItem(Integer id);

}
