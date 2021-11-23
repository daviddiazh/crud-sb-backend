package com.crud.demo.controllers;

import com.crud.demo.models.UsuarioModel;
import com.crud.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel user){
        return this.usuarioService.guardarUsuario(user);
    }

    @GetMapping( path = "/{id}" )
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("priority") Integer priority){
        return this.usuarioService.obtenerPorPrioridad(priority);
    }

    @DeleteMapping( path = "/{id}" )
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Eel usuario con id " + id + " se elimino correctamente.";
        }else{
            return "No pudo eliminar el usuario con el id " + id;
        }
    }
}
