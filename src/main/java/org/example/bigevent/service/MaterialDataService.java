package org.example.bigevent.service;

import org.example.bigevent.pojo.AreaPrice;

import java.util.List;

public interface MaterialDataService {
    List<AreaPrice> list(String year,String month,String name);
}
