package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Employe;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface EmployeService {
	public Mono<Employe> addEmploye(Employe em);
	public Mono<Employe> updateEmploye(Employe em);
	public Mono<Void> deleteEmploye(int em);
	public Mono<Employe> getEmploye(int em);
	public Flux<Employe> getAllEmploye();
	public Mono<Void> affectContToEmp(int idCrt, int idEmp);
	

}
