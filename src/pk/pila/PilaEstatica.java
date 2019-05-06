package pk.pila;

public class PilaEstatica implements Pila {
	private int tam;
	private int idx;
	private Object[] datos;

	public PilaEstatica(int tam) {
		this.tam = tam;
		idx = 0;
		datos = new Object[tam];
	}

	@Override
	public void empty() {
		idx = 0;
	}

	@Override
	public boolean push(Object dato) {
		if (idx >= tam) {
			return false;
		}

		datos[idx++] = dato;
		return true;
	}

	@Override
	public Object pop() {
		if (idx == 0) {
			return null;
		}

		return datos[--idx];
	}

	@Override
	public Object peek() {
		if (idx == 0) {
			return null;
		}

		return datos[idx - 1];
	}

	@Override
	public boolean isEmpty() {
		return idx == 0;
	}

}
