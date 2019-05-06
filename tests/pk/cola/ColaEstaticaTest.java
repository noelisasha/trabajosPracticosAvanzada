package pk.cola;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ColaEstaticaTest {
private ColaEstatica c;
	
	@Before
	public void setUp() throws Exception {
		c= new ColaEstatica(4);
	}
	
	@Test
	public void testOfferNoPaseElMaximo() {
		c.offer(0);
		c.offer(1);
		c.offer(2);
		c.offer(3);
		assertEquals(false, c.offer(3));
	}
	
	@Test
	public void testPollConElementos() {
		c.offer(0);
		c.offer(1);
		c.offer(2);
		c.offer(3);
		for (int i = 0; i < 4; i++) {
			assertEquals(i, c.poll());
		}
	}
	
	@Test
	public void testPollSinElementos() {
			assertEquals(null, c.poll());
	}
	
	@Test
	public void testPeek() {
		c.offer(0);
		c.offer(1);
		c.offer(2);
		c.offer(3);
		assertEquals(0, c.peek());
	}
	
	@Test
	public void testPeekSinElementos() {
		assertEquals(null, c.peek());
	}
	
	@Test
	public void isEmpty() {
		assertEquals(true, c.isEmpty());
	}
	
	@Test
	public void noEmpty() {
		c.offer(2);
		assertEquals(false, c.isEmpty());
	}
	
	@Test
	public void emptyTest() {
		c.offer(0);
		c.offer(1);
		c.offer(2);
		c.offer(3);
		assertEquals(false, c.isEmpty());
		c.empty();
		assertEquals(true, c.isEmpty());
	}
}
