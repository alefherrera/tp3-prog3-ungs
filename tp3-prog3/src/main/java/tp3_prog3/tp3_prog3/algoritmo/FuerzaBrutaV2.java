package tp3_prog3.tp3_prog3.algoritmo;

import java.util.List;
import java.util.Map;

import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Pais;
import tp3_prog3.tp3_prog3.model.Respuesta;

public class FuerzaBrutaV2 {

	public static Respuesta resolver(List<Jugador> universo) {
		Respuesta resultado = new Respuesta();
		int[] arr = new int[universo.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int[] result = new int[Respuesta.capacidad];
		return combinaciones(arr, Respuesta.capacidad, 0, result, resultado,
				universo);
	}

	private static Respuesta combinaciones(int[] arr, int len,
			int startPosition, int[] result, Respuesta resultado,
			List<Jugador> u) {
		if (len == 0) {
			// cada vez que llego al final pruebo todas las combinaciones
			return probarPosiciones(result, resultado, u);
		}
		for (int i = startPosition; i <= arr.length - len; i++) {
			result[result.length - len] = arr[i];
			// con un break aca podria generar un mejor backtracking
			resultado = combinaciones(arr, len - 1, i + 1, result, resultado, u);
		}
		return resultado;
	}

	private static Respuesta probarPosiciones(int[] posiciones,
			Respuesta resultado, List<Jugador> u) {

		Respuesta r = new Respuesta();

		for (int i : posiciones) {
			Jugador j = u.get(i);
			if (cumpleTodo(r, j)) {
				r.agregar(j);
			} else
				return resultado;
		}

		return r.getPuntaje() > resultado.getPuntaje() ? r : resultado;
	}

	private static boolean cumpleTodo(Respuesta r, Jugador j) {
		return r.getCantidad() < Respuesta.capacidad && cumpleFormacion(r, j)
				&& cumpleSeleccion(r, j) && cumpleAmarillas(r, j)
				&& cumpleRojas(r, j);
	}

	// posicion 0 = arquero, 1 = defensor, 2 = mediocampista, 3 = delantero //
	// definido en enum de Posiciones.
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

	private static final int MaxSeleccion = 5;

	private static boolean cumpleSeleccion(Respuesta r, Jugador j) {
		for (Map.Entry<Pais, Integer> entry : r.paises().entrySet()) {
			if (entry.getValue() > MaxSeleccion)
				return false;
		}

		return true;
	}

	private static final int maxAmarillas = 3;

	private static boolean cumpleAmarillas(Respuesta r, Jugador j) {
		return r.getAmarillas() + j.getTarjetasAmarillas() <= maxAmarillas;
	}

	private static final int maxRojas = 1;

	private static boolean cumpleRojas(Respuesta r, Jugador j) {
		return r.getRojas() + j.getTarjetasRojas() <= maxRojas;
	}

}
