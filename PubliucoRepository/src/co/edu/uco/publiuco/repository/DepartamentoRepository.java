package co.edu.uco.publiuco.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.publiuco.entity.DepartamentoEntity;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, UUID>{

}
