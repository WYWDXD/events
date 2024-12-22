package org.example.bigevent.service;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Material;
import org.example.bigevent.pojo.PageBean;

public interface MaterialService {
    PageBean<Material> list(Integer pageNum, Integer pageSize, String code);

}
