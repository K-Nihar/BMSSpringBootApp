package rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import service.XYZService;

@RestController
@RequestMapping("/api/cinemas")
@Api(value="CinemaResource",description="This is resource for cinema transactions")
public class CinemasController {
	
	XYZService xyzService;
	
	@RequestMapping("/getAll")
	public void getAllCinemas() {
		System.out.println(xyzService.toString());
	}
}
