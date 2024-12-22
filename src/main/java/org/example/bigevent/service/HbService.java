package org.example.bigevent.service;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Hb;
import org.example.bigevent.pojo.PageBean;

public interface HbService {
    PageBean<Hb> list(Integer pageNum, Integer pageSize, String code);

}
