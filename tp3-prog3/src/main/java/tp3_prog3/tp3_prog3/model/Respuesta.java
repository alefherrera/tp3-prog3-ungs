package tp3_prog3.tp3_prog3.model;

public class Respuesta extends Equipo {

	public static final int capacidad = 11;
	private int[] cantidades;
	private int amarillas;
	private int rojas;
	
	public Respuesta(){
		cantidades = new int[4];
	}
	
	public int[] getCantidades(){
		return cantidades;
	}
	
	public int getAmarillas(){
		return amarillas;
	}
	
	public int getRojas(){
		return rojas;
	}
	
	@Override
	public boolean agregar(Jugador j) {
		jugadores.add(j);
		amarillas += j.getTarjetasAmarillas();
		rojas += j.getTarjetasRojas();
		cantidades[j.getPosicion().getValue()]++;
		return true;
	}

	public double getPuntaje() {
		double ret = 0;
		for (Jugador j : jugadores) {
			ret += j.getPuntaje();
		}
		return ret;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t");
		for (Jugador jugador : jugadores) {
			sb.append(jugador);
			sb.append(",\n\t");
		}
		return "{\n Jugadores: [\n" + sb.toString() + "]\n}";
	}

}
