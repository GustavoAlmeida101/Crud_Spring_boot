package crudsipring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import crudsipring.crud.model.Usuario;

import crudsipring.crud.repositorio.UsuarioRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioRepositorio repositorio;

    @GetMapping
    public List<Usuario> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario) {
        return repositorio.save(usuario);

    }

    @PutMapping
    public Usuario alterar(@RequestBody Usuario usuario){
        if(usuario.getId()>0){
            repositorio.save(usuario);
        }
        return null;
    
    }

    public String deletar(@RequestBody Usuario usuario){
        if(usuario.getId()>0){
            repositorio.delete(usuario);
            return "Removido com sucesso";
        }
        return "Usuario não encontrado";
    }

}