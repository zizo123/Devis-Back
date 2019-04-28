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

import com.devis.dao.DevisRepository;
import com.devis.dao.FournisseurRepository;
import com.devis.entities.Devis;
import com.devis.entities.Fournisseur;
import com.devis.metier.impl.DevisMetierImpl;
import com.devis.metier.impl.FournisseurMetierImpl;

public class FournisseurServiceTest {
	@Mock
	private FournisseurRepository fournisseurRepository;
	
	*//**
	 * The service being tested, injected by Spring.
	 *//*
	@InjectMocks
	private FournisseurMetierImpl fournisseurService;
	
	*//**
	 * The Spring injection is initiaslized
	 *//*
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}

	@Autowired
	protected DevisMetier service;

	*//**
	 * Operation Unit Test
	* Return a list of all Devis entity
	* 
	 *//*
	@Test
	public void listDevis() {
		List<Fournisseur> fournisseurList = new ArrayList<Fournisseur>();
		fournisseurList.add( new Fournisseur("ham","crest", "app 4 immeuble 5 hay riad", "064578645633") );
		fournisseurList.add( new Fournisseur("ham2","crest2", "app 5 immeuble 4 hay riad", "064570045600") );
		
		when(fournisseurRepository.findAll()).thenReturn(fournisseurList);
		List<Fournisseur> result = fournisseurService.listFournisseur();
		assertEquals(2, result.size());		
	}
	
	*//**
	 * Operation Unit Test
	* chercherFournisseur: entity
	* 
	@Test
	public void chercherFournisseur() {
		
	}*//*
	
	*//**
	 * Operation Unit Test
	* Save an existing Fournisseur entity
	* 
	 *//*
	@Test
	public void saveFournisseur() {
		Fournisseur fournisseur = new Fournisseur("ham","crest", "app 4 immeuble 5 hay riad", "064578645633");
		when(fournisseurRepository.save(fournisseur)).thenReturn(fournisseur);
		// TODO: JUnit - Populate test inputs for operation: saveFournisseur 
		Fournisseur result = fournisseurService.saveFournisseur(fournisseur);
		assertEquals("ham", result.getNom_f() );
		assertEquals("app 4 immeuble 5 hay riad", result.getAdresse_f() );
		assertEquals("064578645633", result.getTelephone_f() );

	}

	*//**
	 * Operation Unit Test
	* Delete an existing Fournisseur entity
	*//* 
	
	@Test
	public void deleteFournisseur() {
		Fournisseur fournisseur=new Fournisseur("ham","crest", "app 4 immeuble 5 hay riad", "064578645633");
		fournisseurService.deleteFournisseurById(fournisseur);
        verify(fournisseurRepository, times(1)).delete(fournisseur);
	} 
	
	@Test
	public void chercherFournisseur() {
		Fournisseur devis=new Fournisseur(13, "jil3", null, "valide", null);

	} 
	
	@Test
	public void findFournisseurById() {
		Fournisseur fournisseur = new Fournisseur("ham","crest", "app 4 immeuble 5 hay riad", "064578645633");
		when(fournisseurRepository.findOne(1L)).thenReturn(fournisseur);

		Fournisseur result = fournisseurService.getFournisseurById(1L);
		assertEquals("ham", result.getNom_f() );
		assertEquals("app 4 immeuble 5 hay riad", result.getAdresse_f() );
		assertEquals("064578645633", result.getTelephone_f() );
	}


}
*/