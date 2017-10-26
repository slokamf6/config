package com.sklm.sbi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sklm.sbi.DAO.GeoHierDAO;
import com.sklm.sbi.pojo.GeoHierPojo;
@Component
public class GeoHierServices {
	@Autowired
	private GeoHierDAO dao;
	
	public void saveAs(GeoHierPojo pojo){
		
		dao.saveAs(pojo);
	}
	
	public List<GeoHierPojo> getAllGeoHierService(){
		 List<GeoHierPojo> geoservice=dao.getAllGeoHierDAO();
		 return geoservice;
	}
	
	public GeoHierPojo getByIdServices(Integer id){
		return dao.getByIdDAO(id);
		
	}
	
	public void deleteServices(GeoHierPojo geopojo){
		
		dao.deleteGeohierDAO(geopojo);
		
		
	}

      public void updateServices(GeoHierPojo geopojo){
		
		dao.updateGeohierDAO(geopojo);
		
		
	}


}
