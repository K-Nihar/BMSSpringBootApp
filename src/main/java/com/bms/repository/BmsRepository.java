package com.bms.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.bms.domain.Cinema;

@Repository
public class BmsRepository {
	
	JdbcTemplate jdbcTemplate;
	
	private static String GET_CINEMA_BY_ID="select * from cinemas where id=?";
	
	public BmsRepository(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	public Cinema getCinemaDetails(int id) {
		return jdbcTemplate.query(GET_CINEMA_BY_ID,new Object[]{id},(ResultSetExtractor<Cinema>) rs->{
			rs.next();
			return new Cinema(rs);
		});
	}
}
