package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.wspolnota;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.budynek.BudynekRepository;

import java.util.Optional;

@Controller
public class WspolnotaController {

    private WspolnotaRepository wspolnotaRepository;
    private BudynekRepository budynekRepository;

    public WspolnotaController(WspolnotaRepository wspolnotaRepository, BudynekRepository budynekRepository) {
        this.wspolnotaRepository = wspolnotaRepository;
        this.budynekRepository = budynekRepository;
    }

    @GetMapping("/wspolnota/{id}")
    public String wspolnota(@PathVariable Long id, Model model) { //przechwytujemy id z parametru

        Optional<Wspolnota> wspolnotaOptional = wspolnotaRepository.findById(id); //wyszukujemy wspolnoty o id

        if (wspolnotaOptional.isPresent()) { // jeśli jest to dodajemy do modelu
            Wspolnota wspolnota = wspolnotaOptional.get();
            model.addAttribute("wspolnota", wspolnota); // pobieramy wartość
            return "wspolnota";
        } else {
            return "error";
        }
    }

    @GetMapping("/wspolnota/usun/{id}")
    public String usun(@PathVariable Long id) {
        budynekRepository.deleteByWspolnotaId(id);
        wspolnotaRepository.deleteById(id);
        return "redirect:/";
    }
}
