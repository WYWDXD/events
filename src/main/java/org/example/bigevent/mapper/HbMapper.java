package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.Hb;

import java.util.List;
@Mapper
public interface HbMapper {
    List<Hb> list(String code);
}
