package ar.edu.unahur.po2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaPermanenteTest {

	@Test
	public void queElEmpleadoPlantaPermanenteCobre251_000() {
		Integer horasTrabajadas= 80;
		Boolean estaCasado = true;
		Integer cantidadHijos = 2;
		Integer antiguedad = 6;
		Double valorEsperado = 251_000.0;
		
		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, cantidadHijos,estaCasado,antiguedad);
		Double valorObtenido = natan.getSueldo();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queElEmpleadoPlantaPermanenteCobreSalarioFamiliar() {
		Integer horasTrabajadas= 80;
		Boolean estaCasado = true;
		Integer cantidadHijos = 2;
		Integer antiguedad = 6;
		Double valorEsperado = 5_000.0;
		
		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, cantidadHijos,estaCasado, antiguedad);
		Double valorObtenido = natan.getSalarioFamiliar();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	@Test
	public void queElEmpleadoPlantaPermanenteConHijoySoltero() {
		Integer horasTrabajadas= 80;
		Boolean estaCasado = false;
		Integer cantidadHijos = 2;
		Integer antiguedad= 6;
		Double valorEsperado = 250_000.0;
		
		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, cantidadHijos,estaCasado,antiguedad);
		Double valorObtenido = natan.getSueldo();
		assertEquals(valorEsperado, valorObtenido);
	}


}
