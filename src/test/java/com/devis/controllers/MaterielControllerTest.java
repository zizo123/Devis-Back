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
public class MaterielControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;
   
	
	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}

	@Test
	public void verifyAllMaterielList() throws Exception {		
		mockMvc.perform(MockMvcRequestBuilders.get("/materiel/listMateriel").accept(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$", hasSize(7))).andDo(print());
	}
	
	@Test
	public void verifyMaterielById() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/materiel/listMateriel/5").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.id_materiel").exists())
		.andExpect(jsonPath("$.numMat").exists())
		.andExpect(jsonPath("$.marque").exists())
		.andExpect(jsonPath("$.id_materiel").value(5))
		.andExpect(jsonPath("$.numMat").value("45"))
		.andExpect(jsonPath("$.marque").value("jk"))
		.andDo(print());
	}

}
*/