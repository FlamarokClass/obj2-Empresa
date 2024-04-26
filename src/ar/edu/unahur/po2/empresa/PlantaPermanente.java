package ar.edu.unahur.po2.empresa;

public class PlantaPermanente extends Empleado {	
	// Lo comentado es refactorizado por la superClase Empleado
	
//	private static final double VALOR_CONYUGE = 1_000.0;
//	private static final double VALOR_HIJO = 2_000.0;
	private static final double VALOR_HORA = 3_000.0;
	private static final double VALOR_ANTIGUEDAD = 1_000.0;
//	private Integer horasTrabajadas;
//	private Integer cantidadHijos;
//	private Boolean estaCasado;
	private Integer antiguedad;

//	public PlantaPermanente(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado, Integer antiguedad) {
//		this.horasTrabajadas = horasTrabajadas;
//		this.cantidadHijos = cantidadHijos;
//		this.estaCasado = estaCasado;
//		this.antiguedad = antiguedad;
//	}
	
	public PlantaPermanente(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado, Integer antiguedad) {
		super(horasTrabajadas, cantidadHijos,estaCasado);
		this.antiguedad = antiguedad;
	}
	
	
	@Override
	public Double getSueldo() {
		Double sueldo = super.getHorasTrabajadas() * PlantaPermanente.VALOR_HORA + super.getSalarioFamiliar() + this.antiguedad * PlantaPermanente.VALOR_ANTIGUEDAD;
		return sueldo;
	}
	
	protected Integer getAntiguedad() {
		return antiguedad;
	}


//	public Double getSalarioFamiliar() {
//		Double salarioFamiliar = this.cantidadHijos * VALOR_HIJO;
//		if(this.estaCasado) {
//			salarioFamiliar += VALOR_CONYUGE;
//		}
//		return salarioFamiliar;
//	}
}

