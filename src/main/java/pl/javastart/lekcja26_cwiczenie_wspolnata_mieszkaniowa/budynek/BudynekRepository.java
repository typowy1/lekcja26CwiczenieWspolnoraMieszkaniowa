package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.budynek;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.wspolnota.Wspolnota;

import javax.transaction.Transactional;
import java.util.List;

public interface BudynekRepository extends JpaRepository<Budynek, Long> {

    // zwracamy listę budynków
    List<Budynek> findByWspolnota(Wspolnota wspolnota); // to zadziała dletego że w budynku przekazujemy informacje o wspolnocie

    @Modifying
    @Transactional
    void deleteByWspolnotaId(Long id); //usówanie
    //można też w wspólnocie w polu budynki dodać w one to many cascade = cascadeType.Remove i wtedy to będzie zarządzać
    // usówaniem wszystkich zależnych tabel

}
