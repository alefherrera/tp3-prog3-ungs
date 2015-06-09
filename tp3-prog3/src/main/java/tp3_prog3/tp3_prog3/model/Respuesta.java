package tp3_prog3.tp3_prog3.model;

import java.util.Hashtable;
import java.util.Map;

public class Respuesta extends Equipo {

	public static final int capacidad = 11;
	private int[] cantidades;
	private int amarillas;
	private int rojas;
	private Map<Pais, Integer> paises;

	public Respuesta() {
		cantidades = new int[4];
		paises = new Hashtable<Pais, Integer>();
	}

	public int[] getCantidades() {
		return cantidades;
	}

	public int getAmarillas() {
		return amarillas;
	}

	public int getRojas() {
		return rojas;
	}

	public Respuesta clonar() {
		Respuesta clon = new Respuesta();
		for (Jugador jugador : jugadores) {
			clon.agregar(jugador);
		}
		return clon;
	}

	@Override
	public boolean agregar(Jugador j) {
		jugadores.add(j);
		amarillas += j.getTarjetasAmarillas() > 0 ? 1 : 0;
		rojas += j.getTarjetasRojas() > 0 ? 1 : 0;
		cantidades[j.getPosicion().getValue()]++;
		Integer c = paises.get(j.getSeleccion());
		paises.put(j.getSeleccion(),(c == null ? 0 : c )+1);
		return true;
	}
	
	public Map<Pais, Integer> paises(){
		return paises;
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
		int s = jugadores.size();
		int c = 0;
		for (Jugador jugador : jugadores) {
			sb.append(jugador.getNombre());
			// sb.append(",\n\t");
			if (++c != s)
				sb.append(",");
		}
		return "{\n HashCode: " + hashCode() + ",\n Puntaje: " + getPuntaje()
				+ ",\n Jugadores: [\n" + sb.toString() + "\n\t],\n Cantidad: "
				+ s + "}";
	}

}
