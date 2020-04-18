package com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Departement;

public interface DepartementRepository extends ReactiveMongoRepository<Departement, String> {

}
