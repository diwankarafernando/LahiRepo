package lk.ijse.services.impl;

import lk.ijse.dto.ItemDTO;
import lk.ijse.entity.Item;
import lk.ijse.repository.ItemRepo;
import lk.ijse.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Override
    public List<ItemDTO> getAllItem() {
        List<Item> item=itemRepo.findAll();
        List<ItemDTO> list=new ArrayList<>();
        for(Item it : item){
            list.add(new ItemDTO(it.getId(),it.getItemName(),it.getPrice(),it.getQty()));
        }

        return list;
    }

    @Override
    public void addItem(ItemDTO itemDTO) {
        Item item=new Item(itemDTO.getId(),itemDTO.getItemName(),itemDTO.getPrice(),itemDTO.getQty());
        itemRepo.save(item);
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        Item item=new Item(itemDTO.getId(),itemDTO.getItemName(),itemDTO.getPrice(),itemDTO.getQty());
        if(item.getId()!=null){
            itemRepo.save(item);
            System.out.println("Updated");
        }else{
            System.out.println("Error");
        }
    }

    @Override
    public Item searchItem(Integer id) {
        Optional<Item> it = this.itemRepo.findById(id);
        if (it.isPresent()) {
            return it.get();
        } else {
            return null;
        }
    }

    @Override
    public void deleteItem(Integer id) {
        itemRepo.deleteById(id);
    }


}
