package tp3_prog3.tp3_prog3.algoritmo;

import java.util.HashSet;

import tp3_prog3.tp3_prog3.model.Jugador;

public class Respuesta {
	private HashSet<Jugador> jugadores;

	public Respuesta() {
		this.jugadores = new HashSet<Jugador>();
	}

	public void agregar(Jugador o) {
		this.jugadores.add(o);
	}

	public double getPeso() {
		return jugadores.size();
	}

	public double getPuntaje() {
		double benef = 0;
		for (Jugador obj : jugadores) {
			benef += obj.getPuntaje();
		}
		return benef;
	}

	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		for (Jugador obj : jugadores) {
			ret.append("\t" + obj.toString());
			ret.append(System.lineSeparator());
		}
		return "{\n\t objetos: [\n" + ret + "\t] ,\n\t peso: " + getPeso()
				+ ",\n\t benef: " + getPuntaje() + "\n}";
	}
}