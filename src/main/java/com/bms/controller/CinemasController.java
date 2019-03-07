package com.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bms.domain.Cinema;
import com.bms.service.CinemaService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/cinemas")
@Api(value="CinemaResource",description="This is resource for cinema transactions")
public class CinemasController {
	
	@Autowired
	CinemaService cinemaService;
	
	@RequestMapping(value="/getCinemaById/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cinema> getCinemaById(@PathVariable String id/*@RequestParam int id*/) {
		return new ResponseEntity<Cinema>(cinemaService.getCinemaById(Integer.parseInt(id)),HttpStatus.OK);
	}
}
