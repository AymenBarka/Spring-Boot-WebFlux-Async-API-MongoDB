package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Departement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface DepartementService {
	public Mono<Departement> addDepartement(Departement dep);
	public Mono<Departement> updateDepartement(Departement dep , String id);
	public Mono<Void> deleteDepartement(String dep);
	public Mono<Departement> getDepartement(String dep);
	public Flux<Departement> getAllDepartement();
}
