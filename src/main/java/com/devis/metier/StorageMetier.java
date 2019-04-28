package com.devis.metier;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageMetier {
	
	 public void store(MultipartFile file);
	 public Resource loadFile(String filename);
	 //public void deleteAll();
	 //public void init();

}
