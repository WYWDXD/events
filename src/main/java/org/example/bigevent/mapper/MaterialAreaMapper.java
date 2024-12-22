package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.AreaPrice;

import java.util.List;

@Mapper
public interface MaterialAreaMapper {
    List<AreaPrice> list(String year,String name);
}
