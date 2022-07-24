package com.jkronyak.pointofsalesim2.service;

import com.jkronyak.pointofsalesim2.model.ItemModel;
import com.jkronyak.pointofsalesim2.repository.ItemRepository;
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

    public ItemModel createItem(ItemModel itemModel) {
        return itemRepository.save(itemModel);
    }

    public ItemModel updateItem(Long itemId, ItemModel itemModel) {
        ItemModel foundItemModel = itemRepository.findById(itemId).orElse(null);
        if(foundItemModel == null) { throw new ResourceNotFoundException("No item found with id: " + itemId); }
        foundItemModel.setName(itemModel.getName());
        foundItemModel.setWeighted(itemModel.getWeighted());
        foundItemModel.setPrice(itemModel.getPrice());
        return itemRepository.save(foundItemModel);
    }

    public Boolean deleteItem(Long itemId) {
        ItemModel foundItemModel = itemRepository.findById(itemId).orElse(null);
        if(foundItemModel == null) { throw new ResourceNotFoundException("No item found with id: " + itemId); }
        itemRepository.deleteById(itemId);
        return true;
    }




}
