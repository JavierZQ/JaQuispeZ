package edu.ilp.JaQuispe.dao;

import edu.ilp.JaQuispe.entity.Estidiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estidiante,Long> {
    @Query(value = "SELECT e FROM Estidiante e WHERE e.codigo = ?1")
    Estidiante buscarPorCodigo(String codigo);
}
