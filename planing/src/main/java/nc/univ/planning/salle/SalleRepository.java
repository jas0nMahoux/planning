package nc.univ.planning.salle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {

    void deleteSalleById(Long id);

    Optional<Object> findSalleById(Long id);
}
