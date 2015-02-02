package com.tecsup.spingjdbc.dao.jdbc;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tecsup.spingjdbc.dao.ProgramaDao;
import com.tecsup.spingjdbc.model.Programa;

public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDao {

	public List<Programa> list() {
		String sql = "select * from elbernab.programa";
		return this.getJdbcTemplate().query(sql, new ProgramaRowMapper());
	}

	public Programa get(long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Programa t) {
		// TODO Auto-generated method stub

	}

	public void update(Programa t) {
		// TODO Auto-generated method stub

	}

	public void delete(long t) {
		// TODO Auto-generated method stub

	}

}
