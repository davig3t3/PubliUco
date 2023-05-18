package co.edu.uco.publiuco.service.usecase.pais.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.entity.PaisEntity;
import co.edu.uco.publiuco.repository.PaisRepository;
import co.edu.uco.publiuco.service.domain.PaisDomain;
import co.edu.uco.publiuco.service.usecase.pais.RegistrarPais;

@Service
public class RegistrarPaisesUseCaseImpl implements RegistrarPais{

	@Autowired
	private PaisRepository repository;
	
	@Override
	public void execute(PaisDomain domain) {
		// Crear las reglas de negocio
		// Specification Pattern o un Validator Pattern
		
		// Aqui se debe crear el ensamblador 
		PaisEntity entity = null;
		repository.save(entity);
	}

}
