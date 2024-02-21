package actividades;

import java.util.Arrays;

public class Equipo {

	public String nombre;
	public String[] jugadores;
	
	public Equipo() {
		super();
	}

	public Equipo(String nombre, String[] jugador) {
		super();
		this.nombre = nombre;
		this.jugadores = jugador;
	}

	@Override
	public String toString() {
		return "equipo: [nombre=" + nombre + ", jugador=" 
	+ Arrays.toString(jugadores) + "]";
	}
	
	public void mostrarJugadores() {
		for (String s : jugadores) {
			System.out.println(s);
		}
	}
	
	public boolean existeJugador(String jugador) {
		for (String s : this.jugadores) {
			if (s.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	public int getNumeroJugadores() {
        return jugadores.length;
    }

    
    public boolean esAptoParaJugar() {
        return jugadores.length >= 7;
    }
    
	public boolean listasIguales (Equipo segundoEquipo) {
		if (this.jugadores.length != segundoEquipo.jugadores.length) {
			return false;
		}
		
		for(String otroJugador : segundoEquipo.jugadores) {
			if(existeJugador(otroJugador)) {
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean equiposIguales (Equipo segundoEquipo) {
		if (this.nombre.equalsIgnoreCase(segundoEquipo.nombre)
				&& listasIguales(segundoEquipo)) {
			return true;
		}
		return false;
	}
	
}
