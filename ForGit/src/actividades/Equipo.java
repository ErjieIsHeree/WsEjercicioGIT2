package actividades;

import java.util.Arrays;

public class Equipo {

	public String nombre;
	public String[] jugador;
	
	public Equipo() {
		super();
	}

	public Equipo(String nombre, String[] jugador) {
		super();
		this.nombre = nombre;
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", jugador=" 
	+ Arrays.toString(jugador) + "]";
	}
	
	public void mostrarJugadores() {
		for (String s : jugador) {
			System.out.println(s);
		}
	}
	
	public boolean existeJugador(String jugador) {
		for (String s : this.jugador) {
			if (s.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
