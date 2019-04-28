package com.devis.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@NamedQueries({
	@NamedQuery(name = "findAllFournisseurs", query = "select myFournisseur from Fournisseur myFournisseur"),
	@NamedQuery(name = "findFournisseurByAdresseF", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.adresse_f = ?1"),
	@NamedQuery(name = "findFournisseurByAdresseFContaining", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.adresse_f like ?1"),
	@NamedQuery(name = "findFournisseurByIdF", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.id_f = ?1"),
	@NamedQuery(name = "findFournisseurByNomF", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.nom_f = ?1"),
	@NamedQuery(name = "findFournisseurByNomFContaining", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.nom_f like ?1"),
	@NamedQuery(name = "findFournisseurByPrimaryKey", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.id_f = ?1"),
	@NamedQuery(name = "findFournisseurByTelephoneF", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.telephone_f = ?1"),
	@NamedQuery(name = "findFournisseurByTelephoneFContaining", query = "select myFournisseur from Fournisseur myFournisseur where myFournisseur.telephone_f like ?1") 
})
@Table(name = "FOURNISSEUR")
public class Fournisseur  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_f;
	
    @Column(name = "NOM_F", length = 50)
    @NotNull
    @Size(min = 3, max = 50)
   private String nom_f;
    
    
    @Column(name = "ADRESSE_F", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
   private String adresse_f;
    
    @Column(name = "TELEPHONE_F", length = 15)
    @NotNull
    @Size(min = 10, max = 15)
   private String telephone_f;
    
    @Column(name = "EMAIL_F")
    @NotNull
    @Size(min = 5, max = 100)
   private String email_f;
   
   @OneToMany(mappedBy="fournisseur", cascade = CascadeType.REMOVE)
   private Collection <OffreFournisseur> offrefournisseurF;
   
   
   @OneToMany(mappedBy="fournisseurD")
   private  Collection <Devis> devises;


	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId_f() {
		return id_f;
	}
	
	public void setId_f(Long id_f) {
		this.id_f = id_f;
	}
	
	public String getNom_f() {
		return nom_f;
	}
	
	public void setNom_f(String nom_f) {
		this.nom_f = nom_f;
	}
	

	
	public Fournisseur(String nom_f, String adresse_f, String telephone_f, String email_f) {
		super();
		this.nom_f = nom_f;
		this.adresse_f = adresse_f;
		this.telephone_f = telephone_f;
		this.email_f = email_f;
	}

	public String getEmail_f() {
		return email_f;
	}

	public void setEmail_f(String email_f) {
		this.email_f = email_f;
	}

	public String getAdresse_f() {
		return adresse_f;
	}
	
	public void setAdresse_f(String adresse_f) {
		this.adresse_f = adresse_f;
	}
	
	public String getTelephone_f() {
		return telephone_f;
	}
	
	public void setTelephone_f(String telephone_f) {
		this.telephone_f = telephone_f;
	}
	@JsonIgnore
	public Collection<OffreFournisseur> getOffrefournisseurF() {
		return offrefournisseurF;
	}
	@JsonSetter
	public void setOffrefournisseurF(Collection<OffreFournisseur> offrefournisseurF) {
		this.offrefournisseurF = offrefournisseurF;
	}

	public Collection<Devis> getDevises() {
		return devises;
	}

	public void setDevises(Collection<Devis> devises) {
		this.devises = devises;
	}
	
   
	
}