package com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Entreprise;

public interface EntrepriseRepository extends ReactiveMongoRepository<Entreprise, String>{

}
