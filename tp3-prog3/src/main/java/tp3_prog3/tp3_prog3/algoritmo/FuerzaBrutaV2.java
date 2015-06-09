package tp3_prog3.tp3_prog3.algoritmo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Pais;
import tp3_prog3.tp3_prog3.model.Respuesta;

public class FuerzaBrutaV2 {

	
	public static Respuesta resolver(List<Jugador> universo) {
		_universo = universo;
		resultados = new ArrayList<Respuesta>();
		generarCombinaciones();
		
		resultados.sort(new Comparator<Respuesta>() {

			@Override
			public int compare(Respuesta o1, Respuesta o2) {
				if (o1.getPuntaje() < o2.getPuntaje())
					return 1;
				if (o1.getPuntaje() == o2.getPuntaje())
					return 0;
				return -1;
			}
		});
		
		return resultados.get(0);		
	}
	
	private static List<Jugador> _universo;
	private static List<Respuesta> resultados;
	
	public static void probarPosiciones(int[] posiciones){
		
		Respuesta r = new Respuesta();
		//System.out.println("probando: " + Arrays.toString(posiciones));
		for (int i : posiciones) {
			Jugador j = _universo.get(i);
			if (cumpleTodo(r, j)) {
				r.agregar(j);
			}
			else
				return;
		}
		//System.out.println("ENCONTRRRRE UNOOO");
			resultados.add(r);
		
		
	}
	
	
	
	private static boolean cumpleTodo(Respuesta r, Jugador j) {
		return !r.getJugadores().contains(j)
				&& r.getCantidad() < Respuesta.capacidad
				&& cumpleFormacion(r, j) && cumpleSeleccion(r, j)
				&& cumpleAmarillas(r, j) && cumpleRojas(r, j);
	}

	private static final int[] maximos = { 1, 4, 3, 3 };

	private static boolean cumpleFormacion(Respuesta r, Jugador j) {
		boolean ret = true;
		int[] cantidades = r.getCantidades();
		int k = j.getPosicion().getValue();
		for (int i = 0; i < maximos.length; i++) {
			ret = ret && cantidades[i] + (i == k ? 1 : 0) <= maximos[i];
		}
		return ret;
	}

	private static boolean cumpleSeleccion(Respuesta r, Jugador j) {
		for (Map.Entry<Pais, Integer> entry : r.paises().entrySet())
		{
		    if (entry.getValue() > 5)
		    	return false;
		}

		return true;
	}

	private static final int maxAmarillas = 3;

	private static boolean cumpleAmarillas(Respuesta r, Jugador j) {
		return r.getAmarillas() + j.getTarjetasAmarillas() <= maxAmarillas;
	}

	private static final int maxRojas = 1;

	private static boolean cumpleRojas(Respuesta r, Jugador j) {
		return r.getRojas() + j.getTarjetasRojas() <= maxRojas;
	}
	
	private static void generarCombinaciones(){
		int[] arr = new int[_universo.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int[] result = new int[Respuesta.capacidad];
		combinaciones(arr, Respuesta.capacidad, 0, result);
		return;
	}
	
	private static void combinaciones(int[] arr, int len, int startPosition, int[] result){
        if (len == 0){
            //System.out.println(Arrays.toString(result));
        	probarPosiciones(result);
        	
        	
            return;
        }       
        for (int i = startPosition; i <= arr.length-len; i++){
            result[result.length - len] = arr[i];
            combinaciones(arr, len-1, i+1, result);
        }
    }   
	
}
