package com.example.dawcorto.controller;

import com.example.dawcorto.model.Autor;
import com.example.dawcorto.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> getAll() {
        return autorService.getAllAutores();
    }

    @GetMapping("/{id}")
    public Autor getById(@PathVariable Long id) {
        return autorService.getAutorById(id).orElse(null);
    }

    @PostMapping
    public Autor create(@RequestBody Autor autor) {
        return autorService.saveAutor(autor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        autorService.deleteAutor(id);
    }
}
