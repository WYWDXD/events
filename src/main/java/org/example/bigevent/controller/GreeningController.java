package org.example.bigevent.controller;

import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.DecorationService;
import org.example.bigevent.service.GreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greening")
public class GreeningController {
    @Autowired
    private GreeningService greeningService;
    @GetMapping
    public Result<PageBean<Greening>> list(Integer pageNum,
                                           Integer pageSize,
                                           @RequestParam(required = false) String code
    ) {
        PageBean<Greening> cs=  greeningService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }
}
