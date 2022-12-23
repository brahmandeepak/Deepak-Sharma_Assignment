package com.masai.service;

import java.util.List;
import com.masai.exception.NotFoundExcep;
import com.masai.model.Pospecta;

public interface ProspectaService {
public List<Pospecta> getAllProspectaOfClass();
	
	public String createModel(Pospecta Pospecta);
	
	public Pospecta getModelByCategory(Pospecta Pospecta, String description)throws NotFoundExcep;
	
	public Pospecta getInfoByID(Long id)throws NotFoundExcep;

}
