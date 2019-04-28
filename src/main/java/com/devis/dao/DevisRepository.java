package com.devis.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devis.entities.Devis;

public interface DevisRepository extends JpaRepository<Devis, Long>{
	
	@Query(value= "select m from Devis m where m.reference like :x")
	public Page<Devis> chercherDevis(@Param("x")String mc, Pageable pageable);
	
	@Query(value= "select d from Devis d where d.fournisseurD.nom_f like :x")
	public Page<Devis> chercherDevisFournisseur(@Param("x")String mc, Pageable pageable);

}
