package nc.univ.planning.eleve;

import nc.univ.planning.model.Eleve;
import nc.univ.planning.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EleveController {
    @Autowired
    EleveService eleveService;

    @GetMapping("/findAllEleve")
    public ResponseEntity<List<Eleve>> findAllEleve() {
        List<Eleve> listEleve = eleveService.findAllEleve();
        return new ResponseEntity<>(listEleve, HttpStatus.OK);
    }

    @PostMapping("/save/{eleve}")
    public ResponseEntity<Eleve> saveEleve(@PathVariable("eleve") Eleve eleve) {
        Eleve newResult = eleveService.saveEleve(eleve);
        return new ResponseEntity<>(newResult, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Object> getResultat(@PathVariable("id") int id) {
        Object result = eleveService.findEleve(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Eleve> updateEleve(@RequestBody Eleve eleve) {
        Eleve updateEleve = eleveService.updateEleve(eleve);
        return new ResponseEntity<>(updateEleve, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEleve(@PathVariable("id") int id) {
        eleveService.deleteEleve(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
