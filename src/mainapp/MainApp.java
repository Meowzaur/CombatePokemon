package mainapp;

import java.util.Scanner;

import enums.Categoria;
import enums.Estado;
import enums.Tipo;
import models.Movimiento;
import models.Pokemon;
import utils.Almacen;

public class MainApp {

	public static void main(String[] args) {
		
		Almacen.listaMovimiento.add(new Movimiento("Tormenta Floral", Tipo.Planta, Categoria.Especial, 90, 100, 15, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Sintesis", Tipo.Planta, Categoria.Apoyo, 0, 100, 5, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Doble Filo", Tipo.Normal, Categoria.Fisico, 120, 100, 15, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Desarrollo", Tipo.Normal, Categoria.Apoyo, 0, 100, 5, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Onda Ignea", Tipo.Fuego, Categoria.Especial, 95, 90, 10, Estado.Quemado, 10));
		Almacen.listaMovimiento.add(new Movimiento("Furia Dragon", Tipo.Dragon, Categoria.Especial, 0, 100, 10, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Cuchillada", Tipo.Normal, Categoria.Fisico, 70, 100, 20, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Cara Susto", Tipo.Normal, Categoria.Apoyo, 0, 100, 10, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Hidrobomba", Tipo.Agua, Categoria.Especial, 110, 80, 5, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Defensa Ferrea", Tipo.Acero, Categoria.Apoyo, 0, 100, 15, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Mordisco", Tipo.Siniestro, Categoria.Fisico, 60, 100, 25, Estado.Nulo, 0));
		Almacen.listaMovimiento.add(new Movimiento("Foco Resplandor", Tipo.Normal, Categoria.Especial, 80, 100, 10, Estado.Nulo, 10));
		
		Almacen.listaPokemon.add(new Pokemon(3, "Venusaur", Tipo.Planta, Tipo.Veneno, null, 160, 82, 83, 100, 100, 80));
		Almacen.listaPokemon.add(new Pokemon(6, "Charizard", Tipo.Fuego, Tipo.Volador, null, 156, 84, 78, 109, 85, 100));
		Almacen.listaPokemon.add(new Pokemon(9, "Blastoise", Tipo.Agua, Tipo.Nulo, null, 158, 83, 100, 85, 105, 78));
		
		Scanner teclea = new Scanner(System.in);
		
		
		
		teclea.close();
		
	}

}
