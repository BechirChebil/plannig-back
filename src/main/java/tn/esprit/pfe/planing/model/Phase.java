package tn.esprit.pfe.planing.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Phase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String objectif;
    private String rendu;

    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Temporal(TemporalType.TIME)
    private Date endTime;

    public Phase() {
    }

    public Phase(int id, String titre, String objectif, String rendu, Date startTime, Date endTime) {
        this.id = id;
        this.titre = titre;
        this.objectif = objectif;
        this.rendu = rendu;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getRendu() {
        return rendu;
    }

    public void setRendu(String rendu) {
        this.rendu = rendu;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Phase{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", objectif='" + objectif + '\'' +
                ", rendu='" + rendu + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
