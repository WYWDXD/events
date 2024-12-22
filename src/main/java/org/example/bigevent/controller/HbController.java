package org.example.bigevent.controller;

import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.Hb;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.DecorationService;
import org.example.bigevent.service.HbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hb")
public class HbController {
    @Autowired
    private HbService hbService;
    @GetMapping
    public Result<PageBean<Hb>> list(Integer pageNum,
                                             Integer pageSize,
                                             @RequestParam(required = false) String code
    ) {
        PageBean<Hb> cs=  hbService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }
}
