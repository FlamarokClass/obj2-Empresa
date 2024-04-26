package ar.edu.unahur.po2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	@Test
	public void queElEmpleadoGerenteCobre658_000() {
		Integer horasTrabajadas= 160;
		Boolean estaCasado = true;
		Integer cantidadHijos = 1;
		Integer antiguedad = 10;
		Double valorEsperado = 658_000.0;
		
		Gerente natan = new Gerente(horasTrabajadas, cantidadHijos,estaCasado,antiguedad);
		Double valorObtenido = natan.getSueldo();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queElGerenteCobreSalarioFamiliar() {
		Integer horasTrabajadas= 80;
		Boolean estaCasado = true;
		Integer cantidadHijos = 2;
		Integer antiguedad = 6;
		Double valorEsperado = 5_000.0;
		
		Gerente natan = new Gerente(horasTrabajadas, cantidadHijos,estaCasado, antiguedad);
		Double valorObtenido = natan.getSalarioFamiliar();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	@Test
	public void queElGerenteConHijoYSoltero() {
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
