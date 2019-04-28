package com.devis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.devis.entities.OffreFournisseur;


@Repository
public interface OffreFournisseurRepository extends JpaRepository<OffreFournisseur, Long>{
	
	//selectionne les materiaux et les offres faites par un fournisseur donne  existant sur le meme devis
	@Query(value= "SELECT ofr from OffreFournisseur ofr  WHERE ofr.fournisseur.nom_f like :x and ofr.devis.id_devis like :y")
	public List<OffreFournisseur> getOffreParFournisseur(@Param("x")String mc,@Param("y")long num);
	
	}
