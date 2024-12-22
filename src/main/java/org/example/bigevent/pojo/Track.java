package org.example.bigevent.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Track {
    private String code;

    private String year;
    private String quarter;

    private String name;
    private String model;
    private String unit;
    private String taxPrice;
    private String noTaxPrice;
    private String remark;
}
