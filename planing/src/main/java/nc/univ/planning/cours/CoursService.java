package nc.univ.planning.cours;

import nc.univ.planning.cours.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursService {

    @Autowired
    private CoursRepository coursRepository;

    public void delete(Long id) {
        coursRepository.deleteCoursById(id);
    }
}
