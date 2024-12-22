package org.example.bigevent.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.bigevent.mapper.DecorationMapper;
import org.example.bigevent.mapper.HbMapper;
import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.Hb;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.service.HbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HbServiceImpl implements HbService {
    @Autowired
    private HbMapper hbMapper;

    @Override
    public PageBean<Hb> list(Integer pageNum, Integer pageSize, String code) {
        //创建pagebean对象
        PageBean<Hb> pb = new PageBean<>();
        //开启分页查询    PageHelper
        PageHelper.startPage(pageNum, pageSize);

        List<Hb> as = hbMapper.list(code);
        //page中提供了方法，可以获取pagehelper分页查询后得到的总记录条数和当前页数数据
        Page<Hb> p = (Page<Hb>) as;
        //把数据填充到pagebean对象中
        pb.setTotal(p.getTotal());
        pb.setItems(p.getResult());
        return pb;
    }
}
