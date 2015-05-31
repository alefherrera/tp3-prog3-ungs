package tp3_prog3.tp3_prog3.service;

import java.sql.SQLException;

import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.persistencia.Persistencia;

public class ApplicationService {

	private static ApplicationService instance;
	
	public static ApplicationService getInstance(){
		if (instance == null)
			instance = new ApplicationService();
		return instance;
	}
	
	private ApplicationService(){
		
	}
	
	public void InitDb(){
		Persistencia service = Persistencia.getInstance();
		try {
			service.createTable(Jugador.class);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
