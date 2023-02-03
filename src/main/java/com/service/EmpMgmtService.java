package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.IEmployeeDao;

@Component("empService")
public class EmpMgmtService implements IEmpMgmtService{

	@Autowired
	private IEmployeeDao emp;

	@Override
	public int ShowEmpSCount() {
		// TODO Auto-generated method stub
		int  count=emp.getEmpsCount();
		return count;
	}
	
	
}
