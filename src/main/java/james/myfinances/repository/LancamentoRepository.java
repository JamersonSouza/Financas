package james.myfinances.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import james.myfinances.modelEntity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer> {

}
