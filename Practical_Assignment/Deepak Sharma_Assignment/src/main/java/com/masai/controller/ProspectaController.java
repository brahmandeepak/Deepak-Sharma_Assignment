package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.NotFoundExcep;
import com.masai.model.Pospecta;
import com.masai.service.ProspectaService;


@RestController
public class ProspectaController {
	
	@Autowired
	ProspectaService pService;
	
	@GetMapping("/api.publicapis.org/entries/getAllEntries")
	public List<Pospecta> getInfoOfClass(){
		
		return pService.getAllProspectaOfClass();
		
	};
	
	@PostMapping("/api.publicapis.org/entries/saveTheClassModel")
	public String createModel(@RequestBody Pospecta pospecta) {
		return pService.createModel(pospecta);
		
	};
	
	@GetMapping("/api.publicapis.org/entries/getDetailsByCategory/{description}")
	public Pospecta getModelByCategory(@RequestBody Pospecta pospecta, @PathVariable String description) throws NotFoundExcep {
		return pService.getModelByCategory(pospecta, description);
		
	};
	
	@GetMapping("/api.publicapis.org/entries/getTitleById/{id}")
	public Pospecta getInfoByID(@PathVariable Long id) throws NotFoundExcep{
		return pService.getInfoByID(id);
		
		
	};

}
