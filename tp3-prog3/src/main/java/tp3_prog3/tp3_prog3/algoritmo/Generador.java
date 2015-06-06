package tp3_prog3.tp3_prog3.algoritmo;

import tp3_prog3.tp3_prog3.model.Equipo;

public class Generador {
	private int n;
	private boolean[] A;
	private Equipo equipo;

	public Generador(Equipo equipo) {
		n = Equipo.capacidad;
		this.equipo = equipo;
		A = new boolean[n + 1];
	}

	// Proximo elemento

	public Respuesta next() {
		Respuesta ret = new Respuesta();

		for (int i = 0; i < n; ++i)
			if (A[i] == true)
				ret.agregar(equipo.getJugador(i));
		sumarUno();
		return ret;
	}

	public boolean hasNext() {
		return A[n] == false;
	}

	// Suma 1 al numero en binario representado por el arreglo
	private void sumarUno() {
		int i = 0;
		while (A[i] == true) {
			A[i] = false;
			++i;
		}

		A[i] = true;
	}

	// no sirve para nada!!!!
	private static void mostrar(boolean[] A) {
		for (boolean b : A)
			System.out.print(b == true ? "1 " : "0 ");

		System.out.println();
	}

}
