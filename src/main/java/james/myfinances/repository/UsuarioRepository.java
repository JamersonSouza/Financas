package james.myfinances.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import james.myfinances.modelEntity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	
	
}
