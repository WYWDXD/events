package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.bigevent.controller.MaterialListController;
import org.example.bigevent.pojo.AreaPrice;

import java.util.List;

@Mapper
public interface MaterialListMapper {
    List<MaterialListController> GetAllPage();
    @Select("select distinct name from area_price")
    List<AreaPrice> list();
}
