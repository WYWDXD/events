package org.example.bigevent.controller;
import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.MaterialYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materialyear")
public class MaterialYearController {
    @Autowired
    private MaterialYearService materialYearService;
    @GetMapping
    public Result<List<AreaPrice>> list(@RequestParam(required = false) String name) {
        List<AreaPrice> cs=  materialYearService.list(name);
        return Result.success(cs);
    }
}
