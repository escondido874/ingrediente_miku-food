package com.example.ingredientes_miku_food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ingredientes_miku_food.model.ingrediente;
import com.example.ingredientes_miku_food.service.IngredienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping()
    public ResponseEntity<List<ingrediente>> listar(){
        List<ingrediente> ingredientes = ingredienteService.listaIngredientes();

        if (ingredientes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ingredientes);
    }

    @PostMapping("agregar")
    public ingrediente agregaIngrediente(@RequestBody ingrediente nuevoIngrediente) {
        return ingredienteService.agregarIngreediente(nuevoIngrediente);
    }
    

}
