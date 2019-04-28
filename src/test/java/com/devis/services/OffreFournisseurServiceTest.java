/*package com.devis.services;
import static org.junit.Assert.*;
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

import com.devis.dao.OffreFournisseurRepository;
import com.devis.entities.OffreFournisseur;
import com.devis.metier.impl.OffreFournisseurMetierImpl;



public class OffreFournisseurServiceTest {
	@Mock
	private OffreFournisseurRepository offreFournisseurRepository;
	
	*//**
	 * The service being tested, injected by Spring.
	 *//*
	@InjectMocks
	private OffreFournisseurMetierImpl offreFournisseurService;
	
	*//**
	 * The Spring injection is initiaslized
	 *//*
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}

	@Autowired
	protected OffreFournisseurMetier service;

	*//**
	 * Operation Unit Test
	* Return a list of all OffreFournisseur entity
	* 
	 *//*
	@Test
	public void listOffreFournisseur() {
		List<OffreFournisseur> offreList = new ArrayList<OffreFournisseur>();
		offreList.add( new OffreFournisseur(5, 7800, null, null, null) ) ;
		offreList.add( new OffreFournisseur(3, 3300, null, null, null));
		
		when(offreFournisseurRepository.findAll()).thenReturn(offreList);
		List<OffreFournisseur> result = offreFournisseurService.listOffreF();
		assertEquals(2, result.size());
		// TODO: JUnit - Add assertions to test outputs of operation: countOffreFournisseurs
		
	}
	
	*//**
	 * Operation Unit Test
	* chercherOffreFournisseur: entity
	* 
	 
	@Test
	public void chercherOffreFournisseur() {
		
	}*//*



	*//**
	 * Operation Unit Test
	* Save an existing OffreFournisseur entity
	* 
	 *//*
	@Test
	public void saveOffreFournisseur() {
		OffreFournisseur OffreFournisseur = new OffreFournisseur(5, 7800, null, null, null);
		when(offreFournisseurRepository.save(OffreFournisseur)).thenReturn(OffreFournisseur);
		// TODO: JUnit - Populate test inputs for operation: saveOffreFournisseur 
		OffreFournisseur result = offreFournisseurService.saveOffreF(OffreFournisseur);
		assertEquals(5, result.getQte() );
		//PROBLEM DEPRECTATED
		assertEquals(7800.0, result.getPrixFournisseur() ,0.001);
		assertEquals(null, result.getFournisseur() );
		assertEquals(null, result.getDevis() );
		assertEquals(5, result.getQte() );
	}

	*//**
	 * Operation Unit Test
	* Delete an existing OffreFournisseur entity
	*//* 
	
	@Test
	public void deleteOffreFournisseur() {
		OffreFournisseur offreFournisseur=new OffreFournisseur(5, 7800, null, null, null);
		offreFournisseurService.deleteOffreFById(offreFournisseur);
        verify(offreFournisseurRepository, times(1)).delete(offreFournisseur);
	} 
	
	@Test
	public void chercherOffreFournisseur() {
		OffreFournisseur OffreFournisseur=new OffreFournisseur(13, "jil3", null, "valide", null);

	} 
	
	@SuppressWarnings("deprecation")
	@Test
	public void findOffreFournisseurById() {
		OffreFournisseur offreFournisseur = new OffreFournisseur(5, 7800, null, null, null);
		when(offreFournisseurRepository.findOne(1L)).thenReturn(offreFournisseur);

		OffreFournisseur result = offreFournisseurService.getOffreFById(1L);
		assertEquals(5, result.getQte() );
		assertEquals( 7800, result.getPrixFournisseur(), 0.001  );
		assertEquals(null, result.getFournisseur() );
		assertEquals(null, result.getDevis() );
		assertEquals(5, result.getQte() );
	}


}
*/