package com.dtcc.hospital.hm.controller;

import com.dtcc.hospital.hm.model.Program;
import com.dtcc.hospital.hm.model.Thing;
import com.dtcc.hospital.hm.service.ProgramService;
import com.dtcc.hospital.hm.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/register")
public class RegisteryController {

    @Autowired
    ThingService thingservice;

    @Autowired
    ProgramService programService;

    @PostMapping(value = "/resource", consumes = "application/json")
   //ß @CrossOrigin(origins = "http://localhost:3000")
    public Thing register(@RequestBody Thing thing){

        return thingservice.register(thing);
    }

    @GetMapping(value = "/resource/find", produces = "application/json")
    @CrossOrigin(origins = "http://localhost:3000")
    public Optional<Thing> getThing(@RequestParam Integer id){
        //public Optional<Thing> getThing(@PathVariable(value="id") Integer id){
        return thingservice.findById(id);
    }

    @GetMapping(value = "/listHumans", produces = "application/json")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Thing> listHumans(){
        return thingservice.findHumans();
    }

    @GetMapping(value = "/listItems")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Thing> listThings(){
        return thingservice.findItems();
    }
    @PostMapping(value = "/program", consumes = "application/json")
    @CrossOrigin(origins = "http://localhost:3000")
    public Program register(@RequestBody Program program){
        return programService.register(program);
    }

    @GetMapping(value = "/listprograms")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Program> listPrograms(){
        return programService.findAll();
    }

    @DeleteMapping(value = "/remove/{id}")
   // @CrossOrigin(origins = "http://localhost:3000")
    public boolean removeThing(@PathVariable(value="id") Integer id){
          //  @RequestParam Integer id){
         return thingservice.removeThing(id);
    }

    @GetMapping(value = "/listAllocations")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Program> listAllocations(){
        return programService.findAll();
    }



}
