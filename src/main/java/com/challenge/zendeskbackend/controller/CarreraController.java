package com.challenge.zendeskbackend.controller;

import com.challenge.zendeskbackend.model.Carrera;
import com.challenge.zendeskbackend.service.CarreraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carreras")
public class CarreraController {

    private final CarreraService service;

    public CarreraController(CarreraService service) {
        this.service = service;
    }

    @GetMapping
    public List<Carrera> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public Carrera crear(@RequestBody Carrera carrera) {
        return service.guardar(carrera);
    }

    @PutMapping("/{id}")
    public Carrera actualizar(@PathVariable Long id, @RequestBody Carrera carrera) {
        return service.actualizar(id, carrera);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
