package com.example.SpringBootWebFluxAsyncAPIMongoDB.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Document

public class Departement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	private String nomDepartement;
	

	


	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomDepartement() {
		return nomDepartement;
	}

	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", nomDepartement=" + nomDepartement + "]";
	}
	
}
