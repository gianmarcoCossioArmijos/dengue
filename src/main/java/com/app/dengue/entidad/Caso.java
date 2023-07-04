package com.app.dengue.entidad;

import java.util.GregorianCalendar; 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "casos")
public class Caso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fecha")
	private GregorianCalendar fecha;
	
	@Column(name = "laboratorio")
	private String laboratorio;
	
	@Column(name = "clasificacion")
	private String clasificacion;
	
	@Column(name = "direccionsalud")
	private String direccionsalud;
	
	@Column(name = "redsalud")
	private String redsalud;
	
	@Column(name = "establecimiento")
	private String establecimiento;
	
	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "pasciente")
	private int pasciente;

	public Caso() {
	}

	public Caso(GregorianCalendar fecha, String laboratorio, String clasificacion, String direccionsalud,
			String redsalud, String establecimiento, String observaciones, int pasciente) {
		
		this.fecha = fecha;
		this.laboratorio = laboratorio;
		this.clasificacion = clasificacion;
		this.direccionsalud = direccionsalud;
		this.redsalud = redsalud;
		this.establecimiento = establecimiento;
		this.observaciones = observaciones;
		this.pasciente = pasciente;
	}

	@Override
	public String toString() {
		return "Caso [id=" + id + ", fecha=" + fecha + ", laboratorio=" + laboratorio + ", clasificacion="
				+ clasificacion + ", direccionsalud=" + direccionsalud + ", redsalud=" + redsalud + ", establecimiento="
				+ establecimiento + ", observaciones=" + observaciones + ", pasciente=" + pasciente + "]";
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getDireccionsalud() {
		return direccionsalud;
	}

	public void setDireccionsalud(String direccionsalud) {
		this.direccionsalud = direccionsalud;
	}

	public String getRedsalud() {
		return redsalud;
	}

	public void setRedsalud(String redsalud) {
		this.redsalud = redsalud;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getPasciente() {
		return pasciente;
	}

	public void setPasciente(int pasciente) {
		this.pasciente = pasciente;
	}

	public int getId() {
		return id;
	}
}
