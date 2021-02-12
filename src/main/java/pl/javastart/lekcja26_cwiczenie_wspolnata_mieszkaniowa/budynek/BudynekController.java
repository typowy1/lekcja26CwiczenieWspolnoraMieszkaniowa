package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.budynek;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.wspolnota.WspolnotaRepository;

@Controller
public class BudynekController {
    private WspolnotaRepository wspolnotaRepository;
    private BudynekRepository budynekRepository;

    public BudynekController(WspolnotaRepository wspolnotaRepository, BudynekRepository budynekRepository) {
        this.wspolnotaRepository = wspolnotaRepository;
        this.budynekRepository = budynekRepository;
    }

    //dodawanie budynku
    @GetMapping("/budynek/dodaj")
    public String addForm(Model model, @RequestParam Long wspolnotaId) {

        Budynek budynek = new Budynek();
        budynek.setWspolnota(wspolnotaRepository.findById(wspolnotaId).orElse(null)); // jak będzie to pobierz a jak nie to daj wartosc null
        model.addAttribute("budynek", budynek);
        model.addAttribute("wspolnoty", wspolnotaRepository.findAll());
        return "budynekDodaj";
    }

    //dodawanie budynku z formularza
    @PostMapping("/budynek/dodaj")
    public String addForm(Budynek budynek) {
        budynekRepository.save(budynek);
        return "redirect:/wspolnota/" + budynek.getWspolnota().getId();
    }
}
