package nc.univ.planning.salle;

import nc.univ.planning.eleve.Eleve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SalleController {

    @Autowired
    SalleService salleService;

    @GetMapping("/findAllSalle")
    public ResponseEntity<List<Salle>> findAllSalle() {
        List<Salle> listSalle = salleService.findAllSalle();
        return new ResponseEntity<>(listSalle, HttpStatus.OK);
    }

    @PostMapping("/saveSalle")
    public ResponseEntity<Salle> saveSalle(@RequestBody Salle salle) {
        Salle newResult = salleService.saveSalle(salle);
        return new ResponseEntity<>(newResult, HttpStatus.CREATED);
    }

    @GetMapping("/findSalle/{id}")
    public ResponseEntity<Object> getSalle(@PathVariable("id") Long id) {
        Object result = salleService.findSalle(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/updateSalle")
    public ResponseEntity<Salle> updateSalle(@RequestBody Salle salle) {
        salleService.updateSalle(salle);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/deleteSalle/{id}")
    public ResponseEntity<?> deleteSalle(@PathVariable("id") Long id) {
        salleService.deleteSalle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
