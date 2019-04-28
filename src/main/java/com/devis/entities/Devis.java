package com.devis.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "findAllDevis", query = "select myDevis from Devis myDevis"),
	@NamedQuery(name = "findDevisByDatecreation", query = "select myDevis from Devis myDevis where myDevis.dateCreation = ?1"),
	@NamedQuery(name = "findDevisByEtatDevis", query = "select myDevis from Devis myDevis where myDevis.etat_devis = ?1"),
	@NamedQuery(name = "findDevisByEtatDevisContaining", query = "select myDevis from Devis myDevis where myDevis.etat_devis like ?1"),
	@NamedQuery(name = "findDevisByIdDevis", query = "select myDevis from Devis myDevis where myDevis.id_devis = ?1"),
	@NamedQuery(name = "findDevisByPrimaryKey", query = "select myDevis from Devis myDevis where myDevis.id_devis = ?1"),
	@NamedQuery(name = "findDevisByReference", query = "select myDevis from Devis myDevis where myDevis.reference = ?1"),
	@NamedQuery(name = "findDevisByReferenceContaining", query = "select myDevis from Devis myDevis where myDevis.reference like ?1")
})
@Table(name = "DEVIS")
public class Devis  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Id 
	@Column(name = "ID_DEVIS")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_devis;
	
	
    //@NotNull
	@Column(name = "REFERENCE", length = 50)
    @Size(min = 4, max = 50)
    private String reference;
	
    @Column(name = "DATECREATION")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    
    //@Column(name = "ETAT_DEVIS")
    //@NotNull
    @Column(name = "ETAT_DEVIS")
    private String etat_devis;
    
    //A Ajouter fetch=FetchType.EAGER
//   @OneToMany(mappedBy="devis")
//   private Collection <OffreFournisseur> offrefournisseurD;
   
   //code ajoute 
   @ManyToOne
   @JoinColumn(name="fourn_devis")
   private Fournisseur fournisseurD;

	public Devis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Devis(String reference, Date dateCreation, String etat_devis) {
		super();
		this.reference = reference;
		this.dateCreation = dateCreation;
		this.etat_devis = etat_devis;
	}
	
	public Long getId_devis() {
		return id_devis;
	}
	
	public void setId_devis(Long id_devis) {
		this.id_devis = id_devis;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public String getEtat_devis() {
		return etat_devis;
	}
	
	public void setEtat_devis(String etat_devis) {
		this.etat_devis = etat_devis;
	}
//	@JsonIgnore
//	public Collection<OffreFournisseur> getOffrefournisseurD() {
//		return offrefournisseurD;
//	}
//	@JsonSetter
//	public void setOffrefournisseurD(Collection<OffreFournisseur> offrefournisseurD) {
//		this.offrefournisseurD = offrefournisseurD;
//	}
	@JsonIgnore
	public Fournisseur getFournisseurD() {
		return fournisseurD;
	}
	@JsonSetter
	public void setFournisseurD(Fournisseur fournisseurD) {
		this.fournisseurD = fournisseurD;
	}
	
	
	   

}