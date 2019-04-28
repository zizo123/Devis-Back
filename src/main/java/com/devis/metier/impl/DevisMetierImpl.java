package com.devis.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devis.dao.DevisRepository;
import com.devis.entities.Devis;
import com.devis.metier.DevisMetier;
@Service
public class DevisMetierImpl  implements DevisMetier{

	@Autowired
	private DevisRepository devisRepository;
	
	@Override
	public List<Devis> listDevis() {
		return devisRepository.findAll();
	}
	//
	@Override
	public Page<Devis> listDevisPage(int page,int size) {
		return devisRepository.findAll(new PageRequest(page, size));
	}
	
	@Override
	public Page<Devis> chercherDevis(String mc,int page,int size) {
		return devisRepository.chercherDevis("%"+mc+"%", new PageRequest(page, size));
	}
	//
	@Override
	public Devis getDevisById(Long id_devis) {
		return devisRepository.findOne(id_devis);
	}

	@Override
	public Devis saveDevis(Devis m) {
		return devisRepository.save(m);
	}


	@Override
	public void deleteDevisById(Devis devis) {
		devisRepository.delete(devis);
	}
	@Override
	public Page<Devis> chercherDevisFournisseur(String mc, int page, int size) {
		return devisRepository.chercherDevisFournisseur("%"+mc+"%", new PageRequest(page, size));
	}

}
