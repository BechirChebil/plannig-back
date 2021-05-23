package tn.esprit.pfe.planing.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Planing {

   @Id
   private int idSeance;

   @Id

   private int idPhase;

   @Id
   private int idRetour;


   public Planing() {
   }

   public Planing(int idSeance, int idPhase, int idRetour) {
      this.idSeance = idSeance;
      this.idPhase = idPhase;
      this.idRetour = idRetour;
   }

   @Override
   public String toString() {
      return "Planing{" +
              "idSeance=" + idSeance +
              ", idPhase=" + idPhase +
              ", idRetour=" + idRetour +
              '}';
   }
}
