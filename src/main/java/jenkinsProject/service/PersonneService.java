package jenkinsProject.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emard.webSoap.dao.IpersonneDao;

import jenkinsProject.entity.Personne;

@Service
public class PersonneService implements IPersonneService{

	@Autowired
	public IpersonneDao ipersonneDao;
	
	/*public PersonneService(IpersonneDao iPersonneDao) {
		personneDao = iPersonneDao;
	}*/
	
	public Personne addPersonne(Personne personne) {
		return ipersonneDao.save(personne);
		 
	}

	public Personne modifyPersonne(Personne personne) {
		return ipersonneDao.save(personne);
	}

	public Iterable<Personne> listPersonnes() {
		return ipersonneDao.findAll();
	}

	public List<Personne> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
				//personneDao.findByName(name);
	}

	public void deletePersonne(Long id) {
		// TODO Auto-generated method stub
		ipersonneDao.delete(id);
	}

}
