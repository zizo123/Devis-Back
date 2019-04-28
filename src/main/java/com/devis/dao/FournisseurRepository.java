package com.devis.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devis.entities.Fournisseur;



public interface FournisseurRepository extends JpaRepository<Fournisseur, Long>{
	
	@Query(value= "select m from Fournisseur m where m.nom_f like :x")
	public Page<Fournisseur> chercherFournisseur(@Param("x")String mc, Pageable pageable);
}
