package com.tecsup.spingjdbc.dao.jdbc;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tecsup.spingjdbc.dao.ProgramaDao;
import com.tecsup.spingjdbc.model.Programa;

public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDao {

	public List<Programa> list() {
		String sql = "select * from elbernab.programa";
		return this.getJdbcTemplate().query(sql, new ProgramaRowMapper());
	}

	public Programa get(long t) {
		String sql = "select * from programa";
		Programa programa = (Programa) this.getJdbcTemplate().query(sql,
				new ProgramaRowMapper());
		return programa;
	}

	public void save(Programa t) {
		String sql = "insert into programa(nombre, descripcion,codigo) values(?,?,?)";
		try {

			this.getJdbcTemplate().update(
					sql,
					new Object[] { t.getNombre(), t.getDescripcion(),
							t.getCodigo() });
		} catch (DataAccessException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void update(Programa t) {
		String sql = "update programa "
				+ "set nombre= ?, descripcion=?, codigo=? " 
				+ "where id=?";
		try {
			this.getJdbcTemplate().update(
					sql,
					new Object[] { t.getNombre(), t.getDescripcion(),
							t.getCodigo(), t.getId() });
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	public void delete(long t) {
		this.getJdbcTemplate().update("delete from programa where id=?",
				new Object[] { t });

	}

}
