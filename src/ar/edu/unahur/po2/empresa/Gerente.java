package ar.edu.unahur.po2.empresa;

public class Gerente extends PlantaPermanente {
	// Lo comentado es refactorizado por la superClase PlantaPermanente
	
//	private static final double VALOR_CONYUGE = 1_000.0;
//	private static final double VALOR_HIJO = 2_000.0;
	private static final double VALOR_HORA = 4_000.0;
	private static final double VALOR_ANTIGUEDAD = 1_500.0;
//	private Integer horasTrabajadas;
//	private Integer cantidadHijos;
//	private Boolean estaCasado;
//	private Integer antiguedad;

	public Gerente(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado, Integer antiguedad) {
		super(horasTrabajadas,cantidadHijos,estaCasado,antiguedad);
	}
	
	public Double getSueldo() {
		return super.getAntiguedad() *Gerente.VALOR_ANTIGUEDAD + 
				super.getHorasTrabajadas() * Gerente.VALOR_HORA + 
				super.getSalarioFamiliar();
	}
	
//	public Double getSueldo() {
//		Double sueldo = this.horasTrabajadas * VALOR_HORA + this.getSalarioFamiliar() + this.antiguedad * VALOR_ANTIGUEDAD;
//		return sueldo;
//	}



//	public Double getSalarioFamiliar() {
//		Double salarioFamiliar = this.cantidadHijos * VALOR_HIJO;
//		if(this.estaCasado) {
//			salarioFamiliar += VALOR_CONYUGE;
//		}
//		return salarioFamiliar;
//	}
}
