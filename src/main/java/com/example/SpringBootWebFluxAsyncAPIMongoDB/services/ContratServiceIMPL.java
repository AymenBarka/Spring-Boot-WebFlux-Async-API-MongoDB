package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Contrat;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.ContratRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service(value = "contratService")
public class ContratServiceIMPL implements ContratService {
	
	@Autowired
	ContratRepository contratRepository;

	@Override
	public Mono<Contrat> addContrat(Contrat crt) {
	    return contratRepository.save(crt)	;	

	}

	@Override
	public Mono<Contrat> updateContrat(Contrat crt) {
		
		return contratRepository.save(crt);
	}

	@Override
	public Mono<Void> deleteContrat(int crt) {
		return contratRepository.deleteById(crt);
	}

	@Override
	public Mono<Contrat> getContrat(int crt) {
		return contratRepository.findById(crt);
	}

	@Override
	public Flux<Contrat> getAllContrat() {
		return contratRepository.findAll();
	}

}
