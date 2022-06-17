package nc.univ.planning.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

import java.util.List;

@Service
public class CoursService {

    @Autowired
    private CoursRepository coursRepository;

    public Cours saveCours(Cours cours) {
        List<Cours> listCours = coursRepository.findAll();
        for(Cours c:listCours){
            if(c.salle == cours.salle) {
                if ((cours.debut).compareTo(c.debut) < 0 && (cours.fin).compareTo(c.debut) > 0) {
                    return null;
                } else if ((cours.debut).compareTo(c.debut) > 0 && (cours.debut).compareTo(c.fin) < 0){
                    return null;
                }
            }
        }
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

    public List<Cours> deleteCours(Long id) {
        return coursRepository.deleteCoursById(id);
    }

    public List<Cours> findAllCoursByOrderBySalleCode() {
        return coursRepository.findAllCoursByOrderBySalleCode();
    }
}
