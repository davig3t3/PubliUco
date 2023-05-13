package co.edu.uco.publiuco.service.domain;

import java.util.UUID;

public class CiudadDomain {

	private UUID codigo;
	private DepartamentoDomain departamento;
	private String nombre;
	
	
	
	public UUID getCodigo() {
		return codigo;
	}
	public DepartamentoDomain getDepartamento() {
		return departamento;
	}
	public String getNombre() {
		return nombre;
	}
	private void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	private void setDepartamento(DepartamentoDomain departamento) {
		this.departamento = departamento;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
