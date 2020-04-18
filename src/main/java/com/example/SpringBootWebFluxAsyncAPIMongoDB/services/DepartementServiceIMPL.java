package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Departement;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.DepartementRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service(value = "departementService")
public class DepartementServiceIMPL implements DepartementService {
	
	@Autowired
	DepartementRepository departementRepository;

	@Override
	public Mono<Departement> addDepartement(Departement dep) {
		return departementRepository.save(dep);
	}

	@Override
	public Mono<Departement> updateDepartement(Departement dep, String id) {
		return departementRepository.save(dep );
	}

	@Override
	public Mono<Void> deleteDepartement(String dep) {
		return departementRepository.deleteById(dep);
	}

	@Override
	public Mono<Departement> getDepartement(String dep) {
		return departementRepository.findById(dep);
	}

	@Override
	public Flux<Departement> getAllDepartement() {
		return departementRepository.findAll();
	}

	

}
