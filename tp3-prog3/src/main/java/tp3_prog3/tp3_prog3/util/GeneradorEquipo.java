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
	
	public static Equipo generarBueno(int puntaje, Pais pais){
		Equipo ret = new Equipo();
		Posicion pos;
		for (int i = 0; i < 11; i++) 
		{
			switch (i) {
			case 0:
				pos = Posicion.ARQUERO;
				break;
			case 1: case 2: case 3: case 4:
				pos = Posicion.DEFENSOR;
				break;
			case 5: case 6: case 7:
				pos = Posicion.MEDIOCAMPISTA;
				break;
			default:
				pos = Posicion.DELANTERO;
				break;
			}
			
			Jugador asd = new Jugador(pais.toString() + i,pais , pos, 0, 0, puntaje);
			ret.agregar(asd);
		}
		return ret;
		
	}
	
}
