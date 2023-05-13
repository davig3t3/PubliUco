package co.edu.uco.publiuco.api.controller.ciudad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.publiuco.dto.CiudadDTO;
//import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadUseCaseFacade;
import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadesUseCaseFacade;

@RestController
@RequestMapping("publiuco/api/v1/ciudad")
public class RegistrarCiudadController {
	
	@Autowired
	private RegistrarCiudadesUseCaseFacade facade;
	
	@PostMapping
	public ResponseEntity<String> execute(@RequestBody CiudadDTO ciudad){
		//validator
		facade.execute(ciudad);
		return new ResponseEntity<>("Exito", HttpStatus.ACCEPTED);
	}

}
