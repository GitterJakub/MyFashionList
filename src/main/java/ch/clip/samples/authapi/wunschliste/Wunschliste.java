package ch.clip.samples.authapi.wunschliste;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wunschliste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
