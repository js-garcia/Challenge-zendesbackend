package com.challenge.zendeskbackend.service;

import com.challenge.zendeskbackend.model.Carrera;
import com.challenge.zendeskbackend.repository.CarreraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService {

    private final CarreraRepository repository;

    public CarreraService(CarreraRepository repository) {
        this.repository = repository;
    }

    public List<Carrera> listarTodas() {
        return repository.findAll();
    }

    public Carrera guardar(Carrera carrera) {
        return repository.save(carrera);
    }

    public Carrera actualizar(Long id, Carrera datos) {
        Carrera carrera = repository.findById(id).orElseThrow();
        carrera.setNombre(datos.getNombre());
        carrera.setDescripcion(datos.getDescripcion());
        return repository.save(carrera);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

