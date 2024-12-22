package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.Greening;

import java.util.List;
@Mapper
public interface GreeningMapper {
    List<Greening> list(String code);
}
