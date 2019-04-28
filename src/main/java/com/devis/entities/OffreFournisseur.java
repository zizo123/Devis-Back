package com.devis.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;


@Entity
@NamedQueries({
	@NamedQuery(name = "findAllOffreFournisseurs", query = "select myOffreFournisseur from OffreFournisseur myOffreFournisseur"),
	@NamedQuery(name = "findOffreFournisseurByIdOffre", query = "select myOffreFournisseur from OffreFournisseur myOffreFournisseur where myOffreFournisseur.id_offre = ?1"),
	@NamedQuery(name = "findOffreFournisseurByPrimaryKey", query = "select myOffreFournisseur from OffreFournisseur myOffreFournisseur where myOffreFournisseur.id_offre = ?1"),
	@NamedQuery(name = "findOffreFournisseurByPrixfournisseur", query = "select myOffreFournisseur from OffreFournisseur myOffreFournisseur where myOffreFournisseur.prixFournisseur = ?1"),
	@NamedQuery(name = "findOffreFournisseurByQte", query = "select myOffreFournisseur from OffreFournisseur myOffreFournisseur where myOffreFournisseur.qte = ?1") 
})
public class OffreFournisseur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9143151998757058679L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
   private Long id_offre;
   
    @Column(name = "QTE", length = 10)
    @NotNull
   private int qte;
    
    @Column(name = "PRIXFOURNISSEUR", length = 10)
    @NotNull
   private float prixFournisseur;
   
   @ManyToOne
   @JoinColumn(name="ID_mater_OfrFourni")
   private Materiel materiel; 

   @ManyToOne
   @JoinColumn(name="ID_fourn_OfrFourni")
   private Fournisseur fournisseur; 
   
   @ManyToOne
   @JoinColumn(name="ID_devis_offre")
   private Devis devis;

	public OffreFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public float getPrixFournisseur() {
		return prixFournisseur;
	}

	public void setPrixFournisseur(float prixFournisseur) {
		this.prixFournisseur = prixFournisseur;
	}

	public Materiel getMateriel() {
		return materiel;
	}
	
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	
	public OffreFournisseur(Long id_offre, Fournisseur fournisseur, Devis devis) {
		super();
		this.id_offre = id_offre;
		this.fournisseur = fournisseur;
		this.devis = devis;
	}
	
	

	public OffreFournisseur(int qte, float prixFournisseur, Materiel materiel, Fournisseur fournisseur, Devis devis) {
		super();
		this.qte = qte;
		this.prixFournisseur = prixFournisseur;
		this.materiel = materiel;
		this.fournisseur = fournisseur;
		this.devis = devis;
	}

	public Long getId_offre() {
		return id_offre;
	}
	
	public void setId_offre(Long id_offre) {
		this.id_offre = id_offre;
	}
	
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	public Devis getDevis() {
		return devis;
	}
	
	public void setDevis(Devis devis) {
		this.devis = devis;
	}
	
	   
		
}