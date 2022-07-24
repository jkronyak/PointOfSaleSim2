package com.jkronyak.pointofsalesim2.controller;

import com.jkronyak.pointofsalesim2.model.ItemModel;
import com.jkronyak.pointofsalesim2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
