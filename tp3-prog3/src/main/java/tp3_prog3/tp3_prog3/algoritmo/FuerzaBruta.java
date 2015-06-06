package tp3_prog3.tp3_prog3.algoritmo;

import tp3_prog3.tp3_prog3.model.Equipo;

public class FuerzaBruta {

	public static Respuesta resolver(Equipo equipo) {
		Respuesta elMejor = null;
		Generador gen = new Generador(equipo);
		while (gen.hasNext()) {
			Respuesta actual = gen.next();
			if ((elMejor == null || actual.getPuntaje() > elMejor.getPuntaje())
					&& (actual.getPeso() < equipo.getCapacidad())) {
				elMejor = actual;
			}
		}
		return elMejor;
	}
}