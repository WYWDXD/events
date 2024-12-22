package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.bigevent.controller.AreaPriceController;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.User;

import java.util.List;

@Mapper
public interface AreaPriceMapper {
    List<AreaPrice> list(String code);

}
