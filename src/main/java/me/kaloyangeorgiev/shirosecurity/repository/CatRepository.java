package me.kaloyangeorgiev.shirosecurity.repository;

import me.kaloyangeorgiev.shirosecurity.model.animal.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> {
    Cat findCatByName(String name);
    List<Cat> findCatsByColor(String color);
}
