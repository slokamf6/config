package com.sklm.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sklm.sbi.DAO.PersonDAO;
import com.sklm.sbi.pojo.PersonPojo;

@Component
public class PersonService {
	@Autowired
	private PersonDAO dao;
	
	public void savePerson(PersonPojo person)
	{
		dao.savePerson(person);
	}

}
