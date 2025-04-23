package mi.wba.project1;
import org.springframework.stereotype.Controller; //tells Spring this class will handle HTTP requests (request is zB. when sending a formular)
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;//a method in this class will answer to a HTTP GET request
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BSIController{

    @GetMapping("/bsi") //GetMapping = get data or show a page (when visiting /bsi URL and when receiving a GET request)
    public String showForm(){
        return "bsi"; //Spring searches for a bsi.html file and shows it to the user
    }
     @PostMapping("/bsi")
    public String handleForm(
        @RequestParam("kgroesse") int kgroesse, //RequestParam searches for a variable called "kgroesse" in the sent formular that arrived and saves it here
        @RequestParam("sgroesse") int sgroesse,
        @RequestParam("semzahl") int semzahl,
        Model model //model is an object to put things we want to show in our view (HTML)
    ) {
        int bsi = (kgroesse + sgroesse) * semzahl; // ejemplo de cálculo
        model.addAttribute("bsiwert", bsi);
        return "bsi";
    }
}