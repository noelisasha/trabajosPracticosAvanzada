package pk.lista;

public class Lista {
	private Nodo primero; // PRIMER NODO
	private Nodo ultimo; // ULTIMO NODO
	private int tam;

	public Lista() {
		primero = null;
		ultimo = null;
	}

	public boolean pushBack(Object dato) {
		Nodo nuevo = new Nodo(dato);

		if (isEmpty()) {
			primero = nuevo;
			ultimo = nuevo;
		} else {
			ultimo.setSig(nuevo);
		}

		ultimo = nuevo;
		tam++;

		return true;
	}

	public Object popBack() {
		if (isEmpty()) {
			return null;
		}

		Object r = ultimo;

		if (primero == ultimo) {
			primero = null;
			ultimo = null;
		} else {
			Nodo aux = primero;

			while (aux.getSig() != ultimo) {
				aux = aux.getSig();
			}

			aux.setSig(null);
			ultimo = aux;
		}

		tam--;
		return ((Nodo) r).getDato();
	}

	public boolean pushFront(Object dato) {
		Nodo nuevo = new Nodo(dato);

		if (isEmpty()) {
			ultimo = nuevo;
		} else {
			nuevo.setSig(primero);
		}

		primero = nuevo;

		tam++;
		return true;
	}

	public Object popFront() {
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

	public int remove(Object dato) {
		int cantRemovidos = 0;

		Nodo aux = primero;
		Nodo ant = null;

		while (aux != null) {
			if (aux.getDato().equals(dato)) {
				if (ant == null) {
					primero = primero.getSig();
				} else {
					ant.setSig(aux.getSig());
				}

				cantRemovidos++;
				tam--;
			}

			ant = aux;
			aux = aux.getSig();
		}

		return cantRemovidos;
	}

	public void reverse() {
		Nodo aux = primero;
		Nodo ant = null;
		Nodo sig = primero.getSig();

		primero = ultimo;
		ultimo = aux;

		while (aux.getSig() != null) {
			aux.setSig(ant);
			ant = aux;
			aux = sig;
			if (aux.getSig() != null) {
				sig = aux.getSig();
			}
		}

		aux.setSig(ant);
	}

	public boolean insertAt(int pos, Object dato) {
		Nodo aux = primero;
		Nodo ant = null;
		Nodo nuevo = new Nodo(dato);
		int i = 0;

		while (aux != null && i < pos) {
			i++;
			ant = aux;
			aux = aux.getSig();
		}
		if (i == pos) {
			if (ant == null) {
				primero = nuevo;
			} else {
				ant.setSig(nuevo);
			}
			if(aux == null) {
				ultimo = nuevo;
			}
			nuevo.setSig(aux);
			tam++;
			return true;
		}
		return false;
	}

	public boolean eraseAt(int pos) {
		Nodo aux = primero;
		Nodo ant = null;
		int i = 0;

		while (aux != null && i <= pos) {
			if (i == pos) {
				if (ant == null) {
					primero = primero.getSig();
				} else {
					if(aux.getSig() == null) {
						ultimo=ant;
					}
					ant.setSig(aux.getSig());
				}

				tam--;

				return true;
			}

			i++;
			ant = aux;
			aux = aux.getSig();
		}

		return false;
	}

	public boolean isEmpty() {
		return tam == 0;
	}

	public void empty() {
		primero = null;
		ultimo = null;
		tam = 0;
	}

	public int search(Object dato) {
		Nodo aux = primero;
		int i = 0;

		while (aux != null) {
			if (aux.getDato().equals(dato)) {
				return i;
			}

			i++;
			aux = aux.getSig();
		}

		return -1;
	}

	public Object searchAt(int pos) {
		Nodo aux = primero;
		int i = 0;

		while (aux != null && i <= pos) {
			if (i == pos) {
				return aux.getDato();
			}

			i++;
			aux = aux.getSig();
		}

		return null;
	}

	public int size() {
		return tam;
	}

	public Nodo getPrimero() {
		return primero;
	}
}
