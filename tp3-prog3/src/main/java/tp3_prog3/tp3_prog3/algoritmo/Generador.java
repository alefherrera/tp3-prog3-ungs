package tp3_prog3.tp3_prog3.algoritmo;

import java.util.List;

import tp3_prog3.tp3_prog3.model.Equipo;
import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Respuesta;

public class Generador {
	private int n;
	private boolean[] v;
	private List<Jugador> jugadores;

	public Generador(List<Jugador> jugadores) {
		n = jugadores.size();
		this.jugadores = jugadores;
		v = new boolean[n + 1];
		for (int i = 0; i < 11; i++) {
			v[i] = true;
		}
	}

	// Proximo elemento

	public Respuesta next() {
		Respuesta ret = new Respuesta();

		for (int i = 0; i < n; i++)
			if (v[i])
				ret.agregar(jugadores.get(i));
		mover();
		return ret;
	}

	public boolean hasNext() {
		return !v[n];
	}

	// Suma 1 al numero en binario representado por el arreglo
	private void mover() {
		int i = 0;
		while (v[i] == true) {
			v[i] = false;
			++i;
		}

		v[i] = true;
	}

	// no sirve para nada!!!!
	private static void mostrar(boolean[] A) {
		for (boolean b : A)
			System.out.print(b == true ? "1 " : "0 ");

		System.out.println();
	}

}
