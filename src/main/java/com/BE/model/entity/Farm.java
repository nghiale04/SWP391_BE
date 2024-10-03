package com.BE.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "farms")
public class Farm implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "FarmName", nullable = false)
    private String farmName;

    @Column (name = "location", nullable = false)
    private String location;

    @Column (name = "Description", nullable = false)
    private String description;

    @Column (name = "StartTime" )
    private LocalDateTime startTime;

    @Column (name = "EndTime")
    private LocalDateTime endTime;

    @OneToMany(mappedBy = "farms", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<FarmTour> farmTour;

}
