package org.example.bigevent.service.impl;
import org.example.bigevent.mapper.MaterialYearMapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.service.MaterialYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MaterialYearServiceIml implements MaterialYearService {
    @Autowired
    private MaterialYearMapper materialYearMapper;
    @Override
    public List<AreaPrice> list(String name) {
        List<AreaPrice> as = materialYearMapper.list(name);
        return as;
    }
}
