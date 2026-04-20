package com.example.testing.service;

import com.example.testing.entity.DemoEntity;
import com.example.testing.repository.DemoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import static sun.java2d.cmm.ProfileDataVerifier.verify;

@ExtendWith(MockitoExtension.class)
class DemoServiceTest {
    @Mock
    private DemoRepository demoRepository;
    @InjectMocks
    private DemoService demoService;

    @Test
    void testingAddDemoEntity(){
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setDemoString("Testing");
        when(demoRepository.save(any(DemoEntity.class))).thenReturn(demoEntity);
        DemoEntity result = demoService.addDemoEntity(new DemoEntity());
        assertNotNull(result);
        assertEquals("Testing", result.getDemoString());
        verify(demoRepository, times(1)).save(any(DemoEntity.class));

    }
}