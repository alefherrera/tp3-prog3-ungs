package tp3_prog3.tp3_prog3.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	protected List<Jugador> jugadores;
	public static final int capacidad = 23;
	private Pais pais;
	private static final int[] maximos = { 3, 7, 7, 7 };
	private int[] cantidades;
	
	public Equipo() {
		jugadores = new ArrayList<Jugador>();
		cantidades = new int[4];
	}

	public Equipo(Pais pais) {
		this();
		this.pais = pais;
	}
	
	public boolean agregar(Jugador j) {
		int v = j.getPosicion().getValue();
		boolean ret = false;
		if (ret = cantidades[v] < maximos[v]) {
			cantidades[v]++;
			jugadores.add(j);
		}
		return ret;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public int getCantidad() {
		return jugadores.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t");
		for (Jugador jugador : jugadores) {
			sb.append(jugador);
			sb.append(",\n\t");
		}
		return "{\n Pais: '" + pais + "', \n Jugadores: [\n"
				+ sb.toString() + "]\n}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((jugadores == null) ? 0 : jugadores.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (jugadores == null) {
			if (other.jugadores != null)
				return false;
		} else if (!jugadores.equals(other.jugadores))
			return false;
		return true;
	}

}
