package nc.univ.planning.eleve;

import nc.univ.planning.cours.Cours;
import nc.univ.planning.eleve.Eleve;
import nc.univ.planning.eleve.EleveRepository;
import nc.univ.planning.eleve.EleveNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleveService {

    @Autowired
    private EleveRepository eleveRepository;

    public Eleve saveEleve(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    public List<Eleve> findAllEleve() {
        return eleveRepository.findAll();
    }

    public Object findEleve(Long id) {
        return  eleveRepository.findEleveById(id).orElseThrow(() -> new EleveNotFoundException("L'élève numéro " + id + " n'est pas enregistré en base de données."));
    }

    public void updateEleve(Eleve eleve) {
        eleveRepository.save(eleve);
    }

    public void deleteEleve(Long id) {
        eleveRepository.deleteEleveById(id);
    }

    public List<Eleve> findAllEleveByOrderByNom() {
        return eleveRepository.findAllEleveByOrderByNom();
    }

    public List<Eleve> findAllEleveByOrderByPrenom() {
        return eleveRepository.findAllEleveByOrderByPrenom();
    }

    public List<Eleve> findAllEleveByOrderByAge() {
        return eleveRepository.findAllEleveByOrderByAge();
    }

    public List<Eleve> findAllEleveByOrderByNiveauCode() {
        return eleveRepository.findAllEleveByOrderByNiveauCode();
    }
}
