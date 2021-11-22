package com.crud.demo.repositories;

import com.crud.demo.controllers.UsuarioController;
import com.crud.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {



}
