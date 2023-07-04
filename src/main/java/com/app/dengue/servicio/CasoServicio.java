package com.app.dengue.servicio;

import com.app.dengue.entidad.ReporteDto;
import com.app.dengue.entidad.testDto;

public interface CasoServicio  {

	public ReporteDto reporte();
	public String testear(testDto test);
}
