package com.jkronyak.pointofsalesim2.controller;

import com.jkronyak.pointofsalesim2.model.ItemModel;
import com.jkronyak.pointofsalesim2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/item")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) { this.itemService = itemService; }

    @GetMapping(value="/")
    public ResponseEntity<List<ItemModel>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @GetMapping(value="/{itemId}")
    public ResponseEntity<ItemModel> getItemById(@PathVariable Long itemId) {
        return ResponseEntity.ok(itemService.getItemById(itemId));
    }

    @PostMapping(value="/")
    public ResponseEntity<ItemModel> createIem(@RequestBody ItemModel itemModel) {
        return ResponseEntity.ok(itemService.createItem(itemModel));
    }

    @PutMapping(value="/{itemId}")
    public ResponseEntity<ItemModel> updateItem(@PathVariable Long itemId, @RequestBody ItemModel itemModel) {
        return ResponseEntity.ok(itemService.updateItem(itemId, itemModel));
    }

    @DeleteMapping(value="/{itemId}")
    public ResponseEntity<Boolean> deleteItem(@PathVariable Long itemId) {
        return ResponseEntity.ok(itemService.deleteItem(itemId));
    }


}
