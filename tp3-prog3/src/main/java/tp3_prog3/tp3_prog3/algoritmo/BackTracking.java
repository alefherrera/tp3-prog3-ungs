package tp3_prog3.tp3_prog3.algoritmo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Pais;
import tp3_prog3.tp3_prog3.model.Respuesta;

public class BackTracking {

	public static Respuesta resolver(List<Jugador> universo) {
		Respuesta ret = new Respuesta();

		recursivo(universo, ret, 0);
		
		
		return ret;
	}
	
	private static void recursivo(List<Jugador> universo, Respuesta r, int n){
		if (n == universo.size()){
			return;
		}
		for (int i = 0; i < universo.size(); i++) {
			if (cumpleTodo(universo))
			{
				r.agregar(universo.get(n));
				recursivo(universo, r, n++);
			}
		}		
				
	}
	
	private static boolean cumpleTodo(List<Jugador> jugadores) {
		return cumpleFormacion(jugadores) && cumpleSeleccion(jugadores)
				&& cumpleAmarillas(jugadores) && cumpleRojas(jugadores);
	}

	private static boolean cumpleFormacion(List<Jugador> jugadores) {

		return true;
	}

	private static boolean cumpleSeleccion(List<Jugador> jugadores) {
		Map<Pais, Integer> m = new HashMap<Pais, Integer>();
		for (Jugador jugador : jugadores) {
			Integer val = m.get(jugador.getSeleccion());
			m.putIfAbsent(jugador.getSeleccion(), val == null ? 1 : val++);
		}
		
		
		
		return true;
	}

	private static final int maxAmarillas = 5;
	private static boolean cumpleAmarillas(List<Jugador> jugadores) {
		int amarillas = 0;
		for (Jugador jugador : jugadores) {
			amarillas += jugador.getTarjetasAmarillas();
		}
		return amarillas <= maxAmarillas;
	}

	private static final int maxRojas = 1;
	private static boolean cumpleRojas(List<Jugador> jugadores) {
		int rojas = 0;
		for (Jugador jugador : jugadores) {
			rojas += jugador.getTarjetasRojas();
		}
		return rojas <= maxRojas;
	}

}
