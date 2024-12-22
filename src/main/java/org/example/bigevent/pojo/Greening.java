package org.example.bigevent.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greening {
    private String code;
    private String year;
    private String month;
    private String name;
    private String model;
    private String unit;
    private String taxPrice;
    private String noTaxPrice;
    private String family;
    private String height;
    private String trunkDiameter;
    private String topDiameter;
    private String branchHeight;
    private String remark;

}
