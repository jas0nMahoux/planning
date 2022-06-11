package nc.univ.planning.dao;

import nc.univ.planning.model.Eleve;
import org.springframework.data.repository.CrudRepository;

public interface EleveRepository  extends CrudRepository<Eleve, Long> {
}

/**package nc.univ.planning.dao;

 import nc.univ.planning.model.Eleve;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

 import java.util.Optional;

 @Repository
 public interface EleveRepository extends JpaRepository<Eleve, String> {

 void deleteEleveById(int id);

 Optional<Object> findEleveById(int id);
 }*/
