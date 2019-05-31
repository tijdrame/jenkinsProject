package com.emard.webSoap.rest;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jenkinsProject.entity.Personne;
import jenkinsProject.service.PersonneService;


@RestController
@RequestMapping("/api")
public class PersonneWebService {

	private final PersonneService personneServ;
	
	public PersonneWebService(PersonneService personneServ) {
		this.personneServ = personneServ;
	}
	@GetMapping(path = "/personnes", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Personne> allPers(){
		return personneServ.listPersonnes();
	}
	@PostMapping("/personnes")
	public Personne addPersonne(@RequestBody() Personne personne) {
		System.out.println("pers==="+personne);
		return this.personneServ.addPersonne(personne);
	}
}
