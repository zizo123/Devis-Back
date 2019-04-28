package com.devis.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@NamedQuery(name = "findAllMateriels", query = "select myMateriel from Materiel myMateriel"),
	@NamedQuery(name = "findMaterielByDescription", query = "select myMateriel from Materiel myMateriel where myMateriel.description = ?1"),
	@NamedQuery(name = "findMaterielByDescriptionContaining", query = "select myMateriel from Materiel myMateriel where myMateriel.description like ?1"),
	@NamedQuery(name = "findMaterielByIdMateriel", query = "select myMateriel from Materiel myMateriel where myMateriel.id_materiel = ?1"),
	@NamedQuery(name = "findMaterielByMarque", query = "select myMateriel from Materiel myMateriel where myMateriel.marque = ?1"),
	@NamedQuery(name = "findMaterielByMarqueContaining", query = "select myMateriel from Materiel myMateriel where myMateriel.marque like ?1"),
	@NamedQuery(name = "findMaterielByNummat", query = "select myMateriel from Materiel myMateriel where myMateriel.NumMat = ?1"),
	@NamedQuery(name = "findMaterielByNummatContaining", query = "select myMateriel from Materiel myMateriel where myMateriel.NumMat like ?1"),
	@NamedQuery(name = "findMaterielByPrimaryKey", query = "select myMateriel from Materiel myMateriel where myMateriel.id_materiel = ?1"),
	@NamedQuery(name = "findMaterielByPrixmateriel", query = "select myMateriel from Materiel myMateriel where myMateriel.prixMateriel = ?1"),
	@NamedQuery(name = "findMaterielByTypemateriel", query = "select myMateriel from Materiel myMateriel where myMateriel.typeMateriel = ?1") 
})
@Table(name = "MATERIEL")
public class Materiel  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_materiel;
	
    @Column(name = "NUMMAT")
    @NotNull
	 private String NumMat;
    
    @Column(name = "PRIXMATERIEL")
    @NotNull
	   private float prixMateriel;
	   
    @Column(name = "DESCRIPTION")
    @NotNull
	   private String description;
	   /*private String statut;
	    * private String nom;
	    * */
    @Column(name = "MARQUE", length = 20)
    @NotNull
    @Size(min = 1, max = 20)
	   private String marque;
    
    @Column(name = "TYPEMATERIEL", length = 20)
    @NotNull
    @Size(min = 4, max = 20)
	   private String typeMateriel;
    
    @OneToMany(mappedBy="materiel", cascade = CascadeType.REMOVE)
    private Collection <OffreFournisseur> offrefournisseurM;
    //code ajoute
    @ManyToOne
    @JoinColumn(name="fourn_materiel")
    private Fournisseur fournisseurF;
	
	   public Materiel(String numMat, String description, String marque, String typeMateriel,
			float prixMateriel) {
		super();
		this.NumMat = numMat;
		this.description = description;
		this.marque = marque;
		this.typeMateriel = typeMateriel;
		this.prixMateriel = prixMateriel;
	}
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId_materiel() {
		return id_materiel;
	}
	public void setId_materiel(Long id_materiel) {
		this.id_materiel = id_materiel;
	}
	public String getNumMat() {
		return NumMat;
	}
	public void setNumMat(String numMat) {
		NumMat = numMat;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getTypeMateriel() {
		return typeMateriel;
	}
	public void setTypeMateriel(String typeMateriel) {
		this.typeMateriel = typeMateriel;
	}
	public float getPrixMateriel() {
		return prixMateriel;
	}
	public void setPrixMateriel(float prixMateriel) {
		this.prixMateriel = prixMateriel;
	}
	@JsonIgnore
	public Collection<OffreFournisseur> getOffrefournisseurM() {
		return offrefournisseurM;
	}
	@JsonSetter
	public void setOffrefournisseurM(Collection<OffreFournisseur> offrefournisseurM) {
		this.offrefournisseurM = offrefournisseurM;
	}
	@JsonIgnore
	public Fournisseur getFournisseurF() {
		return fournisseurF;
	}
	@JsonSetter
	public void setFournisseurF(Fournisseur fournisseurF) {
		this.fournisseurF = fournisseurF;
	}
	
}