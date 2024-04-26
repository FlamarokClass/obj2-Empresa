package ar.edu.unahur.po2.empresa;

public class PlantaTemporaria extends Empleado{
	// lo comentado se refactorizo al agregar una clase padre.
//	private static final double VALOR_CONYUGE = 1_000.0;
//	private static final double VALOR_HIJO = 2_000.0;
	private static final double VALOR_HORA = 2_000.0;
//	private Integer horasTrabajadas;
//	private Integer cantidadHijos;
//	private Boolean estaCasado;

/*
	public PlantaTemporaria(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado) {
		super(horasTrabajadas,cantidadHijos,estaCasado)
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadHijos = cantidadHijos;
		this.estaCasado = estaCasado;
	}
*/
	public PlantaTemporaria(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado) {
		super(horasTrabajadas,cantidadHijos,estaCasado);
	}
	
	
//	public Double getSueldo() {
//		Double sueldo = this.horasTrabajadas * VALOR_HORA + this.getSalarioFamiliar();
//		return sueldo;
//	}
	
	@Override
	public Double getSueldo() {
		Double sueldo = super.getHorasTrabajadas() * PlantaTemporaria.VALOR_HORA + super.getSalarioFamiliar();
		return sueldo;
	}


//	public Double getSalarioFamiliar() {
//		Double salarioFamiliar = this.cantidadHijos * VALOR_HIJO;
//		if(this.estaCasado) {
//			salarioFamiliar += VALOR_CONYUGE;
//		}
//		return salarioFamiliar;
//	}
}
