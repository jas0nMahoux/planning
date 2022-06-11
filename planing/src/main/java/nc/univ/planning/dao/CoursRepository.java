package nc.univ.planning.dao;

import nc.univ.planning.model.Cours;
import org.springframework.data.repository.CrudRepository;

public interface CoursRepository extends CrudRepository<Cours, Long> {
}
