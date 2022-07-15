package ch.clip.samples.authapi.wunschliste;

import ch.clip.samples.authapi.user.AppUser;

import javax.persistence.*;

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
}
