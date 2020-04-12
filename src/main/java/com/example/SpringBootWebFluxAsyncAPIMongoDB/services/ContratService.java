package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Contrat;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ContratService {
	public Mono<Contrat> addContrat(Contrat crt);
	public Mono<Contrat> updateContrat(Contrat crt);
	public Mono<Void> deleteContrat(int crt);
	public Mono<Contrat> getContrat(int crt);
	public Flux<Contrat> getAllContrat();
}
