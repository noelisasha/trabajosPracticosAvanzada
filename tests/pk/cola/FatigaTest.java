package pk.cola;

import org.junit.Before;
import org.junit.Test;

public class FatigaTest {
	ColaDinamica cd;
	ColaEstatica ce;
	
	@Before
	public void setUp() {
		cd = new ColaDinamica();
		ce = new ColaEstatica(1000000);
	}

	@Test
	public void testColaDinamica() {
		long tiempoIni = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++ ) {
			cd.offer(i);
		}
		long tiempoFin = System.currentTimeMillis();
		System.out.println("Cola Dinamica (ms): " + (tiempoFin - tiempoIni));
	}
	
	@Test
	public void testColaEstatica() {
		long tiempoIni = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++ ) {
			ce.offer(i);
		}
		long tiempoFin = System.currentTimeMillis();
		System.out.println("Cola Estatica (ms): " + (tiempoFin - tiempoIni));
	}
}
