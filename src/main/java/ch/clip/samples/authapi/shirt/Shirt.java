package ch.clip.samples.authapi.shirt;

import ch.clip.samples.authapi.wunschliste.Wunschliste;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Shirt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String farbe;
    private String marke;
    private double groesse;
    @ManyToMany(mappedBy = "selectedShirts")
    Set<Wunschliste> wunschlisten;

    public Shirt(String name, String farbe, String marke, double groesse) {
        this.name = name;
        this.farbe = farbe;
        this.marke = marke;
        this.groesse = groesse;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }
}
