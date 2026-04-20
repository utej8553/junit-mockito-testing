package com.example.testing.service;

import com.example.testing.entity.DemoEntity;
import com.example.testing.repository.DemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoService {
    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public DemoEntity addDemoEntity(DemoEntity demoEntity){
        return demoRepository.save(demoEntity);
    }
    public Optional<DemoEntity> getDemoEntity(long id) {
        return demoRepository.findById(id);
    }
    public List<DemoEntity> getAll(){
        return demoRepository.findAll();
    }
}
