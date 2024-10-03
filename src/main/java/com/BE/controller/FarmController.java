package com.BE.controller;

import com.BE.model.entity.Farm;
import com.BE.model.request.FarmDTO;
import com.BE.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farm")
public class FarmController {
    @Autowired
    FarmService farmService;

    @PostMapping("/add")
//    @PreAuthorize("hasRole('SALE_STAFF')")
    public String AddFarm(@RequestBody FarmDTO farmDTO) {
        Farm newFarm = farmService.create(farmDTO);
        return "Added Farm: " + newFarm.getId();
    }

    @GetMapping("/list")
    public List<Farm> readAllFarm() {
        return farmService.read();
    }

    @PutMapping("/update/{id}")
    public String updateFarm(@PathVariable int id, @RequestBody FarmDTO farmDTO) {
        Farm updateFarm = farmService.update(id, farmDTO);
        return "updateFarm: " + updateFarm.getId();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFarm(@PathVariable int id) {
        farmService.deleteFarm(id);
        return "deleteFarm: " + id;
    }
}
