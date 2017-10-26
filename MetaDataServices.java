package com.sklm.sbi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sklm.sbi.DAO.MetaDataDAO;
import com.sklm.sbi.pojo.CountryPojo;
import com.sklm.sbi.pojo.EntitypePojo;
import com.sklm.sbi.pojo.StatePojo;
import com.sklm.sbi.pojo.Statuspojo;
@Component
public class MetaDataServices {
	@Autowired
	private MetaDataDAO dao;
	public List<EntitypePojo> getAllEntitytype(){
		return dao.getAllEntitytype();
	}
	public List<Statuspojo> getStatusByIdServices(Integer entitypeid){
		
		return dao.getStatusById(entitypeid);
	}
	public List<CountryPojo> getAllcountry(){
		return dao.getAllcountry();
	}
	public List<StatePojo> getStateByCountryId(Integer countryId){
		return dao.getStateByCountryId(countryId);
	}

}
