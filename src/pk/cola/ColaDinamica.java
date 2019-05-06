package pk.cola;

import pk.lista.Nodo;

public class ColaDinamica implements Cola {
	private Nodo primero;
	private Nodo ultimo;
	private int tam;

	public ColaDinamica() {
		tam = 0;
		primero = null;
		ultimo = null;
	}

	@Override
	public boolean offer(Object dato) {
		Nodo nuevo = new Nodo(dato);

		if (isEmpty()) {
			primero = nuevo;
		} else {
			ultimo.setSig(nuevo);
		}

		ultimo = nuevo;
		tam++;

		return true;
	}

	@Override
	public Object poll() {
		if (isEmpty()) {
			return null;
		}

		Object r = primero.getDato();

		if (primero == ultimo) {
			primero = null;
			ultimo = null;
		} else {			
			primero = primero.getSig();
		}
		
		tam--;

		return r;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			return null;
		}

		return primero.getDato();
	}

	@Override
	public boolean isEmpty() {
		return tam == 0;
	}

	@Override
	public void empty() {
		primero = null;
		ultimo = null;
		tam = 0;
	}

	public int size() {
		return tam;
	}

	public Nodo getPrimero() {
		return primero;
	}

	public Nodo getUltimo() {
		return ultimo;
	}
}
