package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Contrat;
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
	public Mono<Void> affectContToEmp(String idCrt, String idEmp) {
		Mono<Contrat>updateCont=contratRepository.findById(idCrt);
		Mono<Employe> updateEmp=employeRepository.findById(idEmp);
		return null;
		
		
		
		
		
		
	}
	

}
