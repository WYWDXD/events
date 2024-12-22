package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Mortar;

import java.util.List;

@Mapper
public interface MortarMapper {
    List<Mortar> list(String code);
}
