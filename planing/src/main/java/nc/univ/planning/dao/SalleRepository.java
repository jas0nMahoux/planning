package nc.univ.planning.dao;

import nc.univ.planning.model.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle, Long> {

    void deleteSalleById(Long id);

}
