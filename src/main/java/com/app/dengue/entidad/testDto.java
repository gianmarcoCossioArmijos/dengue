package com.app.dengue.entidad;

public class testDto {
	
	private String fiebre;
	private String dolorCabeza;
	private String nauseasVomitos;
	private String dolorOjos;
	private String sarpullido;
	private String dolorHuesos;
	
	public testDto() {

	}

	public testDto(String fiebre, String dolorCabeza, String nauseasVomitos, String dolorOjos,
			String sarpullido, String dolorHuesos) {

		this.fiebre = fiebre;
		this.dolorCabeza = dolorCabeza;
		this.nauseasVomitos = nauseasVomitos;
		this.dolorOjos = dolorOjos;
		this.sarpullido = sarpullido;
		this.dolorHuesos = dolorHuesos;
	}

	@Override
	public String toString() {
		return "testDto [fiebre=" + fiebre + ", dolorCabeza=" + dolorCabeza + ", nauseasVomitos=" + nauseasVomitos
				+ ", dolorOjos=" + dolorOjos + ", sarpullido=" + sarpullido
				+ ", dolorHuesos=" + dolorHuesos + "]";
	}

	public String getFiebre() {
		return fiebre;
	}

	public void setFiebre(String fiebre) {
		this.fiebre = fiebre;
	}

	public String getDolorCabeza() {
		return dolorCabeza;
	}

	public void setDolorCabeza(String dolorCabeza) {
		this.dolorCabeza = dolorCabeza;
	}

	public String getNauseasVomitos() {
		return nauseasVomitos;
	}

	public void setNauseasVomitos(String nauseasVomitos) {
		this.nauseasVomitos = nauseasVomitos;
	}

	public String getDolorOjos() {
		return dolorOjos;
	}

	public void setDolorOjos(String dolorOjos) {
		this.dolorOjos = dolorOjos;
	}

	public String getSarpullido() {
		return sarpullido;
	}

	public void setSarpullido(String sarpullido) {
		this.sarpullido = sarpullido;
	}

	public String getDolorHuesos() {
		return dolorHuesos;
	}

	public void setDolorHuesos(String dolorHuesos) {
		this.dolorHuesos = dolorHuesos;
	}
}
