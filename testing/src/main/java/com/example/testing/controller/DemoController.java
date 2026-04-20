package com.example.testing.controller;

import com.example.testing.entity.DemoEntity;
import com.example.testing.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping
    public List<DemoEntity> getAll(){
        return demoService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<DemoEntity> getDemoEntityById(@PathVariable long id){
        return demoService.getDemoEntity(id);
    }
    @PostMapping("")
    public DemoEntity addDemoEntity(@RequestBody DemoEntity demoEntity){
        return demoService.addDemoEntity(demoEntity);
    }
}
