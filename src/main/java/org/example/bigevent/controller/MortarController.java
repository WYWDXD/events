package org.example.bigevent.controller;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Mortar;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.GreeningService;
import org.example.bigevent.service.MortarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mortar")
public class MortarController {
    @Autowired
    private MortarService mortarService;
    @GetMapping
    public Result<PageBean<Mortar>> list(Integer pageNum,
                                         Integer pageSize,
                                         @RequestParam(required = false) String code
    ) {
        PageBean<Mortar> cs=  mortarService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }
}
