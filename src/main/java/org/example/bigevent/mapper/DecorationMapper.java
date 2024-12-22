package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Decoration;

import java.util.List;

@Mapper
public interface DecorationMapper {
    List<Decoration> list(String code);
}
