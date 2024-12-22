package org.example.bigevent.controller;

import org.example.bigevent.pojo.AreaPrice;
import org.example.bigevent.pojo.Material;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.service.MaterialListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materiallist")
public class MaterialListController {
    @Autowired
    private MaterialListService materialListService;
    @GetMapping
    public Result<List<AreaPrice>> list(){
        List<AreaPrice> cs=  materialListService.list();
        return Result.success(cs);
    }
}
