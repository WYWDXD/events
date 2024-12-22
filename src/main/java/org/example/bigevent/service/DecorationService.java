package org.example.bigevent.service;

import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.PageBean;

public interface DecorationService {
    PageBean<Decoration> list(Integer pageNum, Integer pageSize, String code);
}
