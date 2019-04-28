package com.devis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.devis.entities.OffreFournisseur;
import com.devis.metier.OffreFournisseurMetier;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/offreF")
public class OffreFournisseurRestController {
	
	@Autowired
	private OffreFournisseurMetier offreFournisseurMetier;

	
	
	@CrossOrigin
	@GetMapping(value="/listOffreF")
	public List<OffreFournisseur> listOffreFournisseur(){
		return offreFournisseurMetier.listOffreF();
	}
	
	@CrossOrigin
	@GetMapping(value="/listOffreF/{id_offre}")
	public OffreFournisseur getOffreFournisseurById(@PathVariable("id_offre") Long id_offre) throws Exception{
		OffreFournisseur offre = offreFournisseurMetier.getOffreFById(id_offre);
		
		if (offre == null || offre.getId_offre() <= 0){
            throw new Exception("offre doesn´t exist");
    	}
		return  offreFournisseurMetier.getOffreFById(id_offre);
	}

	@CrossOrigin
	@PostMapping(value = "/saveOffreF", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public OffreFournisseur saveOffreFournisseur(@RequestBody OffreFournisseur offreFournisseur){
		return offreFournisseurMetier.saveOffreF(offreFournisseur);
	}
	
	@CrossOrigin
	@PatchMapping(value="/updateOffreF/{id_offre}", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void updateOffreFournisseur(@RequestBody OffreFournisseur offreFournisseur,@PathVariable("id_offre") int id_offre){
		OffreFournisseur offre = offreFournisseurMetier.getOffreFById(offreFournisseur.getId_offre());
    	try{
    		if (offre != null && offre.getId_offre() > 0){
    			offreFournisseurMetier.saveOffreF(offreFournisseur);
    		}
    		else throw new Exception(" offre to update doesn´t exist");
    	}catch(Exception e){
    			System.out.println("Vous avez une erreur !"+e.getMessage());
    	}
	}
	
	@CrossOrigin
	@DeleteMapping(value="/deleteOffreF/{id_offre}")
	public void deleteOffreFournisseur(@PathVariable("id_offre") Long id_offre){
		OffreFournisseur offre = offreFournisseurMetier.getOffreFById(id_offre);
		try{
		 offreFournisseurMetier.deleteOffreFById(offre);
		 }catch(Exception e){
		if(id_offre < 0)
			System.out.println("Vous avez entrer un numero negatif.");
		else System.out.println("Vous avez une erreur !"+e.getMessage());
	}
	}

	@CrossOrigin
	@GetMapping(value="/offreParFournisseur")
	public List<OffreFournisseur> getOffreParFournisseur(@RequestParam(name="mc",defaultValue="")String mc,
														@RequestParam(name="num",defaultValue="") long num)
	{
		return offreFournisseurMetier.getOffreParFournisseur(mc,num);
	}
	
	@CrossOrigin
	@PostMapping(value = "/saveListOffre", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void saveListOffre(@RequestBody List<OffreFournisseur> listOffre){
		 offreFournisseurMetier.saveListOffre(listOffre);
	}
	
	@CrossOrigin
	@PatchMapping(value = "/updateListOffre", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void updateListOffre(@RequestBody List<OffreFournisseur> listOffre){
		 offreFournisseurMetier.updateListOffre(listOffre);
	}
	
}
