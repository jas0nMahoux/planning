package nc.univ.planning.service;

import nc.univ.planning.dao.SalleRepository;
import nc.univ.planning.model.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleService {

    private final SalleRepository salleRepository;

    @Autowired
    public SalleService(SalleRepository salleRepository){
        this.salleRepository = salleRepository;
    }

    public List<Salle> findAllSalle(){
        return salleRepository.findAll();
    }

    public Salle updateSalle(Salle salle){
        return salleRepository.save(salle);
    }

    public void deleteSalle(Long id){
        salleRepository.deleteSalleById(id);
    }
}
