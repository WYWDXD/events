package org.example.bigevent.service.impl;

import org.example.bigevent.mapper.MaterialAreaDataMapper;
import org.example.bigevent.mapper.MaterialAreaMapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.service.MaterialAreaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialAreaDataServiceImpl implements MaterialAreaDataService {
    @Autowired
    private MaterialAreaDataMapper materialAreaDataMapper;
    @Override
    public List<AreaPrice> list(String area, String year, String name) {
        List<AreaPrice> as = materialAreaDataMapper.list(area,year,name);
        return as;
    }
}
