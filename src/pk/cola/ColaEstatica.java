package pk.cola;

public class ColaEstatica implements Cola {
	private int tam;
	private int pri;
	private int ult;
	private Object[] datos;

	public ColaEstatica(int tam) {
		this.tam = tam;
		pri = 0;
		ult = -1;
		datos = new Object[tam];
	}

	@Override
	public boolean offer(Object dato) {
		if (pri == ult + 1 && ult != -1 || (pri == 0 && ult == tam - 1)) {
			return false;
		}

		if (++ult >= datos.length) {
			ult = 0;
		}

		datos[ult] = dato;

		return true;
	}

	@Override
	public Object poll() {
		if (ult == -1) {
			return null;
		}

		Object r = datos[pri];

		if (pri == ult) {
			pri = 0;
			ult = -1;
		} else {
			pri++;

			if (pri >= tam) {
				pri = 0;
			}
		}

		return r;
	}

	@Override
	public Object peek() {
		if (ult == -1) {
			return null;
		}

		return datos[pri];
	}

	@Override
	public boolean isEmpty() {
		return ult == -1;
	}

	@Override
	public void empty() {
		pri = 0;
		ult = -1;
	}

}
