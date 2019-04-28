package com.devis.metier.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devis.dao.OffreFournisseurRepository;
import com.devis.entities.OffreFournisseur;
import com.devis.metier.OffreFournisseurMetier;
@Service
public class OffreFournisseurMetierImpl  implements OffreFournisseurMetier{

	@Autowired
	private OffreFournisseurRepository offreFournisseurRepository;
	
	@Override
	public List<OffreFournisseur> listOffreF() {
		return offreFournisseurRepository.findAll();
	}

	@Override
	public OffreFournisseur getOffreFById(Long id_offre) {
		return offreFournisseurRepository.findOne(id_offre);
	}

	@Override
	public OffreFournisseur saveOffreF(OffreFournisseur offreFournisseur) {
		return offreFournisseurRepository.save(offreFournisseur);
	}

	@Override
	public void deleteOffreFById(OffreFournisseur offreFournisseur) {
		offreFournisseurRepository.delete(offreFournisseur);
		
	}

	/*@Override
	public List<OffreFournisseur> getOffreParMateriel(String mc) {
		return offreFournisseurRepository.getOffreParMateriel("%"+mc+"%");
	}*/

	@Override
	public List<OffreFournisseur> getOffreParFournisseur(String mc,long num) {
		return offreFournisseurRepository.getOffreParFournisseur("%"+mc+"%",num);
	}

	@Override
	public void saveListOffre(List<OffreFournisseur> listOffre) {
		 offreFournisseurRepository.save(listOffre);
	}

	@Override
	public void updateListOffre(List<OffreFournisseur> listOffre) {
		 offreFournisseurRepository.save(listOffre);
	}








}
