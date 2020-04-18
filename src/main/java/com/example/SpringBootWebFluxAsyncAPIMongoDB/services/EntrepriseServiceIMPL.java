package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Entreprise;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.EntrepriseRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service(value = "entrepriseService")
public class EntrepriseServiceIMPL implements EntrepriseService {
	
	@Autowired
	EntrepriseRepository entrepriseRepository;

	@Override
	public Mono<Entreprise> addEntreprise(Entreprise ent) {
		return entrepriseRepository.save(ent);
	}

	@Override
	public Mono<Entreprise> updateEntreprise(Entreprise ent, String id) {
		return entrepriseRepository.save(ent);
	}

	@Override
	public Mono<Void> deleteEntreprise(String ent) {
		return entrepriseRepository.deleteById(ent);
	}

	@Override
	public Mono<Entreprise> getEntreprise(String ent) {
		return entrepriseRepository.findById(ent);
	}

	@Override
	public Flux<Entreprise> getAllEntreprise() {
		return entrepriseRepository.findAll();
	}

}
