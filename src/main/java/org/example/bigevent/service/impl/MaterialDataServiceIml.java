package org.example.bigevent.service.impl;

import org.example.bigevent.mapper.MaterialDataMapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.service.MaterialDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaterialDataServiceIml implements MaterialDataService {
    @Autowired
    private MaterialDataMapper materialDataMapper;
    @Override
    public List<AreaPrice> list(String year,String month,String name) {
        List<AreaPrice> as = materialDataMapper.list(year,month,name);
        return as;
    }
}
