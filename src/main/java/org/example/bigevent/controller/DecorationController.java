package org.example.bigevent.controller;

import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Decoration;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.AreaPriceService;
import org.example.bigevent.service.DecorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decoration")
public class DecorationController {
    @Autowired
    private DecorationService decorationService;
    @GetMapping
    public Result<PageBean<Decoration>> list(Integer pageNum,
                                            Integer pageSize,
                                            @RequestParam(required = false) String code
    ) {
        PageBean<Decoration> cs=  decorationService.list(pageNum, pageSize,code);
        return Result.success(cs);
    }
}
