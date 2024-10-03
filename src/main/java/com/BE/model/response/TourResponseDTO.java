package com.BE.model.response;

import com.BE.model.request.FarmDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourResponseDTO {
    private int id;
    private String nameTour;
    private List<FarmDTO> farms;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private float price;
}
