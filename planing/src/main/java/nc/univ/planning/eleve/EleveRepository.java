package nc.univ.planning.eleve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, String> {

    void deleteEleveById(Long id);

    Optional<Object> findEleveById(Long id);

    @Query("update eleve from Eleve where eleve.id = :id")
    void update(@Param("id") Long id);
}
