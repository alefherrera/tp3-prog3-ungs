package tp3_prog3.tp3_prog3;

import tp3_prog3.tp3_prog3.model.Equipo;
import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Pais;
import tp3_prog3.tp3_prog3.model.Posicion;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testAlgoritmo(){
    	//Equipos de prueba
    	Equipo eqArg = new Equipo();
    	eqArg.agregar(new Jugador("Jugador1" , Pais.ARGENTINA , Posicion.ARQUERO, 1, 0, 10));
    	eqArg.agregar(new Jugador("Jugador2" , Pais.ARGENTINA , Posicion.DEFENSOR, 2, 0, 5));
    	eqArg.agregar(new Jugador("Jugador3" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 10));
    	eqArg.agregar(new Jugador("Jugador4" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador5" , Pais.ARGENTINA , Posicion.DEFENSOR, 3, 0, 5));
    	eqArg.agregar(new Jugador("Jugador6" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador7" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador8" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 10));
    	eqArg.agregar(new Jugador("Jugador9" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador5" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador11" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 5));
    	eqArg.agregar(new Jugador("Jugador12" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 10));
    	eqArg.agregar(new Jugador("Jugador13" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 5));
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
    	eqBra.agregar(new Jugador("Jugador26" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador27" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador28" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador29" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));
    	eqBra.agregar(new Jugador("Jugador30" , Pais.BRASIL , Posicion.DELANTERO, 0, 0, 5));

    	Equipo eqBol = new Equipo();
    	eqBol.agregar(new Jugador("Jugador31" , Pais.BOLIVIA , Posicion.ARQUERO, 0, 0, 5));
    	eqBol.agregar(new Jugador("Jugador32" , Pais.BOLIVIA , Posicion.DEFENSOR, 0, 0, 10));
    	eqBol.agregar(new Jugador("Jugador33" , Pais.BOLIVIA , Posicion.DEFENSOR, 1, 0, 5));
    	eqBol.agregar(new Jugador("Jugador34" , Pais.BOLIVIA , Posicion.DEFENSOR, 0, 1, 5));
    	eqBol.agregar(new Jugador("Jugador35" , Pais.BOLIVIA , Posicion.DEFENSOR, 0, 0, 5));
    	eqBol.agregar(new Jugador("Jugador36" , Pais.BOLIVIA , Posicion.DEFENSOR, 0, 0, 5));
    	eqBol.agregar(new Jugador("Jugador37" , Pais.BOLIVIA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqBol.agregar(new Jugador("Jugador38" , Pais.BOLIVIA , Posicion.MEDIOCAMPISTA, 2, 0, 5));
    	eqBol.agregar(new Jugador("Jugador39" , Pais.BOLIVIA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqBol.agregar(new Jugador("Jugador40" , Pais.BOLIVIA , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqBol.agregar(new Jugador("Jugador41" , Pais.BOLIVIA , Posicion.DELANTERO, 0, 1, 5));
    	eqBol.agregar(new Jugador("Jugador42" , Pais.BOLIVIA , Posicion.DELANTERO, 1, 0, 5));
    	eqBol.agregar(new Jugador("Jugador43" , Pais.BOLIVIA , Posicion.DELANTERO, 0, 0, 5));
    	eqBol.agregar(new Jugador("Jugador44" , Pais.BOLIVIA , Posicion.DELANTERO, 2, 0, 5));
    	eqBol.agregar(new Jugador("Jugador45" , Pais.BOLIVIA , Posicion.DELANTERO, 0, 0, 5));

    	Equipo eqChi = new Equipo();
    	eqChi.agregar(new Jugador("Jugador46" , Pais.CHILE , Posicion.ARQUERO, 0, 1, 5));
    	eqChi.agregar(new Jugador("Jugador47" , Pais.CHILE , Posicion.DEFENSOR, 1, 0, 5));
    	eqChi.agregar(new Jugador("Jugador48" , Pais.CHILE , Posicion.DEFENSOR, 0, 0, 5));
    	eqChi.agregar(new Jugador("Jugador49" , Pais.CHILE , Posicion.DEFENSOR, 1, 0, 5));
    	eqChi.agregar(new Jugador("Jugador50" , Pais.CHILE , Posicion.DEFENSOR, 0, 0, 5));
    	eqChi.agregar(new Jugador("Jugador51" , Pais.CHILE , Posicion.DEFENSOR, 0, 0, 5));
    	eqChi.agregar(new Jugador("Jugador52" , Pais.CHILE , Posicion.MEDIOCAMPISTA, 0, 0, 10));
    	eqChi.agregar(new Jugador("Jugador53" , Pais.CHILE , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqChi.agregar(new Jugador("Jugador54" , Pais.CHILE , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqChi.agregar(new Jugador("Jugador55" , Pais.CHILE , Posicion.MEDIOCAMPISTA, 0, 0, 5));
    	eqChi.agregar(new Jugador("Jugador56" , Pais.CHILE , Posicion.DELANTERO, 1, 0, 5));
    	eqChi.agregar(new Jugador("Jugador57" , Pais.CHILE , Posicion.DELANTERO, 0, 2, 5));
    	eqChi.agregar(new Jugador("Jugador58" , Pais.CHILE , Posicion.DELANTERO, 0, 1, 10));
    	eqChi.agregar(new Jugador("Jugador59" , Pais.CHILE , Posicion.DELANTERO, 0, 0, 10));
    	eqChi.agregar(new Jugador("Jugador60" , Pais.CHILE , Posicion.DELANTERO, 0, 0, 5));
	    	
    	//Equipo óptimo
    	Equipo eqOpt = new Equipo();
    	eqOpt.agregar(new Jugador("Jugador1" , Pais.ARGENTINA , Posicion.ARQUERO, 1, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador3" , Pais.ARGENTINA , Posicion.DEFENSOR, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador18" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador19" , Pais.BRASIL , Posicion.DEFENSOR, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador32" , Pais.BOLIVIA , Posicion.DEFENSOR, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador8" , Pais.ARGENTINA , Posicion.MEDIOCAMPISTA, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador23" , Pais.BRASIL , Posicion.MEDIOCAMPISTA, 1, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador52" , Pais.CHILE , Posicion.MEDIOCAMPISTA, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador12" , Pais.ARGENTINA , Posicion.DELANTERO, 0, 0, 10));
    	eqOpt.agregar(new Jugador("Jugador58" , Pais.CHILE , Posicion.DELANTERO, 0, 1, 10));
    	eqOpt.agregar(new Jugador("Jugador59" , Pais.CHILE , Posicion.DELANTERO, 0, 0, 10));
    	    	
    	
    	
    }
    
}
