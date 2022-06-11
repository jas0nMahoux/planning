package nc.univ.planning.dao;

import nc.univ.planning.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long>{
}
