package com.devis.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devis.entities.Devis;


public interface DevisMetier {

	public List<Devis> listDevis();
	public Devis getDevisById(Long id_devis);
	public Devis saveDevis(Devis devis);
	public void deleteDevisById(Devis devis);
	public Page<Devis> listDevisPage(int page, int size);
	public Page<Devis> chercherDevis(String mc, int page, int size);
	public Page<Devis> chercherDevisFournisseur(String mc, int page, int size);
	
}
