package com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Employe;

public interface EmlpoyeRepository extends ReactiveMongoRepository<Employe,Integer> {
 
}
