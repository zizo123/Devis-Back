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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.devis.entities.Materiel;
import com.devis.metier.MaterielMetier;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/materiel")
public class MaterielRestController {
	@Autowired
	private MaterielMetier materielMetier;

	@CrossOrigin
	@GetMapping(value="/listMateriel")
	public List<Materiel> listMateriel(){
		return materielMetier.listMateriel();
	}

	@CrossOrigin
	@GetMapping(value="/listMaterielPage")
	public Page<Materiel> listMaterielPage(@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="5")int size)
	{
		return materielMetier.listMaterielPage(page, size);
	}
	//@Cacheable ("chercherMateriel")
	@CrossOrigin
	@GetMapping(value="/chercherMateriel")
	public Page<Materiel> chercherMateriel(@RequestParam(name="mc",defaultValue="")String mc,
											@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="10")int size)
	{
		return materielMetier.chercherMateriel(mc, page, size);
	}
	
	@CrossOrigin
	@GetMapping(value="/chercherMaterielByAll")
	public Page<Materiel> chercherMaterielByAll(@RequestParam(name="mc",defaultValue="")String mc,
											@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="10")int size)
	{
		return materielMetier.chercherMaterielByAll(mc, page, size);
	}

	@CrossOrigin
	@GetMapping(value="/chercherMaterielFournisseur")
	public Page<Materiel> chercherMaterielFournisseur(@RequestParam(name="mc")String mc,
											@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="10")int size)
	{
		return materielMetier.chercherMaterielFournisseur(mc, page, size);
	}
	
	@CrossOrigin
	@GetMapping(value="/findMaterielFournisseur")
	public Page<Materiel> findMaterielFournisseur(@RequestParam(name="mc")String mc,
											@RequestParam(name="num")String num,
											@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="10")int size)
	{
		return materielMetier.findMaterielFournisseur(mc,num, page, size);
	}
	
	@CrossOrigin
	@GetMapping(value="/listMateriel/{id_materiel}")
	public Materiel getMaterielById(@PathVariable("id_materiel") Long id_materiel) throws Exception{
		Materiel materiel = materielMetier.getMaterielById(id_materiel);
		
		if (materiel == null || materiel.getId_materiel() <= 0){
            throw new Exception("ToDo doesn´t exist");
    	}
		return  materielMetier.getMaterielById(id_materiel);
	}

	@CrossOrigin
	@RequestMapping(value = "/saveMateriel", method = RequestMethod.POST)
	public Materiel saveMateriel(@RequestBody Materiel materiel){
		return materielMetier.saveMateriel(materiel);
	}
	
	@CrossOrigin
	@PatchMapping(value="/updateMateriel/{id_materiel}", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE } )
	public void updateMateriel(@RequestBody Materiel materiel,@PathVariable("id_materiel") int id_materiel){
		Materiel mat = materielMetier.getMaterielById(materiel.getId_materiel());
    	try{
    		if (mat != null && mat.getId_materiel() > 0){
    			materielMetier.saveMateriel(materiel);
    		}
    		else throw new Exception(" Devis to update doesn´t exist");
    	}catch(Exception e){
    			System.out.println("Vous avez une erreur !"+e.getMessage());
    	}
	}
	
	
	@CrossOrigin
	@DeleteMapping(value="/deleteMateriel/{id_materiel}")
	public void deleteMateriel(@PathVariable("id_materiel") Long id_materiel){
		Materiel mat = materielMetier.getMaterielById(id_materiel);
		try{
		 materielMetier.deleteMaterielById(mat);
		}catch(Exception e){
			if(id_materiel < 0)
				System.out.println("Votre id <0");
			else System.out.println("Vous avez une erreur !"+e.getMessage());
		}
	}

	
	
}
