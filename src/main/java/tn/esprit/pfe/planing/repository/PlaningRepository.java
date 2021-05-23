package tn.esprit.pfe.planing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pfe.planing.model.Planing;

@Repository
public interface PlaningRepository extends CrudRepository<Planing,Integer> {
}
