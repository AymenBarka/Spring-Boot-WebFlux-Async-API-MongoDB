package com.example.SpringBootWebFluxAsyncAPIMongoDB.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootWebFluxAsyncAPIMongoDB.entities.Mission;
import com.example.SpringBootWebFluxAsyncAPIMongoDB.repositories.MissionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service(value = "missionService")
public class MissionServiceIMPL implements MissionService {
    @Autowired
	MissionRepository missionRepository;

	@Override
	public Mono<Mission> addMission(Mission mis) {
		return missionRepository.save(mis);
	}

	@Override
	public Mono<Mission> updateMission(Mission mis) {
		return missionRepository.save(mis);
	}

	@Override
	public Mono<Void> deleteMission(int mis) {
		return missionRepository.deleteById(mis);
	}

	@Override
	public Mono<Mission> getMission(int mis) {
		return missionRepository.findById(mis);
	}

	@Override
	public Flux<Mission> getAllMission() {
		return missionRepository.findAll();
	}
}
