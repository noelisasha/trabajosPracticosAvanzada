package pk.pila;

import pk.lista.Lista;

public class PilaCL implements Pila {
	private Lista lista;

	public PilaCL() {
		lista = new Lista();
	}

	@Override
	public void empty() {
		lista.empty();
	}

	@Override
	public boolean push(Object dato) {
		return lista.pushBack(dato);
	}

	@Override
	public Object pop() {
		return lista.popBack();
	}

	@Override
	public Object peek() {
		return lista.searchAt(lista.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	public Lista getLista() {
		return lista;
	} 
}
