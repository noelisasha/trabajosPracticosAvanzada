package pk.lista;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import pk.lista.Lista;

public class ListaTest {
	private Lista l;

	@Before
	public void setUp() {
		l = new Lista();
	}

	@Test
	public void popBackTest() {
		String [] valores= {"A", "B", "C"};
		for(int i = 0; i < 3; i++) {
			l.pushBack(valores[i]);			
		}
		for(int i = 2; i >= 0; i--) {
			assertEquals(valores[i], l.popBack());			
		}
		assertEquals(true, l.getPrimero() == null);
	}
 
	@Test
	public void pushFrontTest() {
		for (int i = 0; i < 5; i++) {
			l.pushFront(i);
		}
		for (int i = 0; i < 5; i++) {
			assertEquals(i, l.popBack());
		}
	}
	
	@Test
	public void popFrontTest() {
		for (int i = 0; i < 5; i++) {
			l.pushFront(i);
		}
		for (int i = 4; i >= 0; i--) {
			assertEquals(i, l.popFront());
		}
		assertEquals(null, l.getPrimero());
	}
	
	@Test
	public void removePrimerObjeto() {
		l.pushBack(1);
		assertEquals(1, l.remove(1));
		assertEquals(null, l.getPrimero());
	}
	
	@Test
	public void removeUltimoObjeto() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		assertEquals(1, l.remove(3));
		for (int i = 0; i < 3; i++) {
			assertEquals(1, l.popFront());
		}
	}
	
	@Test
	public void removeObjetoIntermedio() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(1);
		assertEquals(1, l.remove(3));
		for (int i = 0; i < 3; i++) {
			assertEquals(1, l.popFront());
		}
	}

	@Test
	public void reverseTest() {
		for (int i = 0; i < 10; i++) {
			l.pushBack(i);
		}
		l.reverse();
		for (int i = 9; i >= 0; i--) {
			assertEquals(i, l.popFront());
		}
	}
	
	@Test
	public void insertAtPrimeraPos() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(1);
		l.insertAt(0, 5);
		assertEquals(5, l.popFront());
	}
	
	@Test
	public void insertAtUltimaPos() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(1);
		l.insertAt(4, 5);
		assertEquals(5, l.popBack());
	}
	
	@Test
	public void insertAtPosIntermedia() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(1);
		l.insertAt(2, 5);
		for (int i = 0; i < 2; i++) {
			l.popFront();
		}
		assertEquals(5, l.popFront());
	}
	
	@Test
	public void noInsertAtPosNegativa() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(1);
		l.insertAt(-2, 5);
		for (int i = 0; i < 5 && l.getPrimero() != null; i++) {
			assertNotEquals(5, l.popFront());			
		}
	}

	@Test
	public void noInsertAtPosNoValida() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(1);
		l.insertAt(6, 5);
		for (int i = 0; i < 5 && l.getPrimero() != null; i++) {
			assertNotEquals(5, l.popFront());			
		}
	}
	
	@Test
	public void erasetAtPrimeraPos() {
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(4);
		l.pushBack(5);
		l.eraseAt(0);
		assertEquals(3, l.popFront());
	}

	@Test
	public void erasetAtUltimaPos() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		l.eraseAt(3);
		assertEquals(3, l.popBack());
	}

	@Test
	public void eraseAtPosIntermedia() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		l.eraseAt(2);
		for (int i = 0; i < 2; i++) {
			l.popFront();
		}
		assertEquals(4, l.popFront());
	}

	@Test
	public void noEraseAtPosNegativa() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		l.eraseAt(-2);
		for (int i = 1; i < 5; i++) {
			assertEquals(i, l.popFront());			
		}
	}

	@Test
	public void noEraseAtPosNoValida() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		l.eraseAt(6);
		for (int i = 1; i < 5; i++) {
			assertEquals(i, l.popFront());			
		}
	}
	
	@Test
	public void isEmpty() {
		assertEquals(true, l.isEmpty());
	}
	
	@Test
	public void noEmpty() {
		l.pushBack(2);
		assertEquals(false, l.isEmpty());
	}
	
	@Test
	public void emptyTest() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(false, l.isEmpty());
		l.empty();
		assertEquals(true, l.isEmpty());
	}
	
	@Test
	public void searchTestPrincipio() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(0, l.search(1));
	}
	
	@Test
	public void searchTestFinal() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(3, l.search(4));
	}
	
	@Test
	public void searchTestMedio() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(2, l.search(3));
	}
	
	@Test
	public void noSearchTest() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(-1, l.search(10));
	}
	
	@Test
	public void searchTestAtPrincipio() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(1, l.searchAt(0));
	}
	
	@Test
	public void searchAtTestFinal() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(4, l.searchAt(3));
	}
	
	@Test
	public void searchAtTestMedio() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(2, l.searchAt(1));
	}
	
	@Test
	public void noSearchAtTestNroNegativo() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(null, l.searchAt(-1));
	}
	
	@Test
	public void noSearchAtTestPosNoValida() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		l.pushBack(4);
		assertEquals(null, l.searchAt(20));
	}
	
	@Test
	public void sizeTestConElementos() {
		l.pushBack(1);
		l.pushBack(1);
		l.pushBack(3);
		l.pushBack(1);
		assertEquals(4, l.size());
	}
	
	@Test
	public void sizeTestSinElementos() {
		assertEquals(0, l.size());
	}	
}

