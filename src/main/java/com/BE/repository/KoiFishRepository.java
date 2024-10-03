package com.BE.repository;

import com.BE.model.entity.KoiFish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KoiFishRepository extends JpaRepository<KoiFish, Integer> {
    Optional<KoiFish> findById(int ID);
}
