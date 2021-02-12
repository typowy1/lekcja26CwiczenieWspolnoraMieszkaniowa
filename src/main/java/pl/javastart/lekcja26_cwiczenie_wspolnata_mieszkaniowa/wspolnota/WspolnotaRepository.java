package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.wspolnota;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WspolnotaRepository extends JpaRepository<Wspolnota, Long> {

    //wyświetlamy wszystkie budynki

}
