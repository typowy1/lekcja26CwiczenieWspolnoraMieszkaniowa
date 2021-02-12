package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.wspolnota;

import pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.budynek.Budynek;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wspolnota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "wspolnota")
    private List<Budynek> budynki;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Budynek> getBudynki() {
        return budynki;
    }

    public void setBudynki(List<Budynek> budynki) {
        this.budynki = budynki;
    }
}
