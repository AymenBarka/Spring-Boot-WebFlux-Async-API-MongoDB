package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Employe;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.ContratRepository;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.DepartementRepository;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.EmlpoyeRepository;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.EntrepriseRepository;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.MissionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service(value = "employeService")
public class EmployeServiceIMPL implements EmployeService {
	
	
	@Autowired
	EmlpoyeRepository employeRepository;
	@Autowired
	ContratRepository contratRepository;
	@Autowired
	DepartementRepository departementRepository;
	@Autowired
	EntrepriseRepository entrepriseRepository;
	@Autowired
	MissionRepository missionRepository;
	

	@Override
	public Mono<Employe> addEmploye(Employe em) {

		return employeRepository.save(em);
		
	}

	@Override
	public Mono<Employe> updateEmploye(Employe em , String id) {
		
		return employeRepository.save(em);
	}

	@Override
	public Mono<Void> deleteEmploye(String em) {
		return employeRepository.deleteById(em);
	}

	@Override
	public Mono<Employe> getEmploye(String em) {
		return employeRepository.findById(em);
	}

	@Override
	public Flux<Employe> getAllEmploye() {
		return employeRepository.findAll();
	}

	@Override
	public Mono<Employe> affectContToEmp(String idCrt, String idEmp) {
		// Mono<Employe> updateEmp=employeRepository.findById(idEmp);
				 return employeRepository.findById(idEmp)
				            .switchIfEmpty(Mono.error(new Exception("EMPLOYE_NOT_FOUND")))
				            .map(emp -> {
				            	emp. setIdContrat(idCrt);
				            	return emp;
				            })
				            .flatMap(employeRepository::save);
		
	}

	@Override
	public Mono<Employe> affectDeptToEmp(String idDept, String idEmp) {
		 return employeRepository.findById(idEmp)
		            .switchIfEmpty(Mono.error(new Exception("EMPLOYE_NOT_FOUND")))
		            .map(emp -> {
		            	emp.setIdDepartement(idDept);; 
		            	return emp;
		            })
		            .flatMap(employeRepository::save);

		
	}

	@Override
	public Mono<Employe> affectEntToEmp(String idEnt, String idEmp) {
		return employeRepository.findById(idEmp)
	            .switchIfEmpty(Mono.error(new Exception("EMPLOYE_NOT_FOUND")))
	            .map(emp -> {
	            	emp.setIdEntreprise(idEnt);
	            	return emp;
	            })
	            .flatMap(employeRepository::save);
	}

	@Override
	public Mono<Employe> affectMissToEmp(String idMiss, String idEmp) {
		return employeRepository.findById(idEmp)
	            .switchIfEmpty(Mono.error(new Exception("EMPLOYE_NOT_FOUND")))
	            .map(emp -> {
	            	emp.setIdMission(idMiss);
	            	return emp;
	            })
	            .flatMap(employeRepository::save);
	}

		
	
	

	

}
