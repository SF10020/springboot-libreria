package com.example.dawcorto.service;

import com.example.dawcorto.model.Libro;
import com.example.dawcorto.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    public Optional<Libro> getLibroById(Long id) {
        return libroRepository.findById(id);
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
