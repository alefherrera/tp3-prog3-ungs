package tp3_prog3.tp3_prog3.algoritmo;

import java.util.List;

import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Respuesta;

public class FuerzaBruta {

	public static Respuesta resolver(List<Jugador> universo) {
		Respuesta elMejor = null;
		Generador gen = new Generador(universo);
		while (gen.hasNext()) {
			Respuesta actual = gen.next();
			if (actual.getCantidad() == Respuesta.capacidad) {
				if ((elMejor == null || actual.getPuntaje() > elMejor
						.getPuntaje())) {
					elMejor = actual;
				}
			}
		}
		return elMejor;
	}
}
