package com.BE.repository;

import com.BE.model.entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FarmRepository extends JpaRepository<Farm, Integer> {
    Optional<Farm> findById(int id);
}
