package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.budynek;

import pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.wspolnota.Wspolnota;

import javax.persistence.*;
import java.util.List;

@Entity
public class Budynek {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ulica;
    // @ManyToOne // relacja wiele do jednego bo budynek moze nalezec do jednej wspolnoty a kilka budynkow moze nalezec do jednej wspolnoty
    @ManyToOne
    private Wspolnota wspolnota;
    private String numerDomu;

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Wspolnota getWspolnota() {
        return wspolnota;
    }

    public void setWspolnota(Wspolnota wspolnota) {
        this.wspolnota = wspolnota;
    }
}
