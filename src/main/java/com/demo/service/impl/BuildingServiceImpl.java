package com.demo.service.impl;

import com.demo.model.BuildingDTO;
import com.demo.repository.BuildingRepository;
import com.demo.repository.entity.BuildingEntity;
import com.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;
    @Override
    public List<BuildingDTO> findAll(String name,Long maxBuilding_area,Long minBuilding_area,Long rental_cost,String level,
                                     String payment,String manager_name,String direction) {
        List<BuildingEntity> buildingEntities = buildingRepository.findAll(name,maxBuilding_area,minBuilding_area,rental_cost,level,payment,manager_name,direction);
        List<BuildingDTO> buildingDTOs = new ArrayList<BuildingDTO>();
        for(BuildingEntity buildingEntity : buildingEntities){
            BuildingDTO buildingDTO = new BuildingDTO();
            buildingDTO.setName(buildingEntity.getName());
            buildingDTO.setNumber_of_basement(buildingEntity.getNumber_of_basement());
            buildingDTO.setStructure(buildingEntity.getStructure());
            buildingDTO.setStreet(buildingEntity.getStreet());
            buildingDTO.setMaxBuilding_area(buildingEntity.getMaxBuilding_area());
            buildingDTO.setMinBuilding_area(buildingEntity.getMinBuilding_area());
            buildingDTO.setRental_cost(buildingEntity.getRental_cost());
            buildingDTO.setLevel(buildingEntity.getLevel());
            buildingDTO.setPayment(buildingEntity.getPayment());
            buildingDTO.setManager_name(buildingEntity.getManager_name());
            buildingDTO.setManager_phone(buildingEntity.getManager_phone());
            buildingDTO.setDirection(buildingEntity.getDirection());
            buildingDTO.setCost_description(buildingEntity.getCost_description());
            buildingDTOs.add(buildingDTO);
        }
        return buildingDTOs;
    }
}
