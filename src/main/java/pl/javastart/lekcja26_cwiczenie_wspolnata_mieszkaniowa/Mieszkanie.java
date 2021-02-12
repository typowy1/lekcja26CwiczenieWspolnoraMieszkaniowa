package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa;

import pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.budynek.Budynek;

import javax.persistence.*;

@Entity
public class Mieszkanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private double powierzchnia;

    @ManyToOne
    private Budynek budynek;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public Budynek getBudynek() {
        return budynek;
    }

    public void setBudynek(Budynek budynek) {
        this.budynek = budynek;
    }
}
