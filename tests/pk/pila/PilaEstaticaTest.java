package pk.pila;
 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilaEstaticaTest {
private PilaEstatica p;
	
	@Before
	public void setUp() throws Exception {
		p=new PilaEstatica(4);
	}
	
	@Test
	public void testPushNoPaseMaximo() {
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(0);
		assertEquals(false, p.push(3));
	}
	
	@Test
	public void testPop() {
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(0);
		for (int i = 0; i < 4; i++) {
			assertEquals(i, p.pop());
		}
	}
		
	@Test
	public void testQuePopSinElementos() {			
		assertEquals(null, p.pop());
	}
	 
	@Test
	public void testPeekConElementos() {
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
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(0);
		assertEquals(false, p.isEmpty());
		p.empty();
		assertEquals(true, p.isEmpty());
	}
}
