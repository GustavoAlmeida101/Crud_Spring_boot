package crudsipring.crud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import crudsipring.crud.model.Usuario;



public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

    
} 
