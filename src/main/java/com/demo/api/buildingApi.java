package com.demo.api;

import com.demo.model.BuildingDTO;
import com.demo.service.BuildingService;
import customexception.FeildRequiredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class buildingApi {
    @Autowired
    private BuildingService buildingService;
        @GetMapping(value = "/api/building/")
    public List<BuildingDTO> building(@RequestParam(value = "name",required = false) String name,
                                      @RequestParam(value = "ward_id",required = false) Long ward_id) {
        List<BuildingDTO> result = buildingService.findAll(name,ward_id);

        return result;
    }

//    @RequestMapping(value = "/api/building/", method = RequestMethod.POST)
//    public void building1(@RequestParam Map<String, String> map) {
//        System.out.println(map);
//    }

//    @PostMapping(value = "/api/building/")
//    public Object getBuilding(@RequestBody BuildingDTO bean ) {
        // xu ly loi
//        try {
//            System.out.println(5/0);
//            valiDate(bean);
//        }catch (FeildRequiredException e){
//            ErrorResponeDTO errorResponeDTO = new ErrorResponeDTO();
//            errorResponeDTO.setError(e.getMessage());
//            List<String> details = new ArrayList<>();
//            details.add("check lai number or numberofBasement vi dang bi null !!!");
//            errorResponeDTO.setDetail(details);
//            return errorResponeDTO;
//        }
//        System.out.println(5/0);
//        return null;
//    }

//    public void valiDate(BuildingDTO bean) {
//        if(bean.getName() == null || bean.getName().isEmpty() ||bean.getNumberOfBasament() == null){
//            throw new FeildRequiredException("name or numberofBasament is null");
//        }
//    }
//
//    @DeleteMapping(value = "/api/building/{id}")
//    public void building2(@PathVariable Integer id) {
//        System.out.println("da xoa " + id);
//    }
}
