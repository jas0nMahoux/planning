package nc.univ.planning.niveau;

import nc.univ.planning.niveau.NiveauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NiveauService {

    @Autowired
    private NiveauRepository niveauRepository;

    public void delete(Long id) {
        niveauRepository.deleteNiveauById(id);
    }
}
