package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

public interface ItemsService {
    public List<Items> findAllItems();

    Items findItemsById(Integer id);

    void updateItems(Items items);
}
