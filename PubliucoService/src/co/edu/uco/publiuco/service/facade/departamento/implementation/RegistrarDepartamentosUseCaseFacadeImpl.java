package co.edu.uco.publiuco.service.facade.departamento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uco.publiuco.dto.DepartamentoDTO;
import co.edu.uco.publiuco.service.domain.DepartamentoDomain;
//import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadUseCaseFacade;
import co.edu.uco.publiuco.service.facade.departamento.RegistrarDepartamentosUseCaseFacade;
import co.edu.uco.publiuco.service.usecase.departamento.RegistrarDepartamento;

@Service
@Transactional
public class RegistrarDepartamentosUseCaseFacadeImpl implements RegistrarDepartamentosUseCaseFacade{

	@Autowired
	private RegistrarDepartamento useCase;
	
	@Override
	public void execute(DepartamentoDTO dto) {
		// TODO Auto-generated method stub
		
		// Sirve el assembler para llevar de DTO a Domain
		
		DepartamentoDomain domain = null;
		
		useCase.execute(domain);
		
	}

}
