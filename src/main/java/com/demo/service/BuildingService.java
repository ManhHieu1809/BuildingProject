package com.demo.service;

import com.demo.model.BuildingDTO;

import java.util.List;

public interface BuildingService {
    List<BuildingDTO> findAll(String name,Long ward_id);
}
