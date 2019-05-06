package pk.pila;

import pk.lista.Nodo;

public class PilaDinamica implements Pila {
	private int tam;
	private Nodo tope;

	public PilaDinamica() {
		tope = null;
	}

	@Override
	public void empty() {
		tope = null;
		tam = 0;
	}

	@Override
	public boolean push(Object dato) {
		Nodo nuevo = new Nodo(dato);

		if (!isEmpty()) {
			nuevo.setSig(tope);
		}

		tope = nuevo;
		tam++;

		return true;
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			return null;
		}

		Object r = tope.getDato();

		tope = tope.getSig();
		tam--;

		return r;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			return null;
		}

		return tope.getDato();
	}

	@Override
	public boolean isEmpty() {
		return tam == 0;
	}

	public Nodo getTope() {
		return tope;
	}
}
