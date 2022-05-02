package com.dtcc.hospital.hm.controller;

import com.dtcc.hospital.hm.model.Allocation;
import com.dtcc.hospital.hm.model.Thing;
import com.dtcc.hospital.hm.service.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allocation")
public class AllocationController {
    @Autowired
    AllocationService allocationService;

    @DeleteMapping(value = "/remove")
    public boolean removeAllocation(@RequestParam Integer id) {
        return allocationService.removeAllocation(id);
    }
    @PostMapping(value = "/resourceAllocation", consumes = "application/json")
        public Allocation register(@RequestBody Allocation allocation){
            return allocationService.register(allocation);
        }

   @GetMapping(value = "/listAllocations")
    public List<Allocation> listAllocations(){
        return allocationService.findAll();
   }
}
