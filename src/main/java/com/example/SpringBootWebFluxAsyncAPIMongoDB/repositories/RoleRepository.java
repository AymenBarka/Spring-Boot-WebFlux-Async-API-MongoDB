package com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Role;

public interface RoleRepository extends ReactiveMongoRepository<Role,String> {

}
