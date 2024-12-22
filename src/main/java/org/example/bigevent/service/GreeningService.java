package org.example.bigevent.service;

import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.PageBean;

public interface GreeningService {
    PageBean<Greening> list(Integer pageNum, Integer pageSize, String code);
}
