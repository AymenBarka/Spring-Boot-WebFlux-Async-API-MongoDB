package com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories;

import java.util.Observable;
import java.util.Optional;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Employe;



public interface EmlpoyeRepository extends ReactiveMongoRepository<Employe ,String> {
	

}
