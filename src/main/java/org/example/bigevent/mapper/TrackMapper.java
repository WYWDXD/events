package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.example.bigevent.pojo.Track;

import java.util.List;

@Mapper
public interface TrackMapper {
    List<Track> list(String code);
}
