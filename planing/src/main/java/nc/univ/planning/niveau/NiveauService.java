package nc.univ.planning.niveau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NiveauService {

    @Autowired
    private NiveauRepository niveauRepository;

    public Niveau saveNiveau(Niveau niveau) {
        return niveauRepository.save(niveau);
    }

    public List<Niveau> findAllNiveau() {
        return niveauRepository.findAll();
    }

    public Object findNiveau(Long id) {
        return  niveauRepository.findNiveauById(id).orElseThrow(() -> new NiveauNotFoundException("Le niveau numéro " + id + " n'est pas enregistré en base de données."));
    }

    public void updateNiveau(Niveau niveau) {
        niveauRepository.save(niveau);
    }

    public void deleteNiveau(Long id) {
        niveauRepository.deleteNiveauById(id);
    }
}
