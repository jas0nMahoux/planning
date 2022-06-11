package nc.univ.planning.service;

import nc.univ.planning.dao.EleveRepository;
import nc.univ.planning.exception.EleveNotFoundException;
import nc.univ.planning.model.Eleve;
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

    public Eleve updateEleve(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    public void deleteEleve(Long id) {
        eleveRepository.deleteEleveById(id);
    }
}
