package com.demo.service;

import com.demo.model.BuildingDTO;

import java.util.List;

public interface BuildingService {
    List<BuildingDTO> findAll(String name,Long maxBuilding_area,Long minBuilding_area,Long rental_cost,String level,
                              String payment,String manager_name,String direction);
}
