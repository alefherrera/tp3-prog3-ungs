package tp3_prog3.tp3_prog3.main;

import java.util.ArrayList;
import java.util.List;

import tp3_prog3.tp3_prog3.algoritmo.FuerzaBrutaV2;
import tp3_prog3.tp3_prog3.model.Equipo;
import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Pais;
import tp3_prog3.tp3_prog3.model.Posicion;

public class Main {

	public static void main(String[] args) {

		int c = 0;

		List<Equipo> equipos = new ArrayList<Equipo>();
		List<Jugador> universo = new ArrayList<Jugador>();
		
		/*while (c < 1) {
			equipos.add(GeneradorEquipo.generar());
			c++;
		}*/
		
		//equipos.add(GeneradorEquipo.generarBueno(20, Pais.ARGENTINA));
		//equipos.add(GeneradorEquipo.generarBueno(10, Pais.BOLIVIA));
		
		Equipo eqArg = new Equipo();
    	eqArg.agregar(new Jugador("Jugador1" , Pais.ARGENTINA , Posicion.ARQUERO, 1, 0, 10));
    	eqArg.agregar(new Jugador("Jugador2" , Pais.ARGENTINA , Posicion.DEFENSOR, 2, 0, 5));
    	eqArg.agregar(new Jugador("Jugador3" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 10));
    //	eqArg.agregar(new Jugador("Jugador4" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador5" , Pais.ARGENTINA , Posicion.DEFENSOR, 3, 0, 5));
    //	eqArg.agregar(new Jugador("Jugador6" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador7" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador8" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 10));
    //	eqArg.agregar(new Jugador("Jugador9" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador5" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
   // 	eqArg.agregar(new Jugador("Jugador11" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador12" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 10));
    //	eqArg.agregar(new Jugador("Jugador13" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador14" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador15" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 5));

    	Equipo eqBra = new Equipo();
    	eqBra.agregar(new Jugador("Jugador16" , Pais.BRASIL , Posicion.ARQUERO, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador17" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador18" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 10));
    	eqBra.agregar(new Jugador("Jugador19" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 10));
    	eqBra.agregar(new Jugador("Jugador20" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador21" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador22" , Pais.BRASIL , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador23" , Pais.BRASIL , Posicion.MEDIOCAMPISTA, 1, 0, 10));
    	eqBra.agregar(new Jugador("Jugador24" , Pais.BRASIL , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador25" , Pais.BRASIL , Posicion.MEDIOCAMPISTA, 0, 0, 5));
//    	eqBra.agregar(new Jugador("Jugador26" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
//    	eqBra.agregar(new Jugador("Jugador27" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
//    	eqBra.agregar(new Jugador("Jugador28" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
//    	eqBra.agregar(new Jugador("Jugador29" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
//    	eqBra.agregar(new Jugador("Jugador30" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
		
    	Equipo eqOpt = new Equipo();
    //	eqOpt.agregar(new Jugador("Jugador1" , Pais.ARGENTINA , Posicion.ARQUERO, 1, 0, 10));
    //	eqOpt.agregar(new Jugador("Jugador3" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 10));
    //	eqOpt.agregar(new Jugador("Jugador18" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 10));
    //	eqOpt.agregar(new Jugador("Jugador19" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador32" , Pais.BOLIVIA , Posicion.DEFENSOR, 0, 0, 10));
    //	eqOpt.agregar(new Jugador("Jugador8" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 10));
    //	eqOpt.agregar(new Jugador("Jugador23" , Pais.BRASIL , Posicion.MEDIOCAMPISTA, 1, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador52" , Pais.CHILE , Posicion.MEDIOCAMPISTA, 0, 0, 10));
    //	eqOpt.agregar(new Jugador("Jugador12" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador58" , Pais.CHILE , Posicion.DELANTERO, 0, 1, 10));
    	eqOpt.agregar(new Jugador("Jugador59" , Pais.CHILE , Posicion.DELANTERO, 0, 0, 10));
    	
    	equipos.add(eqArg);
    	equipos.add(eqBra);
    	equipos.add(eqOpt);
    	
    	
		for (Equipo equipo : equipos) {
			universo.addAll(equipo.getJugadores());
			System.out.println(equipo);
		}
		
		
		System.out.println("---------------SOLUCION-------------\n");
		System.out.println(FuerzaBrutaV2.resolver(universo));
		

	}

}
