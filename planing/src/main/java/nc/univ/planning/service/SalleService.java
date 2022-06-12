package nc.univ.planning.service;

import nc.univ.planning.dao.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalleService {

    @Autowired
    private SalleRepository salleRepository;
}
