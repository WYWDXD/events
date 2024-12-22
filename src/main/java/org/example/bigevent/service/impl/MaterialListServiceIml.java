package org.example.bigevent.service.impl;
import org.example.bigevent.mapper.MaterialListMapper;
import org.example.bigevent.mapper.MaterialMapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.service.MaterialListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialListServiceIml implements MaterialListService {
    @Autowired
    private MaterialListMapper materialMapper;

    @Override
    public List<AreaPrice> list() {

        return materialMapper.list();
    }
}
