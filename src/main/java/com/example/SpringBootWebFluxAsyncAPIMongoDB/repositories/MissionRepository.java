package com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Mission;

public interface MissionRepository extends ReactiveMongoRepository<Mission,String> {

}
