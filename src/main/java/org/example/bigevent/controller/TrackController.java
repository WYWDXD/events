package org.example.bigevent.controller;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.pojo.Track;
import org.example.bigevent.service.GreeningService;
import org.example.bigevent.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/track")
public class TrackController {
    @Autowired
    private TrackService trackService;
    @GetMapping
    public Result<PageBean<Track>> list(Integer pageNum,
                                           Integer pageSize,
                                           @RequestParam(required = false) String code
    ) {
        PageBean<Track> cs=  trackService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }

}
