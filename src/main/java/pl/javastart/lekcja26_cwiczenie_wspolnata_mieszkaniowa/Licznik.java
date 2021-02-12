package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa;

import javax.persistence.*;

@Entity
public class Licznik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numer;

    @ManyToOne
    private Mieszkanie mieszkanie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public Mieszkanie getMieszkanie() {
        return mieszkanie;
    }

    public void setMieszkanie(Mieszkanie mieszkanie) {
        this.mieszkanie = mieszkanie;
    }
}
