package org.example.bigevent.controller;

import org.example.bigevent.pojo.Greening;
import org.example.bigevent.pojo.Material;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.GreeningService;
import org.example.bigevent.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialService materialService;
    @GetMapping
    public Result<PageBean<Material>> list(Integer pageNum,
                                           Integer pageSize,
                                           @RequestParam(required = false) String code
    ) {
        PageBean<Material> cs=  materialService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }
}
