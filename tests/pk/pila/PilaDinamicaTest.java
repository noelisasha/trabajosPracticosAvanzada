package pk.pila;
 
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PilaDinamicaTest {
	private PilaDinamica p;
	
	@Before
	public void setUp() throws Exception {
		p=new PilaDinamica();
	}
	
	@Test
	public void testPopVariosElementos() {
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(0);
		for (int i = 0; i < 5; i++) {
			assertEquals(i, p.pop());
		}
	}
	
	@Test
	public void testPopUltimoElemento() {
		p.push(4);
		p.pop();
		assertEquals(null, p.getTope());
	}
	
	@Test
	public void testPeekVariosElementos() {
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(0);
		assertEquals(0, p.peek());
	}
	
	@Test
	public void testPeekSinElementos() {
		assertEquals(null, p.peek());
	}
	
	@Test
	public void isEmpty() {
		assertEquals(true, p.isEmpty());
	}
	
	@Test
	public void noEmpty() {
		p.push(2);
		assertEquals(false, p.isEmpty());
	}
	
	@Test
	public void emptyTest() {
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(0);
		assertEquals(false, p.isEmpty());
		p.empty();
		assertEquals(true, p.isEmpty());
	}
}