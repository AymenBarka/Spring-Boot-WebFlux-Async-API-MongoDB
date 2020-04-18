package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Entreprise;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface EntrepriseService {
	public Mono<Entreprise> addEntreprise(Entreprise ent);
	public Mono<Entreprise> updateEntreprise(Entreprise ent, String id);
	public Mono<Void> deleteEntreprise(String ent);
	public Mono<Entreprise> getEntreprise(String ent);
	public Flux<Entreprise> getAllEntreprise();
}
