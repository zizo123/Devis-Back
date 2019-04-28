package com.devis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.devis.entities.Fournisseur;
import com.devis.metier.FournisseurMetier;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/fournisseur")
public class FournisseurRestController {
	
	@Autowired
	private FournisseurMetier fournisseurMetier;
	
	
	@CrossOrigin
	@GetMapping(value="/listFournisseur")
	public List<Fournisseur> listFournisseur(){
		return fournisseurMetier.listFournisseur();
	}
	
	@CrossOrigin
	@GetMapping(value="/listFournisseurPage")
	public Page<Fournisseur> listFournisseurPage(@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="5")int size)
	{
		return fournisseurMetier.listFournisseurPage(page, size);
	}
	
	
	@CrossOrigin
	@GetMapping(value="/chercherFournisseur")
	public Page<Fournisseur> chercherFournisseur(@RequestParam(name="mc")String mc,
											@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="5")int size)
	{
		return fournisseurMetier.chercherFournisseur(mc, page, size);
	}
	
	@CrossOrigin
	@GetMapping(value="/listFournisseur/{id_f}")
	public Fournisseur getFournisseurById(@PathVariable("id_f") Long id_f) throws Exception{
		Fournisseur fournisseur = fournisseurMetier.getFournisseurById(id_f);
		
		if (fournisseur == null || fournisseur.getId_f() <= 0){
            throw new Exception("ToDo doesn´t exist");
    	}
		return fournisseurMetier.getFournisseurById(id_f);
	}

	@CrossOrigin
	@PostMapping(value = "/saveFournisseur", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur){
		return fournisseurMetier.saveFournisseur(fournisseur);
	}
	
	
	@CrossOrigin
	@PatchMapping(value="/updateFournisseur/{id_f}", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void updateFournisseur(@RequestBody Fournisseur fournisseur){
		Fournisseur fourni = fournisseurMetier.getFournisseurById(fournisseur.getId_f());
    	try{
    		if (fourni != null && fourni.getId_f() > 0){
    			fournisseurMetier.saveFournisseur(fournisseur);
    		}
    		else throw new Exception(" fournisseur to update doesn´t exist");
    	}catch(Exception e){
    			System.out.println("jme3 rasek a bizi"+e.getMessage());
    	}
	}
	
	@CrossOrigin
	@DeleteMapping(value="/deleteFournisseur/{id_f}")
	public void deleteFournisseur(@PathVariable("id_f") Long id_f){
		Fournisseur fourni = fournisseurMetier.getFournisseurById(id_f);
		try{
		 fournisseurMetier.deleteFournisseurById(fourni);
	}catch(Exception e){
		if(id_f < 0)
			System.out.println("jme3 rasek id <0");
		else System.out.println("jme3 rasek a 3zzi"+e.getMessage());
	}
	}
	
	
}
