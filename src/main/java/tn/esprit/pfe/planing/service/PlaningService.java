package tn.esprit.pfe.planing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pfe.planing.model.Retour;
import tn.esprit.pfe.planing.repository.PlaningRepository;

@Service
public class PlaningService {
    @Autowired
    PlaningRepository pr;



    public Retour addRetour(Retour retour) {
        return pr.save(retour);
    }
}
