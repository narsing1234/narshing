package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class Employee implements IEmployeeDao {
	

	private static final String GET_EMPS_COUNT = "Select count(*) From emp";
	@Autowired
	private JdbcTemplate t;

	
	@Override  
	public int getEmpsCount() {
	int count=t.queryForObject(GET_EMPS_COUNT,Integer.class);
	return count;
	}
	
	
	
}
