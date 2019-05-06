package pk.cola;
 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ColaHLTest {
	private ColaHL c;
	
	@Before
	public void setUp() throws Exception {
		c= new ColaHL();
	}

	@Test
	public void testOffer() {
		c.offer(0);
		c.offer(1);
		c.offer(2);
		c.offer(3);
		c.offer(4);
		for (int i = 0; i < 5; i++) {
			assertEquals(i, c.searchAt(i));
		}
	}
	
	@Test
	public void testPoll() {
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
