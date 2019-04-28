package com.devis.metier;

import java.util.List;

import org.springframework.data.domain.Page;


import com.devis.entities.Fournisseur;


public interface FournisseurMetier {

	public List<Fournisseur> listFournisseur();
	public Fournisseur getFournisseurById(Long id_f);
	public Fournisseur saveFournisseur(Fournisseur fournisseur);
	public void deleteFournisseurById(Fournisseur fournisseur);
	public Page<Fournisseur> listFournisseurPage(int page, int size);
	public Page<Fournisseur> chercherFournisseur(String mc, int page, int size);
	
}
