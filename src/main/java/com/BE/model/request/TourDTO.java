package com.BE.model.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class TourDTO {
    private int id;
    private String name;
    private LocalDateTime date;
    private int price;
    private String duration;
}
