package com.tecsup.spingjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tecsup.spingjdbc.dao.ProgramaDao;
import com.tecsup.spingjdbc.model.Programa;

public class App {

	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		//App.doDelete(cntx, 1);
		App.doSave(cntx);
		App.doList(cntx);
	}

	public static void doList(ApplicationContext cntx) {
		ProgramaDao dao = (ProgramaDao) cntx.getBean("programaDao");
		List<Programa> programas = dao.list();
		for (Programa programa : programas) {
			System.out.println(programa.getNombre() + programa.getId());
		}

	}

	public static void doDelete(ApplicationContext cntx, long id) {
		ProgramaDao dao = (ProgramaDao) cntx.getBean("programaDao");
		dao.delete(id);

	}
	
	public static void doSave (ApplicationContext cntx){
		ProgramaDao dao = (ProgramaDao)cntx.getBean("programaDao");
		Programa pr = new Programa();
		
		pr.setCodigo("77");
		pr.setDescripcion("caso77");
		pr.setNombre("caso77");
		dao.save(pr);
	}
}
