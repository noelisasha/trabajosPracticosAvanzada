package pk.lista;

public class Nodo {
	private Object dato;
	private Nodo sig;
	
	public Nodo(Object dato) {
		this.dato = dato;
		sig = null;
	}
	
	public Object getDato() {
		return dato;
	}
	
	public void setDato(Object dato) {
		this.dato = dato;
	}
	
	public Nodo getSig() {
		return sig;
	}
	
	public void setSig(Nodo sig) {
		this.sig = sig;
	}	
}
