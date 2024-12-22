package org.example.bigevent.service;

import org.example.bigevent.pojo.AreaPrice;

import java.util.List;

public interface MaterialYearService {
    List<AreaPrice> list(String name);
}
