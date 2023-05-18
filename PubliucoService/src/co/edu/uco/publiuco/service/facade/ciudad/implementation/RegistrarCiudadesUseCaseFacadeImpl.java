package co.edu.uco.publiuco.service.facade.ciudad.implementation;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uco.publiuco.dto.CiudadDTO;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
//import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadUseCaseFacade;
import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadesUseCaseFacade;
import co.edu.uco.publiuco.service.mapper.CiudadMapper;
import co.edu.uco.publiuco.service.mapper.CiudadMapperr;
import co.edu.uco.publiuco.service.usecase.ciudad.RegistrarCiudad;

@Service
@Transactional
public class RegistrarCiudadesUseCaseFacadeImpl implements RegistrarCiudadesUseCaseFacade{

	@Autowired
	private RegistrarCiudad useCase;
	
	@Autowired
	private static CiudadMapperr ciudadMapperr;
	
	@Override
	public void execute(CiudadDTO dto) {
		// TODO Auto-generated method stub
		
		// Sirve el assembler para llevar de DTO a Domain
		
		CiudadDomain domain = ciudadMapperr.toDomain(dto);
		
		useCase.execute(domain);
		
	}
	
	

}
