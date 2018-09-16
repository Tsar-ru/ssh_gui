package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ItemsDao {
    /**
     * 查询全部
     * @return
     */
    @Select("select * from  items")
    List<Items> findAllItems();
    @Select("select * from items where id = #{id}")
    Items findItemsById(Integer id);
// "pic=#{pic}

    @Update("update items set name=#{name},price=#{price},createtime=#{createtime},detail=#{detail},where id =#{id}")
    void updateItems(Items items);
}
