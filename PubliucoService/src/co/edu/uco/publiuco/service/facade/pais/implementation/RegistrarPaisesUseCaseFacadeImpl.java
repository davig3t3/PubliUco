package co.edu.uco.publiuco.service.facade.pais.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uco.publiuco.dto.PaisDTO;
import co.edu.uco.publiuco.service.domain.PaisDomain;
//import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadUseCaseFacade;
import co.edu.uco.publiuco.service.facade.pais.RegistrarPaisesUseCaseFacade;
import co.edu.uco.publiuco.service.usecase.pais.RegistrarPais;

@Service
@Transactional
public class RegistrarPaisesUseCaseFacadeImpl implements RegistrarPaisesUseCaseFacade{

	@Autowired
	private RegistrarPais useCase;
	
	@Override
	public void execute(PaisDTO dto) {
		// TODO Auto-generated method stub
		
		// Sirve el assembler para llevar de DTO a Domain
		
		PaisDomain domain = null;
		
		useCase.execute(domain);
		
	}

}
