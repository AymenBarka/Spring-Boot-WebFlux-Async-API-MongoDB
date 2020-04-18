package com.example.SpringBootWebFluxAsyncAPIMongoDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public Mono<ResponseEntity<Employe>> getEmploye(@PathVariable(value="id") String id) {
		return employeService.getEmploye(id)
			     .map(ResponseEntity::ok)
			     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}	

	@PostMapping("/addEmploye")
	public Mono<Employe> addEmploye(@RequestBody Employe employe) {
		return employeService.addEmploye(employe);
	}
	
	@PostMapping("/updateEmploye/{id}")
	public Mono<ResponseEntity<Employe>> updateEmploye( @RequestBody Employe employe,@PathVariable(value="id") String id) {
		return employeService.updateEmploye(employe, id)
		.map(updateEmploye -> new ResponseEntity<Employe>(updateEmploye, HttpStatus.OK))
		.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@DeleteMapping("/deleteEmploye/{id}")
	public Mono<ResponseEntity<Employe>> deleteEmploye(@PathVariable("id") String id) {
		return employeService.deleteEmploye(id).then(Mono.just(new ResponseEntity<Employe>(HttpStatus.OK)));
	}
    @GetMapping("/affectEmployeToContrat/{idEmp}/{idCrt}")
	public Mono<Employe> affectContToEmp(@PathVariable (value="idCrt")String idCrt, @PathVariable (value="idEmp")String idEmp) {
		return employeService.affectContToEmp(idCrt, idEmp);
	}

    @GetMapping("/affectEmployeToDepartement/{idEmp}/{idDept}")
	public Mono<Employe> affectDeptToEmp(@PathVariable(value="idDept")String idDept, @PathVariable(value="idEmp")String idEmp) {
		return employeService.affectDeptToEmp(idDept, idEmp);
	}
    
    @GetMapping("/affectEmployeToEntreprise/{idEmp}/{idEnt}")
	public Mono<Employe> affectEntToEmp(@PathVariable(value="idEnt")String idEnt,@PathVariable(value="idEmp") String idEmp) {
		return employeService.affectEntToEmp(idEnt, idEmp);
	}
    
    @GetMapping("/affectEmployeToMission/{idEmp}/{idMiss}")
	public Mono<Employe> affectMissToEmp(@PathVariable(value="idMiss")String idMiss, @PathVariable(value="idEmp")String idEmp) {
		return employeService.affectMissToEmp(idMiss, idEmp);
	}
    
}
