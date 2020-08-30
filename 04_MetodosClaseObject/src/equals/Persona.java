package equals;

import java.time.LocalDate;
import java.util.Objects;


public class Persona {
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	
	
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, fechaNacimiento, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + "]";
	}


}
