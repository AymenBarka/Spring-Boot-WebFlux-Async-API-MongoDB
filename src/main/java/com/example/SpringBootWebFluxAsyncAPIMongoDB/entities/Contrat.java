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

public class Contrat {

	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private String id;
		private String dateDebut;
		private String typeContrat;
		private int salaire;
		
		
		
		
		
		
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDateDebut() {
			return dateDebut;
		}
		public void setDateDebut(String dateDebut) {
			this.dateDebut = dateDebut;
		}
		public String getTypeContrat() {
			return typeContrat;
		}
		public void setTypeContrat(String typeContrat) {
			this.typeContrat = typeContrat;
		}
		public int getSalaire() {
			return salaire;
		}
		public void setSalaire(int salaire) {
			this.salaire = salaire;
		}
		@Override
		public String toString() {
			return "Contrat [id=" + id + ", dateDebut=" + dateDebut + ", typeContrat=" + typeContrat + ", salaire="
					+ salaire + "]";
		}
		
		
		
}
