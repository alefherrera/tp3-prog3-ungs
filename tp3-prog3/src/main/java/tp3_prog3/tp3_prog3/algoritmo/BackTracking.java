package tp3_prog3.tp3_prog3.algoritmo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Respuesta;

public class BackTracking {

	public static Set<Respuesta> resolver(List<Jugador> universo) {
		// Respuesta ret = new Respuesta();

		/*
		 * Comparator<Jugador> comp = new Comparator<Jugador>() {
		 * 
		 * public int compare(Jugador o1, Jugador o2) { if (o1.getPuntaje() <
		 * o2.getPuntaje()) return 1; if (o1.getPuntaje() == o2.getPuntaje())
		 * return 0; return -1; }
		 * 
		 * };
		 */

		// universo.sort(comp);
		// esto no asegura que la solucion que encuentro sea la mejor
		Set<Respuesta> r = recursivo(universo, new Respuesta(), 0);

		// System.out.println(r);

		System.out.println("FIN");
		return r;
	}

	private static Set<Respuesta> recursivo(List<Jugador> universo,
			Respuesta respuestaParcial, int desde) {
		Set<Respuesta> ret = new HashSet<Respuesta>();
		//evito los ultimos porque simepre busco hacia adelante
		if (desde == universo.size()-Respuesta.capacidad+1) {
			return ret;
		}

		System.out.println("-------------------------------------RECURSION "
				+ desde + "-------------------------------------");
		System.out.println("RESPUESTA HASTA EL MOMENTO" + respuestaParcial);
		for (int i = desde; i < universo.size(); i++) {
			// System.out.println("vuelta: " + i);
			Jugador jugadorPrueba = universo.get(i);
			// System.out.println("sujeto de prueba: " + j);
			// System.out.println("respuesta de prueba: " + r);
			if (cumpleTodo(respuestaParcial, jugadorPrueba)) {
				// System.out.println("CUMPLE!");
				//Respuesta clon = respuestaParcial.clonar();
				// cada vez que un equipo va cumpliendo las condiciones genero
				// todas las combinaciones con los siguientes
				respuestaParcial.agregar(jugadorPrueba);

				if (respuestaParcial.getCantidad() == Respuesta.capacidad) {
					ret.add(respuestaParcial);
					continue;
				} else {
					ret.addAll(recursivo(universo, respuestaParcial.clonar(), desde + 1));
				}
			}

		}
		return ret;
	}

	private static boolean cumpleTodo(Respuesta r, Jugador j) {
		return !r.getJugadores().contains(j)
				&& r.getCantidad() < Respuesta.capacidad
				&& cumpleFormacion(r, j) && cumpleSeleccion(r, j)
				&& cumpleAmarillas(r, j) && cumpleRojas(r, j);
	}

	private static final int[] maximos = { 1, 4, 3, 3 };

	private static boolean cumpleFormacion(Respuesta r, Jugador j) {
		boolean ret = true;
		int[] cantidades = r.getCantidades();
		int k = j.getPosicion().getValue();
		for (int i = 0; i < maximos.length; i++) {
			ret = ret && cantidades[i] + (i == k ? 1 : 0) <= maximos[i];
		}
		return ret;
	}

	private static boolean cumpleSeleccion(Respuesta r, Jugador j) {
		/*
		 * Map<Pais, Integer> m = new HashMap<Pais, Integer>(); for (Jugador
		 * jugador : jugadores) { Integer val = m.get(jugador.getSeleccion());
		 * m.putIfAbsent(jugador.getSeleccion(), val == null ? 1 : val++); }
		 */

		return true;
	}

	private static final int maxAmarillas = 3;

	private static boolean cumpleAmarillas(Respuesta r, Jugador j) {
		// System.out.println("\n-----------Amarillos---------");
		// System.out.println(r);
		// System.out.println("\n------------JugadorAmarillas-------");
		// System.out.println(j);
		return r.getAmarillas() + j.getTarjetasAmarillas() <= maxAmarillas;
	}

	private static final int maxRojas = 1;

	private static boolean cumpleRojas(Respuesta r, Jugador j) {
		// System.out.println("\n-----------Rojas---------");
		// System.out.println(r);
		// System.out.println("\n------------JugadorRojas-------");
		// System.out.println(j);
		return r.getRojas() + j.getTarjetasRojas() <= maxRojas;
	}

}
