package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Odczyt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;
    private double wartosc;

    @ManyToOne // wiele odczytów może byc do jednego licznika
    private Licznik licznik;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public Licznik getLicznik() {
        return licznik;
    }

    public void setLicznik(Licznik licznik) {
        this.licznik = licznik;
    }
}
