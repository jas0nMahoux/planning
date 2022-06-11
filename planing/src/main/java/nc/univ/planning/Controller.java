package nc.univ.planning;

import nc.univ.planning.service.EleveService;
import nc.univ.planning.model.Eleve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    EleveService eleveService;

    @GetMapping("/findAllEleve")
    public ResponseEntity<List<Eleve>> findAllEleve() {
        List<Eleve> pbMaths = eleveService.findAllEleve();
        return new ResponseEntity<>(pbMaths, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Eleve> saveEleve(@RequestBody Eleve eleve) {
        Eleve newResult = eleveService.saveEleve(eleve);
        return new ResponseEntity<>(newResult, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Object> getResultat(@PathVariable("id") Long id) {
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
    public ResponseEntity<?> deleteEleve(@PathVariable("id") Long id) {
        eleveService.deleteEleve(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
