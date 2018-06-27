package com.qualims.serveur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qualims.serveur.domaine.DateHeureService;

@RestController
@RequestMapping("server")
public class DateHeureController {
	@RequestMapping("/heure")
	public String heureCourante() {
		return DateHeureService.heureCourante();
	}
	
	@RequestMapping("/heureOffset")
	public String heureCouranteOffset() {
		return DateHeureService.heureCouranteOffset();
	}
	
	@RequestMapping("/heureTimeZone")
	public String heureCouranteTimeZone() {
		return DateHeureService.heureCouranteTimeZone();
	}
}
