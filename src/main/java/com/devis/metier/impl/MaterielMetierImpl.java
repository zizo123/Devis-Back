package com.devis.metier.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import com.devis.dao.MaterielRepository;
import com.devis.entities.Materiel;
import com.devis.metier.MaterielMetier;
@Service
public class MaterielMetierImpl implements MaterielMetier{
	@Autowired
	private MaterielRepository materielRepository;
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Materiel> listMateriel() {
		return materielRepository.findAll();
	}
	
	@Override
	public Page<Materiel> listMaterielPage(int page,int size) {
		return materielRepository.findAll(new PageRequest(page, size));
	}
	
	@Override
	public Page<Materiel> chercherMateriel(String mc,int page,int size) {
		return materielRepository.chercherMateriel("%"+mc+"%", new PageRequest(page, size));
	}
	
	/*@Override
	public Page<Materiel> chercherMaterielParLibelle(String attribue, String mc, int page, int size) {
		return materielRepository.chercherMaterielParLibelle("%"+attribue+"%", "%"+mc+"%", new PageRequest(page, size));
	}*/
	
	@Override
	public Materiel getMaterielById(Long id_materiel) {
		return materielRepository.findOne(id_materiel);
	}


	@Override
	public void deleteMaterielById(Materiel materiel) {
		materielRepository.delete(materiel);
	}

	@Override
	public Materiel saveMateriel(Materiel materiel) {
		return materielRepository.save(materiel);
	}

	@Override
	public Page<Materiel> chercherMaterielFournisseur(String mc, int page, int size) {
		return materielRepository.chercherMaterielFournisseur("%"+mc+"%",  new PageRequest(page, size));
	}

	@Override
	public Page<Materiel> findMaterielFournisseur(String mc, String num, int page, int size) {
		return materielRepository.findMaterielFournisseur("%"+mc+"%", "%"+num+"%", new PageRequest(page, size));
	}

	@Override
	public Page<Materiel> chercherMaterielByAll(String mc, int page, int size) {
		return materielRepository.chercherMaterielByAll("%"+mc+"%", new PageRequest(page, size));
	}



}
