package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")

public class ItemsController {
    @Autowired
    public ItemsService itemsService;
    @RequestMapping("/findAllItems")
    public String findAllItems(Model model){
        model.addAttribute("itemsList",itemsService.findAllItems());
        return "/itemsList";
    }
    /*
     * 接受id查询产品数据
     * 跳转编辑产品的页面
     * */
    @RequestMapping("/editItems.action")
    public String editProductUI(Integer id,Model model){
        //查询产品数据
        Items items =  itemsService.findItemsById(id);
        //将product产品数据跳转页面回显
        model.addAttribute("items",items);
        return "/editItems";
    }
    @RequestMapping("/updateItems.action")
    public String editProduct(Items items){
        itemsService.updateItems(items);
        return "redirect:/itemsList";
    }


}
