package com.app.dengue.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pascientes")
public class Pasciente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "nacimiento")
	private String nacimiento;
	
	@Column(name = "edad")
	private String edad;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "historiaclinica")
	private String historiaclinica;
	
	@Column(name = "localidad")
	private String localidad;
	
	@Column(name = "distrito")
	private String distrito;
	
	@Column(name = "provincia")
	private String provincia;
	
	@Column(name = "departamento")
	private String departamento;

	public Pasciente() {
	}

	public Pasciente(String dni, String nombre, String apellido, String nacimiento, String edad, String sexo,
			String direccion, String historiaclinica, String localidad, String distrito, String provincia,
			String departamento) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.historiaclinica = historiaclinica;
		this.localidad = localidad;
		this.distrito = distrito;
		this.provincia = provincia;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Pasciente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", nacimiento=" + nacimiento + ", edad=" + edad + ", sexo=" + sexo + ", direccion=" + direccion
				+ ", historiaclinica=" + historiaclinica + ", localidad=" + localidad + ", distrito=" + distrito
				+ ", provincia=" + provincia + ", departamento=" + departamento + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHistoriaclinica() {
		return historiaclinica;
	}

	public void setHistoriaclinica(String historiaclinica) {
		this.historiaclinica = historiaclinica;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}
}
