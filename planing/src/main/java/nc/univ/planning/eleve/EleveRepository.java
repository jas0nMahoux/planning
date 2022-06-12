package nc.univ.planning.eleve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, String> {

    void deleteEleveById(Long id);

    Optional<Object> findEleveById(Long id);
}
