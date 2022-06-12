package nc.univ.planning.niveau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NiveauController {
    @Autowired
    NiveauService niveauService;

    @GetMapping("/findAllNiveau")
    public ResponseEntity<List<Niveau>> findAllNiveau() {
        List<Niveau> listNiveau = niveauService.findAllNiveau();
        return new ResponseEntity<>(listNiveau, HttpStatus.OK);
    }

    @PostMapping("/saveNiveau")
    public ResponseEntity<Niveau> saveNiveau(@RequestBody Niveau niveau) {
        Niveau newResult = niveauService.saveNiveau(niveau);
        return new ResponseEntity<>(newResult, HttpStatus.CREATED);
    }

    @GetMapping("/findNiveau/{id}")
    public ResponseEntity<Object> getNiveau(@PathVariable("id") Long id) {
        Object result = niveauService.findNiveau(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/updateNiveau")
    public ResponseEntity<Niveau> updateNiveau(@RequestBody Niveau niveau) {
        niveauService.updateNiveau(niveau);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/deleteNiveau/{id}")
    public ResponseEntity<?> deleteNiveau(@PathVariable("id") Long id) {
        niveauService.deleteNiveau(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
