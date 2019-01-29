package lk.ijse.controllers;

import lk.ijse.dto.ItemDTO;
import lk.ijse.entity.Item;
import lk.ijse.services.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping("/add")
    public void addItem(@RequestBody ItemDTO itemDTO){
        itemService.addItem(itemDTO);
    }

    @GetMapping("/all")
    public List<ItemDTO> getAll(){
        return itemService.getAllItem();
    }

    @PutMapping("/update")
    public void updateItem(@RequestBody ItemDTO itemDTO){
        itemService.updateItem(itemDTO);
    }

    @GetMapping("/search/{id}")
    public Item searchItem(@PathVariable Integer id){
        return itemService.searchItem(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable Integer id) {
        itemService.deleteItem(id);
    }


}
