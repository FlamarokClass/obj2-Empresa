package ar.edu.unahur.po2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaTemporariaTest {
	
	
	@Test
	public void queElEmpleadoPlantaTemporariaCobre161_000() {
		Integer horasTrabajadas= 80;
		Boolean estaCasado = true;
		Integer cantidadHijos = 0;
		Double valorEsperado = 161_000.0;
		
		PlantaTemporaria natan = new PlantaTemporaria(horasTrabajadas, cantidadHijos,estaCasado);
		Double valorObtenido = natan.getSueldo();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queElEmpleadoPlantaTemporariaCobreSalario() {
		Integer horasTrabajadas= 80;
		Boolean estaCasado = true;
		Integer cantidadHijos = 1;
		Double valorEsperado = 3_000.0;
		
		PlantaTemporaria natan = new PlantaTemporaria(horasTrabajadas, cantidadHijos,estaCasado);
		Double valorObtenido = natan.getSalarioFamiliar();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	@Test
	public void queElEmpleadoPlantaTemporariaConHijo() {
		Integer horasTrabajadas= 80;
		Boolean estaCasado = true;
		Integer cantidadHijos = 1;
		Double valorEsperado = 163_000.0;
		
		PlantaTemporaria natan = new PlantaTemporaria(horasTrabajadas, cantidadHijos,estaCasado);
		Double valorObtenido = natan.getSueldo();
		assertEquals(valorEsperado, valorObtenido);
	}

}
