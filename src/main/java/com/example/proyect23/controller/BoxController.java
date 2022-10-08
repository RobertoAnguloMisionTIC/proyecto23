package com.example.proyect23.controller;

import com.example.proyect23.model.Box;
import com.example.proyect23.service.BoxImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Box")
@CrossOrigin(origins = "*")
public class BoxController {
    @Autowired
    private BoxImplementation boxImplementation;

    @PostMapping("/save")
    public void createBox(@RequestBody Box box){
        boxImplementation.create(box);
        return;
    }

    @GetMapping("/all")
    public List<Box> getBoxs(){
        return boxImplementation.boxs();
    }

    @PutMapping("/update")
    public void updateBox(@RequestBody Box box){
        boxImplementation.update(box);
        return;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBox(@PathVariable ("id") Integer id){
        boxImplementation.delete(id);
        return;
    }
}
