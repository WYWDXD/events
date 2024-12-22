package org.example.bigevent.service;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.PageBean;

public interface AreaPriceService {

    PageBean<AreaPrice> list(Integer pageNum, Integer pageSize,String code);
}
