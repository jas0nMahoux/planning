package nc.univ.planning.niveau;

import nc.univ.planning.niveau.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, Long> {

    void deleteNiveauById(Long id);

    Optional<Object> findNiveauById(Long id);
}
