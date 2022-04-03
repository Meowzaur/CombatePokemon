package models;

import java.util.ArrayList;

public class Equipo {

	private ArrayList<Equipo> equipo;

	public Equipo(ArrayList<Equipo> equipo) {
		super();
		this.equipo = equipo;
	}

	public ArrayList<Equipo> getEquipo() {
		return equipo;
	}

	public void setEquipo(ArrayList<Equipo> equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Equipo [equipo=" + equipo + "]";
	}

}
