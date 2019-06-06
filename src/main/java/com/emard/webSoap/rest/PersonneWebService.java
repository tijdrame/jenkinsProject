package com.emard.webSoap.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jenkinsProject.entity.Personne;
import jenkinsProject.service.IPersonneService;


@RestController
@RequestMapping("/api")
public class PersonneWebService {

	@Autowired
	private IPersonneService iPersonneService;
	
	/*public PersonneWebService(IPersonneService iPersonneService) {
		this.iPersonneService = iPersonneService;
	}*/
	@GetMapping(path = "/personnes", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Personne> allPers(){
		return iPersonneService.listPersonnes();
	}
	@PostMapping("/personnes")
	public Personne addPersonne(@RequestBody() Personne personne) {
		System.out.println("pers==="+personne);
		return this.iPersonneService.addPersonne(personne);
	}
}
