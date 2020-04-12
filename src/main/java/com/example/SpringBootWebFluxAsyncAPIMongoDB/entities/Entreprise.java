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

public class Entreprise {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String raisonSociale;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getRaisonSociale() {
			return raisonSociale;
		}
		public void setRaisonSociale(String raisonSociale) {
			this.raisonSociale = raisonSociale;
		}
		@Override
		public String toString() {
			return "Entreprise [id=" + id + ", raisonSociale=" + raisonSociale + "]";
		}
		
		
}
