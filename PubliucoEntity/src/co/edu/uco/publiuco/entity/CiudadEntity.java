package co.edu.uco.publiuco.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Ciudad")
public class CiudadEntity {
	
	@Id
	private UUID codigo;
	@ManyToOne
	@JoinColumn(name = "departamento")
	private DepartamentoEntity departamento;
	private String nombre;

}
