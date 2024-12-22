package org.example.bigevent.service.impl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.bigevent.mapper.AreaPriceMapper;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.User;
import org.example.bigevent.service.AreaPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AreaPriceServiceImpl implements AreaPriceService {
    @Autowired
    private AreaPriceMapper areaPriceMapper;
    @Override
    public PageBean<AreaPrice> list(Integer pageNum, Integer pageSize, String code) {
        //创建pagebean对象
        PageBean<AreaPrice> pb = new PageBean<>();
        //开启分页查询    PageHelper
        PageHelper.startPage(pageNum, pageSize);

        List<AreaPrice> as = areaPriceMapper.list(code);
        //page中提供了方法，可以获取pagehelper分页查询后得到的总记录条数和当前页数数据
        Page<AreaPrice> p = (Page<AreaPrice>) as;
        //把数据填充到pagebean对象中
        pb.setTotal(p.getTotal());
        pb.setItems(p.getResult());
        return pb;
    }

}
