package tp3_prog3.tp3_prog3.model;

public enum Posicion {

	ARQUERO(0), DEFENSOR(1), MEDIOCAMPISTA(2), DELANTERO(3);
	
	private final int value;
    private Posicion(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
