package jenkinsProject.service;

import java.util.List;

import jenkinsProject.entity.Personne;


public interface IPersonneService {

	public Personne addPersonne(Personne personne);
	public Personne modifyPersonne(Personne personne);
	public Iterable<Personne> listPersonnes();
	public List<Personne> searchByName(String name);
	public void deletePersonne(Long id);
}
