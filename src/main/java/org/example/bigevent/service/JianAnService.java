package org.example.bigevent.service;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.JianAn;
import org.example.bigevent.pojo.PageBean;

public interface JianAnService {
    PageBean<JianAn> list(Integer pageNum, Integer pageSize, String code);

}
