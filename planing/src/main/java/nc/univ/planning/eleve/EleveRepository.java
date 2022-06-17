package nc.univ.planning.eleve;

import nc.univ.planning.cours.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, String> {

    void deleteEleveById(Long id);

    Optional<Object> findEleveById(Long id);

    List<Eleve> findAllEleveByOrderByNom();

    List<Eleve> findAllEleveByOrderByPrenom();

    List<Eleve> findAllEleveByOrderByAge();

    List<Eleve> findAllEleveByOrderByNiveauCode();

}
