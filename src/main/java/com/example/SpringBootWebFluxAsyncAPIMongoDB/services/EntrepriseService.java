package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Entreprise;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface EntrepriseService {
	public Mono<Entreprise> addEntreprise(Entreprise ent);
	public Mono<Entreprise> updateEntreprise(Entreprise ent);
	public Mono<Void> deleteEntreprise(int ent);
	public Mono<Entreprise> getEntreprise(int ent);
	public Flux<Entreprise> getAllEntreprise();
}
