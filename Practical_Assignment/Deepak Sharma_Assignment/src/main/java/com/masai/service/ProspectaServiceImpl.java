package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.exception.NotFoundExcep;
import com.masai.model.Pospecta;
import com.masai.repository.prospectaRepo;

public class ProspectaServiceImpl implements ProspectaService {
	@Autowired
	prospectaRepo pRepo;

	@Override
	public List<Pospecta> getAllProspectaOfClass() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

	@Override
	public String createModel(Pospecta pospecta) {
		// TODO Auto-generated method stub
		String ans="";
		
		if(pospecta != null) {
			pRepo.save(pospecta);
			ans+=" prospecta model is saved successfully...";
		}else {
			ans+=" please enter complete the details of model";
		}
		return ans;
			
	}

	@Override
	public Pospecta getModelByCategory(Pospecta pospecta, String description) throws NotFoundExcep{
		if(pospecta.getDescription() == description) {
			
			return pRepo.findById(pospecta.getClassId()).get();
		}else {
			
			return pospecta;
		}
	}

	@Override
	public Pospecta getInfoByID(Long id)throws NotFoundExcep {
		// TODO Auto-generated method stub
		return pRepo.findById(id).get();
	}


}
