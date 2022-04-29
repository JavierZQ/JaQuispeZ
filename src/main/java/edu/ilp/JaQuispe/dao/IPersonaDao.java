package edu.ilp.JaQuispe.dao;

import edu.ilp.JaQuispe.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
