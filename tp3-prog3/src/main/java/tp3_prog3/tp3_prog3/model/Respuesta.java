package tp3_prog3.tp3_prog3.model;

public class Respuesta extends Equipo {

	public static final int capacidad = 11;

	@Override
	public boolean agregar(Jugador j) {
		cantidades[j.getPosicion().getValue()]++;
		jugadores.add(j);
		return getCantidad() < capacidad;
	}

	public double getPuntaje() {
		double ret = 0;
		for (Jugador j : jugadores) {
			ret += j.getPuntaje();
		}
		return ret;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t");
		for (Jugador jugador : jugadores) {
			sb.append(jugador);
			sb.append(",\n\t");
		}
		return "{\n Jugadores: [\n" + sb.toString() + "]\n}";
	}

}
