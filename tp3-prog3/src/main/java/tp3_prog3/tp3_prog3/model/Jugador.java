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

}
