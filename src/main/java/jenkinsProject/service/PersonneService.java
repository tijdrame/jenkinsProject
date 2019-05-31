package jenkinsProject.service;


import java.util.List;

import org.springframework.stereotype.Service;

import jenkinsProject.dao.IpersonneDao;
import jenkinsProject.entity.Personne;

@Service
public class PersonneService implements IPersonneService{

	public final IpersonneDao personneDao;
	
	public PersonneService(IpersonneDao iPersonneDao) {
		personneDao = iPersonneDao;
	}
	
	public Personne addPersonne(Personne personne) {
		return personneDao.save(personne);
		 
	}

	public Personne modifyPersonne(Personne personne) {
		return personneDao.save(personne);
	}

	public Iterable<Personne> listPersonnes() {
		return personneDao.findAll();
	}

	public List<Personne> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
				//personneDao.findByName(name);
	}

	public void deletePersonne(Long id) {
		// TODO Auto-generated method stub
		personneDao.delete(id);
	}

}
