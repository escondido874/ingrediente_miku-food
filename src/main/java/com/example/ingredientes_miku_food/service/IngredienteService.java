package com.example.ingredientes_miku_food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ingredientes_miku_food.model.ingrediente;
import com.example.ingredientes_miku_food.repository.ingredienterepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class IngredienteService {
    
    @Autowired
    private ingredienterepository ingredienterepository;

    public ingrediente agregarIngreediente(ingrediente ing){
        ingredienterepository.save(ing);
        return ing;
    }

    public List<ingrediente> listaIngredientes(){
        return ingredienterepository.findAll();
    }

    // public ingrediente buscarporID(Long id){
    //     return ingredienterepository.findById(id).get();
    // }

    // public void elimIngredienteID(Long id){
    //     ingredienterepository.deleteById(id);
    // }

}
