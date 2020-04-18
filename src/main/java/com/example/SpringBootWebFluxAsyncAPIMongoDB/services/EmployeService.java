package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;



import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Employe;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface EmployeService {
	public Mono<Employe> addEmploye(Employe em);
	public Mono<Employe> updateEmploye(Employe em, String id);
	public Mono<Void> deleteEmploye(String em);
	public Mono<Employe> getEmploye(String em);
	public Flux<Employe> getAllEmploye();
	public Mono<Employe> affectContToEmp(String idCrt, String idEmp);
	public Mono<Employe> affectDeptToEmp(String idDept, String idEmp);
	public Mono<Employe> affectEntToEmp(String idEnt, String idEmp);
	public Mono<Employe> affectMissToEmp(String idMiss, String idEmp);



	

}
