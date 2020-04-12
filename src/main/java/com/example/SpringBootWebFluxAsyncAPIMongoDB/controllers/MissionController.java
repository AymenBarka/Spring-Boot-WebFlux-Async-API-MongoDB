package com.example.SpringBootWebFluxAsyncAPIMongoDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Mission;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.services.MissionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MissionController {
	
	
	@Autowired
	MissionService missionService;
	
	@GetMapping("/getAllMissions")
	public Flux<Mission> getAllMission() {
		return missionService.getAllMission();
	}
	
	@GetMapping("/getOneMission/{id}")
	public Mono<ResponseEntity<Mission>> getMission(@PathVariable("id") int id) {
		return missionService.getMission(id)
			     .map(ResponseEntity::ok)
			     .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}	

	@PostMapping("/addMission")
	public Mono<Mission> addMission(@RequestBody Mission mission) {
		return missionService.addMission(mission);
	}
	
	@PostMapping("/updateMission/{id}")
	public Mono<ResponseEntity<Mission>> updateMission(@RequestBody Mission mis) {
		return missionService.updateMission(mis)
		.map(updateMission -> new ResponseEntity<Mission>(updateMission, HttpStatus.OK))
		.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/api/mission/{id}")
	public Mono<ResponseEntity<Void>> deleteMission(@PathVariable("id") int id) {
		return missionService.deleteMission(id).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)));
	}


}
