package com.example.SpringBootWebFluxAsyncAPIMongoDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Contrat;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.services.ContratService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ContratController {
	
	@Autowired
	ContratService contratService;
	
	@GetMapping("/getAllContrat")
	public Flux<Contrat> getAllContrat() {
		return contratService.getAllContrat();
	}
	
	@GetMapping("/getOneContrat/{id}")
	public Mono<ResponseEntity<Contrat>> getContrat(@PathVariable("id") int id) {
		return contratService.getContrat(id)
			     .map(ResponseEntity::ok)
			     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}	

	@PostMapping("/addContrat")
	public Mono<Contrat> addContrat(@RequestBody Contrat crt) {
		return contratService.addContrat(crt);
	}
	
	@PostMapping("/updateContrat/{id}")
	public Mono<ResponseEntity<Contrat>> updateContrat(@RequestBody Contrat crt) {
		return contratService.updateContrat(crt)
		.map(updateContrat -> new ResponseEntity<Contrat>(updateContrat, HttpStatus.OK))
		.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/api/contrat/{id}")
	public Mono<ResponseEntity<Void>> deleteContrat(@PathVariable("id") int id) {
		return contratService.deleteContrat(id).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)));
	}


}
