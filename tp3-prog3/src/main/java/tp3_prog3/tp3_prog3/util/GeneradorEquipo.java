package tp3_prog3.tp3_prog3.util;

import java.util.Random;

import tp3_prog3.tp3_prog3.model.Equipo;
import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Pais;
import tp3_prog3.tp3_prog3.model.Posicion;

public class GeneradorEquipo {

	private static final Random r = new Random();
	private static final Pais[] paises = Pais.values();
	private static final Posicion[] posiciones = Posicion.values();

	public static Equipo generar() {
		Pais pais = paises[r.nextInt(paises.length)];
		Equipo ret = new Equipo(pais);
		int c = 0;
		while (ret.getCantidad() < Equipo.capacidad) {
			ret.agregar(new Jugador(pais.toString() + c++, pais, posiciones[r
					.nextInt(posiciones.length)], r.nextInt(10), r.nextInt(3),
					r.nextInt(100)));
		}

		return ret;
	}
	
	public static Equipo generarBueno(){
		Equipo ret = new Equipo();
		for (int i = 0; i < 11; i++) 
		{
			int pos = 0;
			switch (i) {
			case 0:
				pos = 0;
				break;
			case 1: case 2: case 3: case 4:
				pos = 1;
				break;
			case 5: case 6: case 7:
				pos = 2;
				break;
			case 8: case 9: case 10:
				pos = 3;
				break;
			default:
				break;
			}
			
			Jugador asd = new Jugador("Jugador-" + i,paises[r.nextInt(paises.length)] , posiciones[pos], 0, 0, 10);
			ret.agregar(asd);
		}
		return ret;
		
	}
	
}
