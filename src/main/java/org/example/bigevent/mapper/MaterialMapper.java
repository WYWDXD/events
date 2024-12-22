package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Material;

import java.util.List;

@Mapper
public interface MaterialMapper {
    List<Material> list(String code);
}
