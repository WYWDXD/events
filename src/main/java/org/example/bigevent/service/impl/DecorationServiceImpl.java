package org.example.bigevent.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.bigevent.mapper.AreaPriceMapper;
import org.example.bigevent.mapper.DecorationMapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.service.DecorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DecorationServiceImpl implements DecorationService {
    @Autowired
    private DecorationMapper decorationMapper;

    @Override
    public PageBean<Decoration> list(Integer pageNum, Integer pageSize, String code) {
        //创建pagebean对象
        PageBean<Decoration> pb = new PageBean<>();
        //开启分页查询    PageHelper
        PageHelper.startPage(pageNum, pageSize);

        List<Decoration> as = decorationMapper.list(code);
        //page中提供了方法，可以获取pagehelper分页查询后得到的总记录条数和当前页数数据
        Page<Decoration> p = (Page<Decoration>) as;
        //把数据填充到pagebean对象中
        pb.setTotal(p.getTotal());
        pb.setItems(p.getResult());
        return pb;
    }
}
