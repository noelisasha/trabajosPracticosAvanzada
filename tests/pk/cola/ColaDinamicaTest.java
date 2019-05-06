package pk.cola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class ColaDinamicaTest {
	private ColaDinamica c;

	@Before
	public void setUp() {
		c = new ColaDinamica();
	}

	@Test
	public void testOfferPrimerElemento() {
		c.offer(0);
		assertSame(c.getPrimero(), c.getUltimo());
	}
	 
	@Test
	public void testOfferVariosElementos() {
		c.offer(0);
		c.offer(1);
		c.offer(2);
		c.offer(3);
		c.offer(4);
		for (int i = 0; i < 5; i++) {
			assertEquals(i, c.poll());
		}
	}
	@Test
	public void testPollUltimoElemento() {
		c.offer(0);
		c.poll();
		assertEquals(null, c.getPrimero());
		assertEquals(null, c.getUltimo());
	}  
	
	@Test
	public void testPeek() {
		c.offer(0);
		c.offer(1);
		c.offer(2);
		c.offer(3);
		c.offer(4);
		assertEquals(0, c.peek());
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
		c.offer(4);
		assertEquals(false, c.isEmpty());
		c.empty();
		assertEquals(true, c.isEmpty());
	}
}
