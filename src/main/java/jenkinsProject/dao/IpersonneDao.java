package jenkinsProject.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jenkinsProject.entity.Personne;


@Repository
public interface IpersonneDao extends  CrudRepository<Personne, Long>{

}
