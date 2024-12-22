package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.AreaPrice;

import java.util.List;

@Mapper
public interface MaterialAreaDataMapper {
    List<AreaPrice> list(String area ,String year, String name);
}
