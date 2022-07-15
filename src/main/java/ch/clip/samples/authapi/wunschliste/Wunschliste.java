package ch.clip.samples.authapi.wunschliste;

import ch.clip.samples.authapi.hose.Hose;
import ch.clip.samples.authapi.schuhe.Schuhe;
import ch.clip.samples.authapi.shirt.Shirt;
import ch.clip.samples.authapi.user.AppUser;

import javax.persistence.*;
import java.util.*;

@Entity
public class Wunschliste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //TODO Fremdschlüssel vom User, Hose, Schuhe, Shirt

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private AppUser user;

    public Wunschliste() {
    }

    @ManyToMany
    @JoinTable(
            name = "selected_hosen",
            joinColumns = @JoinColumn(name = "wunschliste_id"),
            inverseJoinColumns = @JoinColumn(name = "hosen_id")
    )
    private Set<Hose> selectedHosen;

    @ManyToMany
    @JoinTable(
            name = "selected_shirts",
            joinColumns = @JoinColumn(name = "wunschliste_id"),
            inverseJoinColumns = @JoinColumn(name = "shirt_id")
    )
    private Set<Shirt> selectedShirts;

    @ManyToMany
    @JoinTable(
            name = "selected_schuhe",
            joinColumns = @JoinColumn(name = "wunschliste_id"),
            inverseJoinColumns = @JoinColumn(name = "schuhe_id")
    )
    private Set<Schuhe> selectedSchuhe;

    public Wunschliste(AppUser user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public void setSelectedHosen(Set<Hose> selectedHosen) {
        this.selectedHosen = selectedHosen;
    }

    public Set<Hose> getSelectedHosen() {
        return selectedHosen;
    }

    public Set<Shirt> getSelectedShirts() {
        return selectedShirts;
    }

    public void setSelectedShirts(Set<Shirt> selectedShirts) {
        this.selectedShirts = selectedShirts;
    }

    public Set<Schuhe> getSelectedSchuhe() {
        return selectedSchuhe;
    }

    public void setSelectedSchuhe(Set<Schuhe> selectedSchuhe) {
        this.selectedSchuhe = selectedSchuhe;
    }
}
