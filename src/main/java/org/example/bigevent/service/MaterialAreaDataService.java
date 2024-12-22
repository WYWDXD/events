package org.example.bigevent.service;

import org.example.bigevent.pojo.AreaPrice;

import java.util.List;

public interface MaterialAreaDataService {
    List<AreaPrice> list(String area, String year, String name);
}
