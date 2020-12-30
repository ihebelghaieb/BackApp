package tn.essat.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import tn.essat.model.Pfe;


@Repository
public interface IGestionPfe extends JpaRepository<Pfe, Integer> {

	
	@Query("select m from Pfe m where m.typepfe.id=?1")
	public List<Pfe> getAllPfeByTypePfe(int id);
}
