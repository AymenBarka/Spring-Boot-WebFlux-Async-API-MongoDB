package com.example.SpringBootWebFluxAsyncAPIMongoDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Departement;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.services.DepartementService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DepartementController {
	
	@Autowired
	DepartementService departementService;
	
	@GetMapping("/getAllDepartements")
	public Flux<Departement> getAllDepartement() {
		return departementService.getAllDepartement();
	}
	
	@GetMapping("/getOneDepartement/{id}")
	public Mono<ResponseEntity<Departement>> getDepartement(@PathVariable("id") int id) {
		return departementService.getDepartement(id)
			     .map(ResponseEntity::ok)
			     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}	

	@PostMapping("/addDepartement")
	public Mono<Departement> addDepartement(@RequestBody Departement dept) {
		return departementService.addDepartement(dept);
	}
	
	@PostMapping("/updateDepartement/{id}")
	public Mono<ResponseEntity<Departement>> updateDepartement(@RequestBody Departement dept) {
		return departementService.updateDepartement(dept)
		.map(updateDepartement -> new ResponseEntity<Departement>(updateDepartement, HttpStatus.OK))
		.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/api/departement/{id}")
	public Mono<ResponseEntity<Void>> deleteDepartement(@PathVariable("id") int id) {
		return departementService.deleteDepartement(id).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)));
	}


}
