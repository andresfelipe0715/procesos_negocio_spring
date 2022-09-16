package com.procesos.negocio.andres.controllers;
import com.procesos.negocio.andres.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UsurioController {

    @GetMapping(value = "/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario ();
        usuario.setId(id);
        usuario.setNombre("Andres");
        usuario.setApellidos("Guaglianoni");
        usuario.setDocumento("5223455");
        usuario.setDireccion("abc 123");
        usuario.setFechaNacimiento(new Date(2020,12,01));
        usuario.setTelefono("2342421");
        return usuario;
    }
}
