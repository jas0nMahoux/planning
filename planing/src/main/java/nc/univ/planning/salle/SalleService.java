package nc.univ.planning.salle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalleService {

    @Autowired
    private SalleRepository salleRepository;

    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    public List<Salle> findAllSalle() {
        return salleRepository.findAll();
    }

    public Object findSalle(Long id) {
        return  salleRepository.findSalleById(id).orElseThrow(() -> new SalleNotFoundException("La salle numéro " + id + " n'est pas enregistré en base de données."));
    }

    public void updateSalle(Salle salle) {
        salleRepository.save(salle);
    }

    public void deleteSalle(Long id) {
        salleRepository.deleteSalleById(id);
    }
}
