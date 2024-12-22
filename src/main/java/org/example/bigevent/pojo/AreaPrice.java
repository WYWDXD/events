package org.example.bigevent.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AreaPrice {
    private String code;
    private String area;
    private String year;
    private String month;
    private String name;
    private String model;
    private String unit;
    private String taxPrice;
    private String noTaxPrice;
    private String remark;
}
