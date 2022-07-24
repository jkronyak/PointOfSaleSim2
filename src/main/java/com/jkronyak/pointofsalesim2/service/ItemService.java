package com.jkronyak.pointofsalesim2.service;

import com.jkronyak.pointofsalesim2.exception.EmployeeNotFoundException;
import com.jkronyak.pointofsalesim2.model.ItemModel;
import com.jkronyak.pointofsalesim2.repository.ItemRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemModel> getAllItems() { return itemRepository.findAll(); }

    public ItemModel getItemById(Long itemId) {
        ItemModel foundItemModel = itemRepository.findById(itemId).orElse(null);
        if(foundItemModel == null) { throw new ResourceNotFoundException("No item found with id: " + itemId); }
        return foundItemModel;
    }




}
