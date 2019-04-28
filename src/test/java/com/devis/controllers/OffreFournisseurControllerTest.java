/*package com.devis.controllers;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.devis.DevisApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DevisApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OffreFournisseurControllerTest {
	
private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;
   
	
	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}

	@Test
	public void verifyAllOffreList() throws Exception {		
		mockMvc.perform(MockMvcRequestBuilders.get("/offreF/listOffreF").accept(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$", hasSize(1))).andDo(print());
	}
	
	@Test
	public void verifyOffrelById() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/offreF/listOffreF/1").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.id_offre").exists())
		.andExpect(jsonPath("$.prixFournisseur").exists())
		.andExpect(jsonPath("$.qte").exists())
		.andExpect(jsonPath("$.id_offre").value(1))
		.andExpect(jsonPath("$.prixFournisseur").value(7890))
		.andExpect(jsonPath("$.qte").value(2))
		.andDo(print());
	}

}
*/