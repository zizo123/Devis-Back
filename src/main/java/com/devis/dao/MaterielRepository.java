package com.devis.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devis.entities.Materiel;

public interface MaterielRepository extends JpaRepository<Materiel, Long>{

	
	@Query(value= "select m from Materiel m where m.NumMat like :x")
	public Page<Materiel> chercherMateriel(@Param("x")String mc, Pageable pageable);
	
	@Query(value= "select m from Materiel m where m.NumMat like :x or m.description like :x or m.marque like :x or m.typeMateriel like :x")
	public Page<Materiel> chercherMaterielByAll(@Param("x")String mc, Pageable pageable);
	
	@Query(value= "select m from Materiel m where m.fournisseurF.nom_f like :x")
	public Page<Materiel> chercherMaterielFournisseur(@Param("x")String mc, Pageable pageable);
	
	@Query(value= "select m from Materiel m where m.fournisseurF.nom_f like :x and m.NumMat like :y")
	public Page<Materiel> findMaterielFournisseur(@Param("x")String mc,@Param("y")String num, Pageable pageable);

}
