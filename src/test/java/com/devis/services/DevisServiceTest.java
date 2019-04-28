/*package com.devis.services;
import com.devis.dao.DevisRepository;
import com.devis.entities.Devis;
import com.devis.metier.impl.DevisMetierImpl;



import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class DevisServiceTest {
	*//**
	 * The repository is being loaded.
	 *//*
	@Mock
	private DevisRepository devisRepository;
	
	*//**
	 * The service being tested, injected by Spring.
	 *//*
	@InjectMocks
	private DevisMetierImpl devisService;
	
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
		List<Devis> devisList = new ArrayList<Devis>();
		devisList.add( new Devis("jil", null, "valide"));
		devisList.add( new Devis("jil2", null, "annule"));
		
		when(devisRepository.findAll()).thenReturn(devisList);
		List<Devis> result = devisService.listDevis();
		assertEquals(2, result.size());
		// TODO: JUnit - Add assertions to test outputs of operation: countDeviss
		
	}
	
	*//**
	 * Operation Unit Test
	* chercherDevis: entity
	* 
	 
	@Test
	public void chercherDevis() {
		
	}*//*



	*//**
	 * Operation Unit Test
	* Save an existing Devis entity
	* 
	 *//*
	@Test
	public void saveDevis() {
		Devis devis = new Devis("jil3", null, "valide");
		when(devisRepository.save(devis)).thenReturn(devis);
		// TODO: JUnit - Populate test inputs for operation: saveDevis 
		Devis result = devisService.saveDevis(devis);
		assertEquals("jil3", result.getReference());
		assertEquals(null, result.getDateCreation() );
		assertEquals("valide", result.getEtat_devis());
	}

	*//**
	 * Operation Unit Test
	* Delete an existing Devis entity
	*//* 
	
	@Test
	public void deleteDevis() {
		Devis devis=new Devis("jil3", null, "valide");
		devisService.deleteDevisById(devis);
        verify(devisRepository, times(1)).delete(devis);
	} 
	
	@Test
	public void chercherDevis() {
		Devis devis=new Devis(13, "jil3", null, "valide", null);

	} 
	
	@Test
	public void findDevisById() {
		Devis devis = new Devis("jil3", null, "valide");
		when(devisRepository.findOne(1L)).thenReturn(devis);

		Devis result = devisService.getDevisById(1L);
		assertEquals("jil3", result.getReference());
		assertEquals(null, result.getDateCreation() );
		assertEquals("valide", result.getEtat_devis());
	}


}
*/