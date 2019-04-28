package com.devis.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devis.dao.FournisseurRepository;
import com.devis.entities.Fournisseur;
import com.devis.metier.FournisseurMetier;
@Service
public class FournisseurMetierImpl  implements FournisseurMetier{

	@Autowired
	private FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> listFournisseur() {
		return fournisseurRepository.findAll();
	}
	//
	@Override
	public Page<Fournisseur> listFournisseurPage(int page,int size) {
		return fournisseurRepository.findAll(new PageRequest(page, size));
	}
	
	@Override
	public Page<Fournisseur> chercherFournisseur(String mc,int page,int size) {
		return fournisseurRepository.chercherFournisseur("%"+mc+"%", new PageRequest(page, size));
	}
	//
	@Override
	public Fournisseur getFournisseurById(Long id_f) {
		return fournisseurRepository.findOne(id_f);
	}

	@Override
	public Fournisseur saveFournisseur(Fournisseur fournisseur) {
		return fournisseurRepository.save(fournisseur);
	}


	@Override
	public void deleteFournisseurById(Fournisseur fournisseur) {
		fournisseurRepository.delete(fournisseur);
	}

}
