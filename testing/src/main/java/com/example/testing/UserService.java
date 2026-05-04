package com.example.testing;

public class UserService{
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public String getUser(int id){
        return userRepository.findUserById(id);
    }
}
