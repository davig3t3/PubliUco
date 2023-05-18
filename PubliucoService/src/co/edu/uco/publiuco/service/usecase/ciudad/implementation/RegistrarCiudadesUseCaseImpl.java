package co.edu.uco.publiuco.service.usecase.ciudad.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.RegistrarCiudad;

@Service
public class RegistrarCiudadesUseCaseImpl implements RegistrarCiudad{

	@Autowired
	private CiudadRepository repository;
	
	@Override
	public void execute(CiudadDomain domain) {
		// Crear las reglas de negocio
		// Specification Pattern o un Validator Pattern
		
		// Aqui se debe crear el ensamblador 
		CiudadEntity entity = null;
		repository.save(entity);
	}

}
