package com.example.SpringBootWebFluxAsyncAPIMongoDB.entities;


import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="projet_DB")
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String idEmploye;
	private String nom;
	private String prenom;
	private Boolean isActif;
	private String email;
	private Role role;
	private Contrat contrat;
	private Entreprise entreprise;
	private List<Mission> mission;
	private Departement departement;
	
	
	
	public String getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(String idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Boolean getIsActif() {
		return isActif;
	}
	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	public List<Mission> getMission() {
		return mission;
	}
	public void setMission(List<Mission> mission) {
		this.mission = mission;
	}
	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nom=" + nom + ", prenom=" + prenom + ", isActif=" + isActif
				+ ", email=" + email + ", role=" + role + ", contrat=" + contrat + ", entreprise=" + entreprise
				+ ", mission=" + mission + ", departement=" + departement + "]";
	}
	
	
	
}
