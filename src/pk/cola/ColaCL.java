package pk.cola;

import pk.lista.Lista;

public class ColaCL implements Cola {
	Lista lista;

	public ColaCL() {
		lista = new Lista();
	}

	@Override
	public boolean offer(Object dato) {
		return lista.pushBack(dato);
	}

	@Override
	public Object poll() {
		return lista.popFront();
	}

	@Override
	public Object peek() {
		return lista.searchAt(0);
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	@Override
	public void empty() {
		lista.empty();
	}

	public Lista getLista() {
		return lista;
	}
}
