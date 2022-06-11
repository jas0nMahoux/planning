package nc.univ.planning.eleve;

import nc.univ.planning.exception.EleveNotFoundException;
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

    public Object findEleve(int id) {
        return  eleveRepository.findEleveById(id).orElseThrow(() -> new EleveNotFoundException("L'élève numéro " + id + " n'est pas enregistré en base de données."));
    }

    public Eleve updateEleve(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    public void deleteEleve(int id) {
        eleveRepository.deleteEleveById(id);
    }
}
