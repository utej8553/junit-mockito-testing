package com.example.testing;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    @Test
    void testGetUser(){
        UserRepository repo = Mockito.mock(UserRepository.class);
        Mockito.when(repo.findUserById(1)).thenReturn("Demo");
        UserService service = new UserService(repo);
        String result = service.getUser(1);
        assertEquals("Demo", result);
    }
}
