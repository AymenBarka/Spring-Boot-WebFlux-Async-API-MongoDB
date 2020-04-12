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
import com.example.SpringBootWebFluxAsyncAPIMongoDB.services.EmployeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeController {
	
	@Autowired
	EmployeService employeService;
	
	@GetMapping("/getAllEmploye")
	public Flux<Employe> getAllEmploye() {
		return employeService.getAllEmploye();
	}
	
	@GetMapping("/getOneEmploye/{id}")
	public Mono<ResponseEntity<Employe>> getEmploye(@PathVariable("id") int id) {
		return employeService.getEmploye(id)
			     .map(ResponseEntity::ok)
			     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}	

	@PostMapping("/addEmploye")
	public Mono<Employe> addEmploye(@RequestBody Employe employe) {
		return employeService.addEmploye(employe);
	}
	
	@PostMapping("/updateEmploye/{id}")
	public Mono<ResponseEntity<Employe>> updateEmploye(@RequestBody Employe employe) {
		return employeService.updateEmploye(employe)
		.map(updateEmploye -> new ResponseEntity<Employe>(updateEmploye, HttpStatus.OK))
		.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/api/employe/{id}")
	public Mono<ResponseEntity<Void>> deleteEmploye(@PathVariable("id") int id) {
		return employeService.deleteEmploye(id).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)));
	}

}
