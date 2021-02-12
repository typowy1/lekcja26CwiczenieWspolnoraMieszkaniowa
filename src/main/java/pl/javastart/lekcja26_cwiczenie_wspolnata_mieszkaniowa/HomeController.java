package pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.lekcja26_cwiczenie_wspolnata_mieszkaniowa.wspolnota.WspolnotaRepository;

@Controller
public class HomeController {

    private WspolnotaRepository wspolnotaRepository; //pole repo wspólnot

    public HomeController(WspolnotaRepository wspolnotaRepository) { // wstrzykujemy zależność
        this.wspolnotaRepository = wspolnotaRepository;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("wspolnoty", wspolnotaRepository.findAll()); //pobieramy wszystkie wspolnoty
        return "home";
    }
}
