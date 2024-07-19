package cl.praxis.desafio.desafioSpring.controller;

import cl.praxis.desafio.desafioSpring.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    private Persona persona = new Persona ("Angla", "Nappe", 30);

    @GetMapping("/nombrePersona")
    public String nombrePersona() {
        System.out.println(persona);
        return persona.toString();
    }

    @GetMapping("/saludar")
    public String saludar() {
        if (persona != null) {
            System.out.println("Hola, " + persona.getNombre() + " " + persona.getApellido() + "!");
            return "Hola, " + persona.getNombre() + " " + persona.getApellido() + "!";
        } else {
            System.out.println("Bienvenid@!");
            return "Bienvenid@!";
        }
    }
}
