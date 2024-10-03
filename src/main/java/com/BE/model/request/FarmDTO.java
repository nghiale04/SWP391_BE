package com.BE.model.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
public class FarmDTO {
    private int id;
    private String farmName;
    private String location;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
