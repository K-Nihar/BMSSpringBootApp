package com.bms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.domain.Cinema;
import com.bms.repository.BmsRepository;

@Service
public class CinemaService {

	@Autowired
	BmsRepository bmsRepository;
	
	public Cinema getCinema(int id) {
		return bmsRepository.getCinemaDetails(id);
	}
}
