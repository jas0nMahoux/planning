package nc.univ.planning.eleve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, String> {

    void deleteEleveById(int id);

    Optional<Object> findEleveById(int id);
}
