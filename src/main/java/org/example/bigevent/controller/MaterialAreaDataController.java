package org.example.bigevent.controller;

import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.MaterialAreaDataService;
import org.example.bigevent.service.MaterialYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materialareadata")
public class MaterialAreaDataController {
    @Autowired
    private MaterialAreaDataService materialAreaDataService;
    @GetMapping
    public Result<List<AreaPrice>> list(@RequestParam(required = false) String area,@RequestParam(required = false) String year,@RequestParam(required = false) String name) {
        List<AreaPrice> cs=  materialAreaDataService.list(area,year,name);
        return Result.success(cs);
    }
}
