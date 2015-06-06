package tp3_prog3.tp3_prog3.main;

import java.util.ArrayList;
import java.util.List;

import tp3_prog3.tp3_prog3.algoritmo.BackTracking;
import tp3_prog3.tp3_prog3.algoritmo.FuerzaBruta;
import tp3_prog3.tp3_prog3.model.Equipo;
import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.util.GeneradorEquipo;

public class Main {

	public static void main(String[] args) {

		int c = 0;

		List<Equipo> equipos = new ArrayList<Equipo>();
		List<Jugador> universo = new ArrayList<Jugador>();
		
		while (c < 1) {
			equipos.add(GeneradorEquipo.generar());
			c++;
		}
		
		equipos.add(GeneradorEquipo.generarBueno());
		
		for (Equipo equipo : equipos) {
			universo.addAll(equipo.getJugadores());
			System.out.println(equipo);
		}
		
		
		System.out.println("---------------SOLUCION-------------\n");
		System.out.println(BackTracking.resolver(universo));
		

	}

}
