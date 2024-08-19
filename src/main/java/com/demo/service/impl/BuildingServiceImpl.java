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
    public List<BuildingDTO> findAll(String name,Long ward_id) {
        List<BuildingEntity> buildingEntities = buildingRepository.findAll(name,ward_id);
        List<BuildingDTO> buildingDTOs = new ArrayList<BuildingDTO>();
        for(BuildingEntity buildingEntity : buildingEntities){
            BuildingDTO buildingDTO = new BuildingDTO();
            buildingDTO.setName(buildingEntity.getName());
            buildingDTO.setNumber_of_basement(buildingEntity.getNumber_of_basement());
            buildingDTO.setStructure(buildingEntity.getStructure());
            buildingDTO.setStreet(buildingEntity.getStreet());
            buildingDTOs.add(buildingDTO);
        }
        return buildingDTOs;
    }
}
