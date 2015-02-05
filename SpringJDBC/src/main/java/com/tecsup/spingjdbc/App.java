package com.tecsup.spingjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tecsup.spingjdbc.dao.ProgramaDao;
import com.tecsup.spingjdbc.model.Programa;

public class App {
	
	
public static void main(String[] args) {
    ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
	App.doList(cntx);
}

public static void doList(ApplicationContext cntx) {
	ProgramaDao dao = (ProgramaDao) cntx.getBean("programaDao");
	List<Programa> programas = dao.list();
	for(Programa programa : programas){
		System.out.println(programa.getNombre()+programa.getId());
	}
	
	
}
}
