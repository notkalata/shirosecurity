package me.kaloyangeorgiev.shirosecurity.service;

import me.kaloyangeorgiev.shirosecurity.model.animal.Cat;
import me.kaloyangeorgiev.shirosecurity.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    @Autowired
    private CatRepository catRepository;

    public Cat findCatByName(String name) {
        return catRepository.findCatByName(name);
    }

    public List<Cat> findCatsByColor(String color) {
        return catRepository.findCatsByColor(color);
    }

    public List<Cat> findAllCats() {
        return (List<Cat>) catRepository.findAll();
    }
}
