package com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Contrat;

public interface ContratRepository extends ReactiveMongoRepository<Contrat,Integer> {

}
