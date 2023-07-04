package com.app.dengue.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.dengue.entidad.Caso;

@Repository
public interface CasosRepositorio extends JpaRepository<Caso, Integer> {

	//casos totales
	@Query(value = "select count(id) from casos", nativeQuery = true)
	int casosTotales();
	
	@Query(value = "select count(id) from casos where clasificacion='dengue grave'", nativeQuery = true)
	int casosTotalesDengueGrave();
	
	@Query(value = "select count(id) from casos where clasificacion='dengue sin señales'", nativeQuery = true)
	int casosTotalesDengueSinSeñales();
	
	@Query(value = "select count(id) from casos where clasificacion='dengue con señales'", nativeQuery = true)
	int casosTotalesDengueConSeñales();
	
	@Query(value = "select count(id) from casos where clasificacion='fallecido'", nativeQuery = true)
	int casosTotalesDengueFallecidos();
	
	//casos jaen
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='jaen'", nativeQuery = true)
	int jaenCasosTotales();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='jaen' and clasificacion='dengue grave'", nativeQuery = true)
	int jaenCasosDengueGrave();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='jaen' and clasificacion='dengue sin señales'", nativeQuery = true)
	int jaenCasosDengueSinSeñales();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='jaen' and clasificacion='dengue con señales'", nativeQuery = true)
	int jaenCasosDengueConSeñales();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='jaen' and clasificacion='fallecido'", nativeQuery = true)
	int jaenCasosDengueFallecidos();
	
	//casos bellavista
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='bellavista'", nativeQuery = true)
	int bellavistaCasosTotales();
	
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='bellavista' and clasificacion='dengue grave'", nativeQuery = true)
	int bellavistaCasosDengueGrave();
	
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='bellavista' and clasificacion='dengue sin señales'", nativeQuery = true)
	int bellavistaCasosDengueSinSeñales();
	
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='bellavista' and clasificacion='dengue con señales'", nativeQuery = true)
	int bellavistaCasosDengueConSeñales();
	
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='bellavista' and clasificacion='fallecido'", nativeQuery = true)
	int bellavistaCasosDengueFallecidos();
	
	//casos huabal
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='huabal'", nativeQuery = true)
	int huabalCasosTotales();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='huabal' and clasificacion='dengue grave'", nativeQuery = true)
	int huabalCasosDengueGrave();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='huabal' and clasificacion='dengue sin señales'", nativeQuery = true)
	int huabalCasosDengueSinSeñales();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='huabal' and clasificacion='dengue con señales'", nativeQuery = true)
	int huabalCasosDengueConSeñales();
		
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='huabal' and clasificacion='fallecido'", nativeQuery = true)
	int huabalCasosDengueFallecidos();
		
	//casos las pirias
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='las pirias'", nativeQuery = true)
	int lasPiriasCasosTotales();
				
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='las pirias' and clasificacion='dengue grave'", nativeQuery = true)
	int lasPiriasCasosDengueGrave();
				
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='las pirias' and clasificacion='dengue sin señales'", nativeQuery = true)
	int lasPiriasCasosDengueSinSeñales();
				
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='las pirias' and clasificacion='dengue con señales'", nativeQuery = true)
	int lasPiriasCasosDengueConSeñales();
				
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='las pirias' and clasificacion='fallecido'", nativeQuery = true)
	int lasPiriasCasosDengueFallecidos();
	
	//casos santa rosa
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='santa rosa'", nativeQuery = true)
	int santaRosaCasosTotales();
					
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='santa rosa' and clasificacion='dengue grave'", nativeQuery = true)
	int santaRosaCasosDengueGrave();
					
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='santa rosa' and clasificacion='dengue sin señales'", nativeQuery = true)
	int santaRosaCasosDengueSinSeñales();
					
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='santa rosa' and clasificacion='dengue con señales'", nativeQuery = true)
	int santaRosaCasosDengueConSeñales();
					
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='santa rosa' and clasificacion='fallecido'", nativeQuery = true)
	int santaRosaCasosDengueFallecidos();
	
