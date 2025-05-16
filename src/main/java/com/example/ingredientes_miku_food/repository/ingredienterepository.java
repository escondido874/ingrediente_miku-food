package com.example.ingredientes_miku_food.repository;
import com.example.ingredientes_miku_food.model.ingrediente;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ingredienterepository extends JpaRepository<ingrediente, Long>{

    ingrediente agregarIngreediente(ingrediente nuevoIng);

    List<ingrediente> listaIngredientes();

    ingrediente buscarporID(Integer id);

    String reducirStock(int cantidad, Integer idIngrediente);

    String aumentarStock(int cantidad, Integer idIngrediente);

    ingrediente buscarXnombre(String name);

    String elimIngredienteID(Integer id);

    String elimIngredientename(String name);

    

}
