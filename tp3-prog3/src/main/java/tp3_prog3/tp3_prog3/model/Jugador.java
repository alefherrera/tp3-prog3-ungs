package tp3_prog3.tp3_prog3.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Jugadores")
public class Jugador {

	@DatabaseField
	private String nombre;
	@DatabaseField
	private Pais seleccion;
	@DatabaseField
	private Posicion posicion;
	@DatabaseField
	private int tarjetasAmarillas;
	@DatabaseField
	private int tarjetasRojas;
	@DatabaseField
	private int puntaje;

	public Jugador(){
		
	}
	
	public Jugador(String nombre, Pais seleccion, Posicion posicion,
			int tarjetasAmarillas, int tarjetasRojas, int puntaje) {
		super();
		this.nombre = nombre;
		this.seleccion = seleccion;
		this.posicion = posicion;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
		this.puntaje = puntaje;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(Pais seleccion) {
		this.seleccion = seleccion;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", seleccion=" + seleccion
				+ ", posicion=" + posicion + ", tarjetasAmarillas="
				+ tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas
				+ ", puntaje=" + puntaje + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((posicion == null) ? 0 : posicion.hashCode());
		result = prime * result + puntaje;
		result = prime * result
				+ ((seleccion == null) ? 0 : seleccion.hashCode());
		result = prime * result + tarjetasAmarillas;
		result = prime * result + tarjetasRojas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (posicion != other.posicion)
			return false;
		if (puntaje != other.puntaje)
			return false;
		if (seleccion != other.seleccion)
			return false;
		if (tarjetasAmarillas != other.tarjetasAmarillas)
			return false;
		if (tarjetasRojas != other.tarjetasRojas)
			return false;
		return true;
	}
	
	

}
