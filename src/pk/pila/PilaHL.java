package pk.pila;

import pk.lista.Lista;

public class PilaHL extends Lista implements Pila {

	@Override
	public boolean push(Object dato) {
		return this.pushBack(dato);
	}

	@Override
	public Object pop() {
		return this.popBack();
	}

	@Override
	public Object peek() {
		return this.searchAt(this.size() - 1);
	}

}
