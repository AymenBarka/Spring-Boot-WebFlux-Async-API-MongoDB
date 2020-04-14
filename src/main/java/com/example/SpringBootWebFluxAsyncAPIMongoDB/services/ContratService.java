package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Contrat;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ContratService {
	public Mono<Contrat> addContrat(Contrat crt);
	public Mono<Contrat> updateContrat(Contrat crt, String id);
	public Mono<Void> deleteContrat(String crt);
	public Mono<Contrat> getContrat(String crt);
	public Flux<Contrat> getAllContrat();
}
