package nc.univ.planning.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CoursController {
    @Autowired
    CoursService coursService;

    @GetMapping("/findAllCours")
    public ResponseEntity<List<Cours>> findAllCours() {
        List<Cours> listCours = coursService.findAllCours();
        return new ResponseEntity<>(listCours, HttpStatus.OK);
    }

    @PostMapping("/saveCours")
    public ResponseEntity<Cours> saveCours(@RequestBody Cours cours) {
        Cours newResult = coursService.saveCours(cours);
        return new ResponseEntity<>(newResult, HttpStatus.CREATED);
    }

    @GetMapping("/findCours/{id}")
    public ResponseEntity<Object> getCours(@PathVariable("id") Long id) {
        Object result = coursService.findCours(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/updateCours")
    public ResponseEntity<Cours> updateCours(@RequestBody Cours cours) {
        coursService.updateCours(cours);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/deleteCours/{id}")
    public ResponseEntity<List<Cours>> deleteCours(@PathVariable("id") Long id) {
        List<Cours> listCours = coursService.deleteCours(id);
        return new ResponseEntity<>(listCours, HttpStatus.OK);
    }

    @GetMapping("/findAllCours/salle")
    public ResponseEntity<List<Cours>> findAllCoursByOrderBySalleCode() {
        List<Cours> listCours = coursService.findAllCoursByOrderBySalleCode();
        return new ResponseEntity<>(listCours, HttpStatus.OK);
    }
}
