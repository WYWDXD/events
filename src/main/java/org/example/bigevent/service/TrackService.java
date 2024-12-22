package org.example.bigevent.service;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Track;

public interface TrackService {
    PageBean<Track> list(Integer pageNum, Integer pageSize, String code);

}