	//casos colasay
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='colasay'", nativeQuery = true)
	int colasayCasosTotales();
						
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='colasay' and clasificacion='dengue grave'", nativeQuery = true)
	int colasayCasosDengueGrave();
						
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='colasay' and clasificacion='dengue sin señales'", nativeQuery = true)
	int colasayCasosDengueSinSeñales();
						
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='colasay' and clasificacion='dengue con señales'", nativeQuery = true)
	int colasayCasosDengueConSeñales();
						
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='colasay' and clasificacion='fallecido'", nativeQuery = true)
	int colasayCasosDengueFallecidos();
	
	//casos pucara
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pucara'", nativeQuery = true)
	int pucaraCasosTotales();
							
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pucara' and clasificacion='dengue grave'", nativeQuery = true)
	int pucaraCasosDengueGrave();
							
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pucara' and clasificacion='dengue sin señales'", nativeQuery = true)
	int pucaraCasosDengueSinSeñales();
							
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pucara' and clasificacion='dengue con señales'", nativeQuery = true)
	int pucaraCasosDengueConSeñales();
							
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pucara' and clasificacion='fallecido'", nativeQuery = true)
	int pucaraCasosDengueFallecidos();
	
	//casos pomahuaca
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pomahuaca'", nativeQuery = true)
	int pomahuacaCasosTotales();
							
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pomahuaca' and clasificacion='dengue grave'", nativeQuery = true)
	int pomahuacaCasosDengueGrave();
								
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pomahuaca' and clasificacion='dengue sin señales'", nativeQuery = true)
	int pomahuacaCasosDengueSinSeñales();
								
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pomahuaca' and clasificacion='dengue con señales'", nativeQuery = true)
	int pomahuacaCasosDengueConSeñales();
							
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='pomahuaca' and clasificacion='fallecido'", nativeQuery = true)
	int pomahuacaCasosDengueFallecidos();
	
	//casos san jose del alto
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san jose del alto'", nativeQuery = true)
	int sanJoseDelAltoCasosTotales();
										
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san jose del alto' and clasificacion='dengue grave'", nativeQuery = true)
	int sanJoseDelAltoCasosDengueGrave();
											
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san jose del alto' and clasificacion='dengue sin señales'", nativeQuery = true)
	int sanJoseDelAltoCasosDengueSinSeñales();
											
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san jose del alto' and clasificacion='dengue con señales'", nativeQuery = true)
	int sanJoseDelAltoCasosDengueConSeñales();
										
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san jose del alto' and clasificacion='fallecido'", nativeQuery = true)
	int sanJoseDelAltoCasosDengueFallecidos();
	
	//casos chontali
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='chontali'", nativeQuery = true)
	int chontaliCasosTotales();
											
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='chontali' and clasificacion='dengue grave'", nativeQuery = true)
	int chontaliCasosDengueGrave();
												
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='chontali' and clasificacion='dengue sin señales'", nativeQuery = true)
	int chontaliCasosDengueSinSeñales();
												
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='chontali' and clasificacion='dengue con señales'", nativeQuery = true)
	int chontaliCasosDengueConSeñales();
											
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='chontali' and clasificacion='fallecido'", nativeQuery = true)
	int chontaliCasosDengueFallecidos();
	
	//casos san felipe
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san felipe'", nativeQuery = true)
	int sanFelipeCasosTotales();
												
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san felipe' and clasificacion='dengue grave'", nativeQuery = true)
	int sanFelipeCasosDengueGrave();
													
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san felipe' and clasificacion='dengue sin señales'", nativeQuery = true)
	int sanFelipeCasosDengueSinSeñales();
													
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san felipe' and clasificacion='dengue con señales'", nativeQuery = true)
	int sanFelipeCasosDengueConSeñales();
												
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='san felipe' and clasificacion='fallecido'", nativeQuery = true)
	int sanFelipeCasosDengueFallecidos();
	
	//casos sallique
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='sallique'", nativeQuery = true)
	int salliqueCasosTotales();
													
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='sallique' and clasificacion='dengue grave'", nativeQuery = true)
	int salliqueCasosDengueGrave();
														
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='sallique' and clasificacion='dengue sin señales'", nativeQuery = true)
	int salliqueCasosDengueSinSeñales();
														
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='sallique' and clasificacion='dengue con señales'", nativeQuery = true)
	int salliqueCasosDengueConSeñales();
													
	@Query(value = "select count(c.id) from casos as c join pascientes as p on c.pasciente = p.id where p.distrito='sallique' and clasificacion='fallecido'", nativeQuery = true)
	int salliqueCasosDengueFallecidos();
}
