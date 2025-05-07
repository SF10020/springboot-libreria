package com.example.dawcorto.controller;

import com.example.dawcorto.model.Venta;
import com.example.dawcorto.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> getAll() {
        return ventaService.getAllVentas();
    }

    @GetMapping("/{id}")
    public Venta getById(@PathVariable Long id) {
        return ventaService.getVentaById(id).orElse(null);
    }

    @PostMapping
    public Venta create(@RequestBody Venta venta) {
        return ventaService.saveVenta(venta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ventaService.deleteVenta(id);
    }
}

