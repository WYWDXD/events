package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.JianAn;

import java.util.List;

@Mapper
public interface JianAnMapper {
    List<JianAn> list(String code);
}
