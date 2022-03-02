package PAT.Practica5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class MiController {
    
    @GetMapping("/algo")
    public String getAlgo() {
        return "a";
    }

    @PostMapping("/algo")
    public String postAlgo(){
        return "e";
    }
}
