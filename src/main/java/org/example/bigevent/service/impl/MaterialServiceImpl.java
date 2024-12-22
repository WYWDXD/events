package org.example.bigevent.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.bigevent.mapper.GreeningMapper;
import org.example.bigevent.mapper.MaterialMapper;
import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Material;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl  implements MaterialService {
    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public PageBean<Material> list(Integer pageNum, Integer pageSize, String code) {
        //创建pagebean对象
        PageBean<Material> pb = new PageBean<>();
        //开启分页查询    PageHelper
        PageHelper.startPage(pageNum, pageSize);

        List<Material> as = materialMapper.list(code);
        //page中提供了方法，可以获取pagehelper分页查询后得到的总记录条数和当前页数数据
        Page<Material> p = (Page<Material>) as;
        //把数据填充到pagebean对象中
        pb.setTotal(p.getTotal());
        pb.setItems(p.getResult());
        return pb;
    }
}
