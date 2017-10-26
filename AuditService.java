package com.sklm.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sklm.sbi.DAO.AuditDAO;
import com.sklm.sbi.pojo.Auditpojo;

@Component
public class AuditService {
	@Autowired
	private AuditDAO auditdao;
	
	public void doAudit(Auditpojo audit) {
		auditdao.doAudit(audit);
	}

}
