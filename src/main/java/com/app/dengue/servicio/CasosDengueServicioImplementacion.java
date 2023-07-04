package com.app.dengue.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dengue.entidad.ReporteDto;
import com.app.dengue.entidad.testDto;
import com.app.dengue.repositorio.CasosRepositorio;

@Service
public class CasosDengueServicioImplementacion implements CasoServicio {
	
	@Autowired
	private CasosRepositorio repositorio;

	@Override
	public ReporteDto reporte() {
		
		//valores totales capturados
		int totales = repositorio.casosTotales();
		int totalesDengueDrave = repositorio.casosTotalesDengueGrave();
		int totalesDengueSinSintomas = repositorio.casosTotalesDengueSinSeñales();
		int totalesDengueConSintomas = repositorio.bellavistaCasosDengueConSeñales();
		int totalesFallecidos = repositorio.casosTotalesDengueFallecidos();
		
		//valores capturados de jaen
		int jaenTotales = repositorio.jaenCasosTotales();
		int jaenDengueGrave = repositorio.jaenCasosDengueGrave();
		int jaenDenguesinSintomas = repositorio.jaenCasosDengueSinSeñales();
		int jaenDengueConSintomas = repositorio.jaenCasosDengueConSeñales();
		int jaenFallecidos = repositorio.jaenCasosDengueFallecidos();
		
		//valores capturados de bellavista
		int bellavistaTotales = repositorio.bellavistaCasosTotales();
		int bellavistaDengueGrave = repositorio.bellavistaCasosDengueGrave();
		int bellavistaDengueSinSintomas = repositorio.bellavistaCasosDengueSinSeñales();
		int bellavistaDengueConSintomas = repositorio.bellavistaCasosDengueConSeñales();
		int bellavistaFallecidos = repositorio.bellavistaCasosDengueFallecidos();
		
		//valores capturados de huabal
		int huabalTotales = repositorio.huabalCasosTotales();
		int huabalDengueGrave = repositorio.huabalCasosDengueGrave();
		int huabalDengueSinSintomas = repositorio.huabalCasosDengueSinSeñales();
		int huabalDengueConSintomas = repositorio.huabalCasosDengueConSeñales();
		int huabalFallecidos = repositorio.huabalCasosDengueFallecidos();
		
		//valores capturados de las pirias
		int lasPiriasTotales = repositorio.lasPiriasCasosTotales();
		int lasPiriasDengueGrave = repositorio.lasPiriasCasosDengueGrave();
		int lasPiriasDengueSinSintomas = repositorio.lasPiriasCasosDengueSinSeñales();
		int lasPiriasDengueConSintomas = repositorio.lasPiriasCasosDengueConSeñales();
		int lasPiriasFallecidos = repositorio.lasPiriasCasosDengueFallecidos();
		
		//valores capturados de santa rosa
		int santaRosaTotales = repositorio.santaRosaCasosTotales();
		int santaRosaDengueGrave = repositorio.santaRosaCasosDengueGrave();
		int santaRosaDengueSinSintomas = repositorio.santaRosaCasosDengueSinSeñales();
		int santaRosaDengueConSintomas = repositorio.santaRosaCasosDengueConSeñales();
		int santaRosaFallecidos = repositorio.santaRosaCasosDengueFallecidos();
		
		//valores capturados de colasay
		int colasayTotales = repositorio.colasayCasosTotales();
		int colasayDengueGrave = repositorio.colasayCasosDengueGrave();
		int colasayDengueSinSintomas = repositorio.colasayCasosDengueSinSeñales();
		int colasayDengueConSintomas = repositorio.colasayCasosDengueConSeñales();
		int colasayFallecidos = repositorio.colasayCasosDengueFallecidos();
		
		//valores capturados de pucara
		int pucaraTotales = repositorio.pucaraCasosTotales();
		int pucaraDengueGrave = repositorio.pucaraCasosDengueGrave();
		int pucaraDengueSinSintomas = repositorio.pucaraCasosDengueSinSeñales();
		int pucaraDengueConSintomas = repositorio.pucaraCasosDengueConSeñales();
		int pucaraFallecidos = repositorio.pucaraCasosDengueFallecidos();
		
		//valores capturados de pomahuaca
		int pomahuacaTotales = repositorio.pomahuacaCasosTotales();
		int pomahuacaDengueGrave = repositorio.pomahuacaCasosDengueGrave();
		int pomahuacaDengueSinSintomas = repositorio.pomahuacaCasosDengueSinSeñales();
		int pomahuacaDengueConSintomas = repositorio.pomahuacaCasosDengueConSeñales();
		int pomahuacaFallecidos = repositorio.pomahuacaCasosDengueFallecidos();
		
		//valores capturados de san jose del alto
		int sanJoseDelAltoTotales = repositorio.sanJoseDelAltoCasosTotales();
		int sanJoseDelAltoDengueGrave = repositorio.sanJoseDelAltoCasosDengueGrave();
		int sanJoseDelAltoDengueSinSintomas = repositorio.sanJoseDelAltoCasosDengueSinSeñales();
		int sanJoseDelAltoDengueConSintomas = repositorio.sanJoseDelAltoCasosDengueConSeñales();
		int sanJoseDelAltoFallecidos = repositorio.sanJoseDelAltoCasosDengueFallecidos();
		
		//valores capturados de chontali
		int chontaliTotales = repositorio.chontaliCasosTotales();
		int chontaliDengueGrave = repositorio.chontaliCasosDengueGrave();
		int chontaliDengueSinSintomas = repositorio.chontaliCasosDengueSinSeñales();
		int chontaliDengueConSintomas = repositorio.chontaliCasosDengueConSeñales();
		int chontaliFallecidos = repositorio.chontaliCasosDengueFallecidos();
		
		//valores capturados de san felipe
		int sanFelipeTotales = repositorio.sanFelipeCasosTotales();
		int sanFelipeDengueGrave = repositorio.sanFelipeCasosDengueGrave();
		int sanFelipeDengueSinSintomas = repositorio.sanFelipeCasosDengueSinSeñales();
		int sanFelipeDengueConSintomas = repositorio.sanFelipeCasosDengueConSeñales();
		int sanFelipeFallecidos = repositorio.sanFelipeCasosDengueFallecidos();
		
		//valores capturados de sallique
		int salliqueTotales = repositorio.salliqueCasosTotales();
		int salliqueDengueGrave = repositorio.salliqueCasosDengueGrave();
		int salliqueDengueSinSintomas = repositorio.salliqueCasosDengueSinSeñales();
		int salliqueDengueConSintomas = repositorio.salliqueCasosDengueConSeñales();
		int salliqueFallecidos = repositorio.salliqueCasosDengueFallecidos();
		
		//valores pasados a objeto reporte
		ReporteDto reporte = new ReporteDto(totales, totalesDengueDrave, totalesDengueSinSintomas, totalesDengueConSintomas, totalesFallecidos,
											jaenTotales, jaenDengueGrave, jaenDenguesinSintomas, jaenDengueConSintomas, jaenFallecidos,
											bellavistaTotales, bellavistaDengueGrave, bellavistaDengueSinSintomas, bellavistaDengueConSintomas, bellavistaFallecidos,
											huabalTotales, huabalDengueGrave, huabalDengueSinSintomas, huabalDengueConSintomas, huabalFallecidos,
											lasPiriasTotales, lasPiriasDengueGrave, lasPiriasDengueSinSintomas, lasPiriasDengueConSintomas, lasPiriasFallecidos,
											santaRosaTotales, santaRosaDengueGrave, santaRosaDengueSinSintomas, santaRosaDengueConSintomas, santaRosaFallecidos,
											colasayTotales, colasayDengueGrave, colasayDengueSinSintomas, colasayDengueConSintomas, colasayFallecidos,
											pucaraTotales, pucaraDengueGrave, pucaraDengueSinSintomas, pucaraDengueConSintomas, pucaraFallecidos,
											pomahuacaTotales, pomahuacaDengueGrave, pomahuacaDengueSinSintomas, pomahuacaDengueConSintomas, pomahuacaFallecidos,
											sanJoseDelAltoTotales, sanJoseDelAltoDengueGrave, sanJoseDelAltoDengueSinSintomas, sanJoseDelAltoDengueConSintomas, sanJoseDelAltoFallecidos,
											chontaliTotales, chontaliDengueGrave, chontaliDengueSinSintomas, chontaliDengueConSintomas, chontaliFallecidos,
											sanFelipeTotales, sanFelipeDengueGrave, sanFelipeDengueSinSintomas, sanFelipeDengueConSintomas, sanFelipeFallecidos,
											salliqueTotales, salliqueDengueGrave, salliqueDengueSinSintomas, salliqueDengueConSintomas, salliqueFallecidos);
				
		return reporte;
	}

	@Override
	public String testear(testDto test) {
		
		String resultado;
		
		if(test.getFiebre().toString().equals("si") && test.getDolorOjos().toString().equals("si")) {
			
			resultado = "Usted presenta los sintomas de un paciente con Dengue, acerquese al centro de salud mas cercano.";
		} else if(test.getFiebre().toString().equals("si") && test.getSarpullido().toString().equals("si")) {
			
			resultado = "Usted presenta los sintomas de un paciente con Dengue, acerquese al centro de salud mas cercano.";
		} else if(test.getFiebre().toString().equals("si") && test.getNauseasVomitos().equals("si")) {
			
			resultado = "Usted presenta los sintomas de un paciente con Dengue, acerquese al centro de salud mas cercano.";
		} else {
			
			resultado="Usted no presenta los sintomas de un paciente con Dengue.";
		}
		
		return resultado;
	}
}
