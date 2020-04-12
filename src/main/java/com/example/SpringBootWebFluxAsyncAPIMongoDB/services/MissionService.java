package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;


import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Mission;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface MissionService {
	public Mono<Mission> addMission(Mission mis);
	public Mono<Mission> updateMission(Mission mis);
	public Mono<Void> deleteMission(int mis);
	public Mono<Mission> getMission(int mis);
	public Flux<Mission> getAllMission();
}
