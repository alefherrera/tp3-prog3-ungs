package tp3_prog3.tp3_prog3.main;

import java.util.ArrayList;
import java.util.List;

import tp3_prog3.tp3_prog3.model.Equipo;
import tp3_prog3.tp3_prog3.util.GeneradorEquipo;

public class Main {

	public static void main(String[] args) {

		int c = 0;

		List<Equipo> equipos = new ArrayList<Equipo>();

		while (c < 4) {
			equipos.add(GeneradorEquipo.generar());
			c++;
		}
		
		for (Equipo equipo : equipos) {
			System.out.println(equipo);
		}

	}

}
