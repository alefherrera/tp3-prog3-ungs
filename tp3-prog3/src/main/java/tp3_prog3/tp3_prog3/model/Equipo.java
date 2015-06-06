package tp3_prog3.tp3_prog3.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	protected List<Jugador> jugadores;
	public static final int capacidad = 23;
	private Pais pais;
	private static final int[] maximos = { 3, 7, 7, 7 };
	protected int[] cantidades;
	
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

}
