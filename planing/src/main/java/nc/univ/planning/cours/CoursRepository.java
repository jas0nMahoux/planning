package nc.univ.planning.cours;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {

    void deleteCoursById(Long id);

    Optional<Object> findCoursById(Long id);

    List<Cours> findAllCoursByOrderBySalleCode();

}
