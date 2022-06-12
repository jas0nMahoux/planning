package nc.univ.planning.salle;

import nc.univ.planning.salle.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalleService {

    @Autowired
    private SalleRepository salleRepository;

    public void delete(Long id) {
        salleRepository.deleteSalleById(id);
    }

    public List<Salle> findAll(){
        return salleRepository.findAll();
    }
}
