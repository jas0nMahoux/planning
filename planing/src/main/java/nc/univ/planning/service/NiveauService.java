package nc.univ.planning.service;

import nc.univ.planning.dao.NiveauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NiveauService {

    @Autowired
    private NiveauRepository niveauRepository;
}
