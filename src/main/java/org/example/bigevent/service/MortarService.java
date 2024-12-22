package org.example.bigevent.service;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Mortar;
import org.example.bigevent.pojo.PageBean;

public interface MortarService {
    PageBean<Mortar> list(Integer pageNum, Integer pageSize, String code);

}
