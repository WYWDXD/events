package org.example.bigevent.controller;

import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.AreaPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaPriceController {
    @Autowired
    private AreaPriceService areaPriceService;
    @GetMapping
    public Result<PageBean<AreaPrice>> list(Integer pageNum,
                                        Integer pageSize,
                                            @RequestParam(required = false) String code
                                       ) {
        PageBean<AreaPrice> cs=  areaPriceService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }
}
