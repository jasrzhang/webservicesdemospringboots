package com.webservices.demo.service;

import com.webservices.demo.entity.Dog;
import com.webservices.demo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{
    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs(){
        return (List<Dog>) dogRepository.findAll();
    }

}
