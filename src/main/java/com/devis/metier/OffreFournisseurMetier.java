package com.devis.metier;

import java.util.List;


import com.devis.entities.OffreFournisseur;


public interface OffreFournisseurMetier {

	public List<OffreFournisseur> listOffreF();
	public OffreFournisseur getOffreFById(Long id_offre);
	public OffreFournisseur saveOffreF(OffreFournisseur offreF);
	public void deleteOffreFById(OffreFournisseur offreF);
	
	
	public List<OffreFournisseur> getOffreParFournisseur(String mc,long num);
	
	public void saveListOffre(List<OffreFournisseur> listOffre);
	public void updateListOffre(List<OffreFournisseur> listOffre);
}
