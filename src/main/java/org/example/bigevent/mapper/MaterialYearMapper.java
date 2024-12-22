package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.AreaPrice;

import java.util.List;

@Mapper
public interface MaterialYearMapper {
    List<AreaPrice> list(String name);
}
