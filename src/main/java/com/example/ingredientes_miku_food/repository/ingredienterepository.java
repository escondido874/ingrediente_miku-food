package com.example.ingredientes_miku_food.repository;
import com.example.ingredientes_miku_food.model.ingrediente;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ingredienterepository extends JpaRepository<ingrediente, Long>{

    // ingrediente agregarIngreediente(ingrediente nuevoIng);

    // public List<ingrediente> ingredientes=new List<ingrediente>();

    // List<ingrediente> listaIngredientes();

    // ingrediente buscarporID(Long id);

    // String reducirStock(int cantidad, Long idIngrediente);

    // String aumentarStock(int cantidad, Long idIngrediente);

    // ingrediente buscarXnombre(String name);

    // String elimIngredienteID(Long id);

    // String elimIngredientename(String name);

    

}
