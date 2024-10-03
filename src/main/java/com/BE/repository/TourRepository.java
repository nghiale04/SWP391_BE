package com.BE.repository;

import com.BE.model.entity.Tour;
import com.SWP391_Project.Entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {
    Optional<Tour> findById(int id);
}
