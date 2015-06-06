package tp3_prog3.tp3_prog3.model;

import java.util.List;

public class Equipo {

	private List<Jugador> jugadores;
	public static final int capacidad = 11;
	
	public boolean agregar(Jugador j){
		//TODO: validaciones de cantidad
		jugadores.add(j);
		return true;
	}
	
	public Jugador getJugador(int t) {
		return jugadores.get(t);
	}

	public int getCantidad() {
		return jugadores.size();
	}

}
