package com.BE.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "tours")
public class Tour {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "TourName", nullable = false)
    private String TourName;

    @Column (name = "TourDate", nullable = false)
    private LocalDateTime TourDate;

    @Column (name = "TourPrice", nullable = false)
    private float TourPrice;

    @Column (name = "TourDuration", nullable = false)
    private String TourDuration;

    @OneToMany (mappedBy = "tours", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FarmTour> farmTour;
}
