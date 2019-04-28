package com.devis.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devis.entities.Materiel;


public interface MaterielMetier {
	
	public List<Materiel> listMateriel();
	public Materiel getMaterielById(Long id_materiel);
	public Materiel saveMateriel(Materiel materiel);
	public void deleteMaterielById(Materiel materiel);
	public Page<Materiel> listMaterielPage(int page, int size);
	public Page<Materiel> chercherMateriel(String mc, int page, int size);
	public Page<Materiel> chercherMaterielByAll(String mc, int page, int size);
	public Page<Materiel> chercherMaterielFournisseur(String mc,int page, int size);
	public Page<Materiel> findMaterielFournisseur(String mc,String num, int page, int size);
	
}
