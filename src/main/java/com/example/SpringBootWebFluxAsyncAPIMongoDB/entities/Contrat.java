package com.example.SpringBootWebFluxAsyncAPIMongoDB.entities;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Document

public class Contrat {

	    @Id
		private String idContrat;
		private String dateDebut;
		private String typeContrat;
		private int salaire;
		
		
		
		
		
		
		public String getIdContrat() {
			return idContrat;
		}
		public void setIdContrat(String idContrat) {
			this.idContrat = idContrat;
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
			return "Contrat [idContrat=" + idContrat + ", dateDebut=" + dateDebut + ", typeContrat=" + typeContrat
					+ ", salaire=" + salaire + "]";
		}
		
		
		
}
