package org.example.bigevent.service.impl;

import org.example.bigevent.mapper.MaterialAreaMapper;
import org.example.bigevent.mapper.MaterialDataMapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.service.MaterialAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialAreaServiceImpl implements MaterialAreaService {
    @Autowired
    private MaterialAreaMapper materialAreaMapper;
    @Override
    public List<AreaPrice> list(String year, String name) {
        List<AreaPrice> as = materialAreaMapper.list(year,name);
        return as;
    }
}
