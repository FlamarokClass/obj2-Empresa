package ar.edu.unahur.po2.empresa;

public abstract class Empleado {
	private static final double VALOR_CONYUGE = 1_000.0;
	private static final double VALOR_HIJO = 2_000.0;
	private Integer horasTrabajadas;
	private Integer cantidadHijos;
	private Boolean estaCasado;
	
	// Constructor:
	public Empleado(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadHijos = cantidadHijos;
		this.estaCasado = estaCasado;
	}
	
	protected Double getSalarioFamiliar() {
		Double salarioFamiliar = this.cantidadHijos * VALOR_HIJO;
		if(this.estaCasado) {
			salarioFamiliar += VALOR_CONYUGE;
		}
		return salarioFamiliar;
	}
	
	public abstract Double getSueldo();

	protected Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}
}

	

