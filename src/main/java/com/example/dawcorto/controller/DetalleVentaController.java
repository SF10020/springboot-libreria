package com.example.dawcorto.controller;

import com.example.dawcorto.model.DetalleVenta;
import com.example.dawcorto.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVenta> getAll() {
        return detalleVentaService.getAllDetalles();
    }

    @GetMapping("/{id}")
    public DetalleVenta getById(@PathVariable Long id) {
        return detalleVentaService.getDetalleById(id).orElse(null);
    }

    @PostMapping
    public DetalleVenta create(@RequestBody DetalleVenta detalle) {
        return detalleVentaService.saveDetalle(detalle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        detalleVentaService.deleteDetalle(id);
    }
}

