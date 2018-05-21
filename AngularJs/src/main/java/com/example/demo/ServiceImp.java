package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ServiceImp implements NgService  {
	@Autowired
	public AngularRepository angularRepository;
	
	@Override
	public Model in(Model model) {
		
		return angularRepository.save(model);
	}

	

}
