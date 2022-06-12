package nc.univ.planning.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursService {

    @Autowired
    private CoursRepository coursRepository;

    public Cours saveCours(Cours cours) {
        return coursRepository.save(cours);
    }

    public List<Cours> findAllCours() {
        return coursRepository.findAll();
    }

    public Object findCours(Long id) {
        return  coursRepository.findCoursById(id).orElseThrow(() -> new CoursNotFoundException("Le cours numéro " + id + " n'est pas enregistré en base de données."));
    }

    public void updateCours(Cours cours) {
        coursRepository.save(cours);
    }

    public void deleteCours(Long id) {
        coursRepository.deleteCoursById(id);
    }
}
