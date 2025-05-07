package com.example.dawcorto.service;

import com.example.dawcorto.model.DetalleVenta;
import com.example.dawcorto.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    public List<DetalleVenta> getAllDetalles() {
        return detalleVentaRepository.findAll();
    }

    public Optional<DetalleVenta> getDetalleById(Long id) {
        return detalleVentaRepository.findById(id);
    }

    public DetalleVenta saveDetalle(DetalleVenta detalle) {
        return detalleVentaRepository.save(detalle);
    }

    public void deleteDetalle(Long id) {
        detalleVentaRepository.deleteById(id);
    }
}

