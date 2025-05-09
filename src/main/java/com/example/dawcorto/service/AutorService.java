package com.example.dawcorto.service;

import com.example.dawcorto.model.Autor;
import com.example.dawcorto.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> getAutorById(Long id) {
        return autorRepository.findById(id);
    }

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }
}

