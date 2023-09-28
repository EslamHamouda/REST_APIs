package com.example.bootstrap.repository;

import com.example.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DogRepository {
    @Query("select * from Dog")
    List<Dog> findAll();
    @Query("select d.id, d.breed from Dog d where d.id=:id")
    String findBreedById(Long id);

    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreed();

    @Query("select d.id, d.name from Dog d")
    List<String> findAllName();
}
