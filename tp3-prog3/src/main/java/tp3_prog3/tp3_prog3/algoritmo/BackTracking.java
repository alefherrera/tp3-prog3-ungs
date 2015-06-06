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
		for (int i = n; i < universo.size(); i++) {
			if (cumpleTodo(r))
			{
				r.agregar(universo.get(n));
				recursivo(universo, r, n+1);
			}
		}		
				
	}
	
	private static boolean cumpleTodo(Respuesta r) {
		return r.getCantidad() <= 11 && cumpleFormacion(r) && cumpleSeleccion(r)
				&& cumpleAmarillas(r) && cumpleRojas(r);
	}

	private static final int[] maximos = { 1, 4, 3, 3 };
	private static boolean cumpleFormacion(Respuesta r) {
		boolean ret = true;
		int[] cantidades = r.getCantidades();
		for (int i = 0; i < maximos.length; i++) {
			ret = ret && cantidades[i] <= maximos[i];
		}
		return ret;
	}

	private static boolean cumpleSeleccion(Respuesta r) {
		/*Map<Pais, Integer> m = new HashMap<Pais, Integer>();
		for (Jugador jugador : jugadores) {
			Integer val = m.get(jugador.getSeleccion());
			m.putIfAbsent(jugador.getSeleccion(), val == null ? 1 : val++);
		}*/
		
		return true;
	}

	private static final int maxAmarillas = 5;
	private static boolean cumpleAmarillas(Respuesta r) {
		return r.getAmarillas() <= maxAmarillas;
	}

	private static final int maxRojas = 1;
	private static boolean cumpleRojas(Respuesta r) {
		return r.getRojas() <= maxRojas;
	}

}
