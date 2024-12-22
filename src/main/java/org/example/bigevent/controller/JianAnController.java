package org.example.bigevent.controller;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.JianAn;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.GreeningService;
import org.example.bigevent.service.JianAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jianan")
public class JianAnController {
    @Autowired
    private JianAnService jianAnService;
    @GetMapping
    public Result<PageBean<JianAn>> list(Integer pageNum,
                                           Integer pageSize,
                                           @RequestParam(required = false) String code
    ) {
        PageBean<JianAn> cs=  jianAnService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }
}
