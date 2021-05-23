package tn.esprit.pfe.planing.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String sujet;
    private String objectif;
    private String aller;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    private String creneau;

    public Seance() {
    }

    public Seance(int id, List<Phase> phases, String sujet, String objectif,
                  String aller, Retour retour, Date startTime, Date endTime, String creneau) {
        this.id = id;
        this.phases = phases;
        this.sujet = sujet;
        this.objectif = objectif;
        this.aller = aller;
        this.retour = retour;
        this.startTime = startTime;
        this.endTime = endTime;
        this.creneau = creneau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getAller() {
        return aller;
    }

    public void setAller(String aller) {
        this.aller = aller;
    }

    public Retour getRetour() {
        return retour;
    }

    public void setRetour(Retour retour) {
        this.retour = retour;
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

    public String getCreneau() {
        return creneau;
    }

    public void setCreneau(String creneau) {
        this.creneau = creneau;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "id=" + id +
                ", phases=" + phases +
                ", sujet='" + sujet + '\'' +
                ", objectif='" + objectif + '\'' +
                ", aller='" + aller + '\'' +
                ", retour=" + retour +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", creneau='" + creneau + '\'' +
                '}';
    }
}
