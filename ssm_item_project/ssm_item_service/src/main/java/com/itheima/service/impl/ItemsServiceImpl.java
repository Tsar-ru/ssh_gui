package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    public ItemsDao itemsDao;
    @Override
    public List<Items> findAllItems() {
       return itemsDao.findAllItems();
    }

    @Override
    public Items findItemsById(Integer id) {
        return  itemsDao.findItemsById(id);
    }

    @Override
    public void updateItems(Items items) {
        itemsDao.updateItems(items);
    }
}
