package nc.univ.planning.service;

import nc.univ.planning.dao.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursService {

    @Autowired
    private CoursRepository coursRepository;
}
