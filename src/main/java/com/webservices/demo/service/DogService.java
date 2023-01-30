package com.webservices.demo.service;

import com.webservices.demo.entity.Dog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DogService {
    public List<Dog> retrieveDogs();
}
