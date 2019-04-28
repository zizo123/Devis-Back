/*package com.devis.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import com.devis.dao.MaterielRepository;
import com.devis.entities.Materiel;
import com.devis.metier.impl.MaterielMetierImpl;

public class MaterielServiceTest {
	@Mock
	private MaterielRepository materielRepository;
	
	*//**
	 * The service being tested, injected by Spring.
	 *//*
	@InjectMocks
	private MaterielMetierImpl materielService;
	
	*//**
	 * The Spring injection is initiaslized
	 *//*
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}

	@Autowired
	protected MaterielMetier service;

	*//**
	 * Operation Unit Test
	* Return a list of all Materiel entity
	* 
	 *//*
	@Test
	public void listMateriel() {
		List<Materiel> materielList = new ArrayList<Materiel>();
		materielList.add( new Materiel("ASD123", "tres bon etat", "HP", "pc fixe", 1200) );
		materielList.add( new Materiel("ASD123", "bonuchi etat", "HP 2", "pc portable", 1750) );
		
		when(materielRepository.findAll()).thenReturn(materielList);
		List<Materiel> result = materielService.listMateriel();
		assertEquals(2, result.size());
		// TODO: JUnit - Add assertions to test outputs of operation: countMateriels
		
	}
	
	*//**
	 * Operation Unit Test
	* chercherMateriel: entity
	* 
	 
	@Test
	public void chercherMateriel() {
		
	}*//*

	*//**
	 * Operation Unit Test
	* Save an existing Materiel entity
	* ---- ERREUR ----
	 *//*
	@Test
	public void saveMateriel() {
		Materiel materiel = new Materiel("ASD123","tres bon etat", "HP", "pc fixe", 1200);
		when(materielRepository.save(materiel)).thenReturn(materiel);
		 
		Materiel result = materielService.saveMateriel(materiel);

		assertEquals("ASD123", result.getNumMat() );
		assertEquals("tres bon etat", result.getDescription() );
		assertEquals("HP", result.getMarque() );
		assertEquals("pc fixe", result.getTypeMateriel() );
		
	}

	*//**
	 * Operation Unit Test
	* Delete an existing Materiel entity
	*//* 
	
	@Test
	public void deleteMateriel() {
		Materiel materiel=new Materiel("ASD123", "tres bon etat", "HP", "pc fixe", 1200);
		materielService.deleteMaterielById(materiel);
        verify(materielRepository, times(1)).delete(materiel);
	} 
	
	@Test
	public void chercherMateriel() {
		Materiel Materiel=new Materiel(13, "jil3", null, "valide", null);

	} 
	
	@Test
	public void findMaterielById() {
		Materiel materiel = new Materiel( "ASD123","tres bon etat", "HP", "pc fixe", 1200);
		when(materielRepository.findOne(1L)).thenReturn(materiel);

		Materiel result = materielService.getMaterielById(1L);
		assertEquals("ASD123", result.getNumMat() );
		assertEquals("tres bon etat", result.getDescription() );
		assertEquals("HP", result.getMarque() );
		assertEquals("pc fixe", result.getTypeMateriel() );

	}


}
*/