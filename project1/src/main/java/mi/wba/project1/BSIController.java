package mi.wba.project1;
import org.springframework.stereotype.Controller; //tells Spring this class will handle HTTP requests (request is zB. when sending a formular)
import org.springframework.web.bind.annotation.GetMapping;//a method in this class will answer to a HTTP GET request

@Controller
public class BSIController{

    @GetMapping("/bsi") //this method will be executed when visiting the url: /bsi, when receiving a GET request
    public String showForm(){
        return "bsi"; //Spring searches for a bsi.html file and shows it to the user
    }
}