package models;

import java.util.ArrayList;

import enums.Estado;
import enums.Tipo;

public class Pokemon {

	private int numero;
	private String nombre;
	private Tipo tipo1;
	private Tipo tipo2;
	private ArrayList<Movimiento> movimientos;
	private int maxPS;
	private int actualPS;
	private int ataque;
	private int defensa;
	private int ataqueEspecial;
	private int defensaEspecial;
	private int velocidad;
	private Estado estado;

	public Pokemon(int numero, String nombre, Tipo tipo1, Tipo tipo2, ArrayList<Movimiento> movimientos, int maxPS,
			int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.movimientos = movimientos;
		this.maxPS = maxPS;
		this.actualPS = maxPS;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataqueEspecial = ataqueEspecial;
		this.defensaEspecial = defensaEspecial;
		this.velocidad = velocidad;
		this.estado = Estado.Nulo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo1() {
		return tipo1;
	}

	public void setTipo1(Tipo tipo1) {
		this.tipo1 = tipo1;
	}

	public Tipo getTipo2() {
		return tipo2;
	}

	public void setTipo2(Tipo tipo2) {
		this.tipo2 = tipo2;
	}

	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(ArrayList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public int getMaxPS() {
		return maxPS;
	}

	public void setMaxPS(int maxPS) {
		this.maxPS = maxPS;
	}

	public int getActualPS() {
		return actualPS;
	}

	public void setActualPS(int actualPS) {
		this.actualPS = actualPS;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public int getDefensaEspecial() {
		return defensaEspecial;
	}

	public void setDefensaEspecial(int defensaEspecial) {
		this.defensaEspecial = defensaEspecial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pokemon [numero=" + numero + ", nombre=" + nombre + ", tipo1=" + tipo1 + ", tipo2=" + tipo2
				+ ", movimientos=" + movimientos + ", maxPS=" + maxPS + ", actualPS=" + actualPS + ", ataque=" + ataque
				+ ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial
				+ ", velocidad=" + velocidad + ", estado=" + estado + "]";
	}

}
