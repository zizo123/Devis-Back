package com.devis.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.devis.entities.Devis;
import com.devis.exception.DevisException;
import com.devis.metier.DevisMetier;

@RestController
@RequestMapping(value = "/devis")
public class DevisRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(DevisRestController.class);
	
	@Autowired
	private DevisMetier devisMetier;
	
	@CrossOrigin
	@GetMapping(value="/listDevis")
	public List<Devis> listDevis(){
		logger.info("Returning all the Devis´s");
		return devisMetier.listDevis();
	}
	
	@CrossOrigin
	@GetMapping(value="/listDevisPage")
	public Page<Devis> listDevisPage(@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="5")int size)
	{
		return devisMetier.listDevisPage(page, size);
	}
	
	@CrossOrigin
	@GetMapping(value="/chercherDevis")
	public Page<Devis> chercherDevis(@RequestParam(name="mc")String mc,
											@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="5")int size)
	{
		return devisMetier.chercherDevis(mc, page, size);
	}
	
	@CrossOrigin
	@GetMapping(value="/chercherDevisFournisseur")
	public Page<Devis> chercherDevisFournisseur(@RequestParam(name="mc")String mc,
											@RequestParam(name="page",defaultValue="0")int page,
											@RequestParam(name="size",defaultValue="5")int size)
	{
		return devisMetier.chercherDevisFournisseur(mc, page, size);
	}
	
	@CrossOrigin
	@GetMapping(value="/listDevis/{id_devis}")
	public Devis getDevisById(@PathVariable("id_devis") Long id_devis) throws Exception{
		logger.info("ToDo id to return " + id_devis);
		
		Devis devis = devisMetier.getDevisById(id_devis);
		
		if (devis == null || devis.getId_devis() <= 0){
            throw new DevisException("ToDo doesn´t exist");
    	}
		return  devisMetier.getDevisById(id_devis);
	}

	@CrossOrigin
	@PostMapping(value = "/saveDevis", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public Devis saveDevis(@RequestBody Devis devis){
		logger.info("Devis to save ");
		return devisMetier.saveDevis(devis);
	}
	
	
	@CrossOrigin
	@PatchMapping(value="/updateDevis/{id_devis}", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void updateDevis(@RequestBody Devis devis,@PathVariable("id_devis") int id_devis) throws Exception{
		logger.info("Devis to update ");
		Devis dev = devisMetier.getDevisById(devis.getId_devis());
    	try{
    		if (dev != null && dev.getId_devis() > 0){
    				devisMetier.saveDevis(devis);
    		}
    		else throw new DevisException(" Devis to update doesn´t exist");
    	}catch(Exception e){
    			System.out.println("Vous avez une erreur !"+e.getMessage());
    	}
	}
	
	@CrossOrigin
	@DeleteMapping(value="/deleteDevis/{id_devis}")
	public void deleteDevisById(@PathVariable("id_devis") Long id_devis){
    	logger.info("ToDo id to remove " + id_devis);
    	Devis devis = devisMetier.getDevisById(id_devis);
		try{
			devisMetier.deleteDevisById(devis);
			}catch(Exception e){
				if(id_devis < 0)
					System.out.println("Votre id <0");
				else System.out.println("Vous avez une erreur !"+e.getMessage());
			}
	}
		
}
