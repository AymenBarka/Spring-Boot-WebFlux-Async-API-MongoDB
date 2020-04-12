package com.example.SpringBootWebFluxAsyncAPIMongoDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Employe;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Entreprise;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.services.EntrepriseService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EntrepriseController {
	
	@Autowired
	EntrepriseService entrepriseService;
	
	@GetMapping("/getAllEntreprises")
	public Flux<Entreprise> getAllEntreprise() {
		return entrepriseService.getAllEntreprise();
	}
	
	@GetMapping("/getOneEntreprise/{id}")
	public Mono<ResponseEntity<Entreprise>> getEntreprise(@PathVariable("id") int id) {
		return entrepriseService.getEntreprise(id)
			     .map(ResponseEntity::ok)
			     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}	

	@PostMapping("/addEntreprise")
	public Mono<Entreprise> addEntreprise(@RequestBody Entreprise ent) {
		return entrepriseService.addEntreprise(ent);
	}
	
	@PostMapping("/updateEntreprise/{id}")
	public Mono<ResponseEntity<Entreprise>> updateEntreprise(@RequestBody Entreprise ent) {
		return entrepriseService.updateEntreprise(ent)
		.map(updateEntreprise -> new ResponseEntity<Entreprise>(updateEntreprise, HttpStatus.OK))
		.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/api/entreprise/{id}")
	public Mono<ResponseEntity<Void>> deleteEntreprise(@PathVariable("id") int id) {
		return entrepriseService.deleteEntreprise(id).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)));
	}


}
