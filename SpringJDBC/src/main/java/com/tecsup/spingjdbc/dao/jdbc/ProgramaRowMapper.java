package com.tecsup.spingjdbc.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.spingjdbc.model.Programa;

public class ProgramaRowMapper implements RowMapper<Programa> {

	public Programa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Programa programa = new Programa();
		programa.setId(rs.getLong(1));
		programa.setNombre(rs.getString(2));
		programa.setDescripcion(rs.getString(3));
		return programa;
	}

}
