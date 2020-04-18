package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Mission;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface MissionService {
	public Mono<Mission> addMission(Mission mis);
	public Mono<Mission> updateMission(Mission mis, String id);
	public Mono<Void> deleteMission(String mis);
	public Mono<Mission> getMission(String mis);
	public Flux<Mission> getAllMission();
}
