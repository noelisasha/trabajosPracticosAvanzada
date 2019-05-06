package pk.pila;

import org.junit.Before;
import org.junit.Test;

import pk.pila.PilaDinamica;
import pk.pila.PilaEstatica;

public class FatigaTest {
	PilaDinamica pd;
	PilaEstatica pe;
	
	@Before
	public void setUp() {
		pd = new PilaDinamica();
		pe = new PilaEstatica(1000000);
	}

	@Test
	public void testPilaDinamica() {
		long tiempoIni = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++ ) {
			pd.push(i);
		}
		long tiempoFin = System.currentTimeMillis();
		System.out.println("Pila Dinamica (ms): " + (tiempoFin - tiempoIni));
	}
	
	@Test
	public void testPilaEstatica() {
		long tiempoIni = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++ ) {
			pe.push(i);
		}
		long tiempoFin = System.currentTimeMillis();
		System.out.println("Pila Estatica (ms): " + (tiempoFin - tiempoIni));
	}
}
