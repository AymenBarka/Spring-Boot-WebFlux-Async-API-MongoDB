package com.example.SpringBootWebFluxAsyncAPIMongoDB.entities;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="projet_DB")
public class Employe {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String nom;
	private String prenom;
	private Boolean isActif;
	private String email;
	private String role ;
	private String idContrat;
	private String idEntreprise;
	private String idMission;
	private String idDepartement;
	
	
	
	
	
	
	
	

	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	
	
	
	
	
	public String getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(String idContrat) {
		this.idContrat = idContrat;
	}
	
	
	public String getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(String idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public String getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(String idDepartement) {
		this.idDepartement = idDepartement;
	}
	
	
	
	public String getIdMission() {
		return idMission;
	}
	public void setIdMission(String idMission) {
		this.idMission = idMission;
	}
	
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", isActif=" + isActif + ", email=" + email
				+ ", role=" + role + ", idContrat=" + idContrat + ", idEntreprise=" + idEntreprise + ", idMission="
				+ idMission + ", idDepartement=" + idDepartement + "]";
	}
	
	
	
}
