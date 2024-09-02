package co.edu.uceva.celularservice.controller;


import co.edu.uceva.celularservice.model.entities.Celular;
import co.edu.uceva.celularservice.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/celulares-service")
public class CountryRestController {

    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/celular")
    public List<Celular> listar(){
        return this.celularService.listar();
    }
    @GetMapping("/celular/{id}")
    public Celular buscarCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @PutMapping("/celular")
    public Celular actualizarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @DeleteMapping("/celular/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id);
        this.celularService.delete(celular);
    }
}
