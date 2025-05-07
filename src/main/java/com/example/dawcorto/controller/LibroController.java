package com.example.dawcorto.controller;

import com.example.dawcorto.model.Libro;
import com.example.dawcorto.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getAll() {
        return libroService.getAllLibros();
    }

    @GetMapping("/{id}")
    public Libro getById(@PathVariable Long id) {
        return libroService.getLibroById(id).orElse(null);
    }

    @PostMapping
    public Libro create(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        libroService.deleteLibro(id);
    }
}

