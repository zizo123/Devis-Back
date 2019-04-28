/*package com.devis.controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DevisControllerTest {
	private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;
   
	
	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}

	@Test
	public void verifyAllDevisList() throws Exception {		
		mockMvc.perform(MockMvcRequestBuilders.get("/devis/listDevis").accept(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$", hasSize(9))).andDo(print());
	}
	
	@Test
	public void verifyDevisById() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/devis/listDevis/2").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.id_devis").exists())
		.andExpect(jsonPath("$.reference").exists())
		.andExpect(jsonPath("$.etat_devis").exists())
		.andExpect(jsonPath("$.id_devis").value(2))
		.andExpect(jsonPath("$.reference").value("fo459"))
		.andExpect(jsonPath("$.etat_devis").value("fo459"))
		.andDo(print());
	}
	
	 Pas encore gere
	 @Test
	public void verifyInvalidDevisArgument() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/devis/listDevis/f").accept(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$.message").value("jme3 rassek"))
			.andDo(print());
	}
	@Test
	public void verifyInvalidDevisId() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/devis/listDevis/0").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.errorCode").value(404))
		.andExpect(jsonPath("$.message").value("ToDo doesn´t exist"))
		.andDo(print());
	}
	
	@Test
	public void verifyNullDevis() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/devis/listDevis/6").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.errorCode").value(404))
		.andExpect(jsonPath("$.message").value("ToDo doesn´t exist"))
		.andDo(print());
	}
	@Test
	public void verifyInvalidDevisIdToDelete() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/devis/deleteDevis/19").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		 .andExpect(content().string(containsString("")))
		.andDo(print());
	}
	
	@Test
	public void verifySaveDevis() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/devis/saveDevis")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"reference\" : \"N5889\", \"etat_devis\" : \"valide\" }")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.id_devis").exists())
		.andExpect(jsonPath("$.reference").exists())
		.andExpect(jsonPath("$.etat_devis").exists())
		.andExpect(jsonPath("$.reference").value("N5889"))
		.andExpect(jsonPath("$.etat_devis").value("valide"))
		.andDo(print());
	}
	
	@Test
	public void verifyUpdateDevis() throws Exception { 
		mockMvc.perform(MockMvcRequestBuilders.patch("/devis/updateDevis")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{ \"id_devis\": \"2\", \"reference\" : \"N8889\", \"etat_devis\" : \"annule\" }")
        .accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.id_devis").exists())
		.andExpect(jsonPath("$.reference").exists())
		.andExpect(jsonPath("$.etat_devis").exists())
		.andExpect(jsonPath("$.id_devis").value(2))
		.andExpect(jsonPath("$.reference").value("N8889"))
		.andExpect(jsonPath("$.etat_devis").value("annule"))
		.andDo(print());
	}


}
*/