package org.example.bigevent.controller;

import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.MaterialDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materialdata")
public class MaterialDataController {
    @Autowired
    private MaterialDataService materialDataService;
    @GetMapping
    public Result<List<AreaPrice>> list(
    @RequestParam(required = false) String year,
            @RequestParam(required = false) String month,
    @RequestParam( required = false) String name) {
        List<AreaPrice> cs=  materialDataService.list(year,month,name);
        return Result.success(cs);
    }
}
