package tn.esprit.pfe.planing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pfe.planing.model.Retour;
import tn.esprit.pfe.planing.service.PlaningService;

@RestController
public class PlaningController {

    @Autowired
    PlaningService ps;

    // ajouter
    @PostMapping(value = "/api/retour")
    public ResponseEntity<Retour> addRetour(@RequestBody Retour retour) {
        retour = ps.addRetour(retour);
        return new ResponseEntity<>(retour, HttpStatus.CREATED);
    }
}
