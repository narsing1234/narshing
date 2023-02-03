package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Employee;
import com.service.IEmpMgmtService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("/com/sbeans/applicationContext.xml");
		IEmpMgmtService e=ctx.getBean("empService",IEmpMgmtService.class);
		
		int n=e.ShowEmpSCount();
		System.out.println(n);
		ctx.close();
	}

}
