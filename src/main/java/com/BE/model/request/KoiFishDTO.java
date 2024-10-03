package com.BE.model.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class KoiFishDTO {
    private int id;
    private String koiname;
    private String detail;
    private float price;
}
