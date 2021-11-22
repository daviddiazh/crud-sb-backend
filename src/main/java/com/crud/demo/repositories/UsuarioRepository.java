package com.crud.demo.repositories;

import com.crud.demo.controllers.UsuarioController;
import com.crud.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

}
