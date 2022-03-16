package PAT.Practica5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MiController {
    
    @GetMapping("/contacto")
    public String getContacto() {
        return "Ejecutado con exito";
    }

    @PostMapping("/contacto")
    public Contacto postContacto(@RequestBody Contacto contacto){
        return contacto;
    }
}
