package co.edu.uco.publiuco.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.publiuco.entity.CiudadEntity;

@Repository
public interface CiudadRepository extends JpaRepository<CiudadEntity, UUID>{

}
