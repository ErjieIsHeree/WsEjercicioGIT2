package actividades;

import java.util.Scanner;

public class MainActividad {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Equipo lista1 = new Equipo();
			Equipo lista2 = new Equipo();
			
			Equipo[] equipos = new Equipo[2];
			equipos[0] = lista1;
			equipos[1] = lista2;
			
			for (Equipo e : equipos) {
				pedirDatos(e);
				
				System.out.println(e.toString());
				e.mostrarJugadores();
				System.out.println("Indique el jugador que quiera buscar dentro de la lista a ver si está");
				String nombre = sc.nextLine();
				System.out.println("existe = " + e.existeJugador(nombre));
				System.out.println("Es apto el equipo para jugar = " + e.esAptoParaJugar());
			
			}
			
			System.out.println("Los equipos son iguales: " + lista1.equiposIguales(lista2));
			 
			
			
		}
		
		public static void pedirDatos(Equipo equipo) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca nombre de la lista: ");
			equipo.nombre = sc.nextLine();
			System.out.println("cuantos jugadores quiere añadir a su lista: ");
			int cantJugadores = sc.nextInt();
			sc.nextLine();
			String[] listaJugadores = new String[cantJugadores];
			
			for(int i = 0; i< cantJugadores; i++) {
				System.out.println("Ingrese jugador: ");
				listaJugadores[i] = sc.nextLine();
			}
		
			equipo.jugadores = listaJugadores;
			
		}
		
	
	
}
