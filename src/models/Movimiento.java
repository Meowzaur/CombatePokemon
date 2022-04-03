package models;

import enums.Estado;
import enums.Tipo;
import enums.Categoria;

public class Movimiento {

	private String nombre;
	private Tipo tipo;
	private Categoria categoria;
	private int potencia;
	private int precision;
	private int maxPP;
	private int actualPP;
	private Estado efecto;
	private int probEfecto;

	public Movimiento(String nombre, Tipo tipo, Categoria categoria, int potencia, int precision, int maxPP,
			Estado efecto, int probEfecto) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.categoria = categoria;
		this.potencia = potencia;
		this.precision = precision;
		this.maxPP = maxPP;
		this.actualPP = maxPP;
		this.efecto = efecto;
		this.probEfecto = probEfecto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public int getMaxPP() {
		return maxPP;
	}

	public void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}

	public int getActualPP() {
		return actualPP;
	}

	public void setActualPP(int actualPP) {
		this.actualPP = actualPP;
	}

	public Estado getEfecto() {
		return efecto;
	}

	public void setEfecto(Estado efecto) {
		this.efecto = efecto;
	}

	public int getProbEfecto() {
		return probEfecto;
	}

	public void setProbEfecto(int probEfecto) {
		this.probEfecto = probEfecto;
	}

	@Override
	public String toString() {
		return "Movimiento [nombre= " + nombre + ", tipo=" + tipo + ", categoria=" + categoria + ", potencia="
				+ potencia + ", precision=" + precision + ", maxPP=" + maxPP + ", actualPP=" + actualPP + ", efecto="
				+ efecto + ", probEfecto=" + probEfecto + "]";
	}

}
