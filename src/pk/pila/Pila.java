package pk.pila;

public interface Pila {

	public void empty(); // Vacia la pila

	public boolean push(Object dato); // Apilar

	public Object pop(); // Desapilar

	public Object peek(); // Devuelve ultimo elemento apilado sin sacarlo de la pila

	public boolean isEmpty(); // Devuelve si la lista esta vacia
	
}
