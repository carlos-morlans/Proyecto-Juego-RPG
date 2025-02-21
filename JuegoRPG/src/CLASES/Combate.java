package CLASES;

import java.util.*;

class Combate {
	//este metodo empezo siendo void y paso a ser boolean para saber cuando acaba el juego
	public static boolean empezarBatalla(Personaje jugador, Enemigo enemigo, int huidasRestantes) {

		Scanner scanner = new Scanner(System.in);
		
		int turno = 1;
		
		System.out.println("--------------------------------------");
		System.out.println("Oh no un "+enemigo.getNombre()+", que quieres hacer: ");
		System.out.println("--------------------------------------");
		jugador.stats(jugador);
		System.out.println("--------------------------------------");
		enemigo.stats(enemigo);

		// mientras yo y el enemigo tengamos mas de 0 de vida seguimos en el bucle
		while (enemigo.getVida() > 0 && jugador.getVida() > 0) {
			System.out.println("--------------------------------------");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			System.out.println("1.pelear: ");
			System.out.println("2.huir: ");
			System.out.println();
			
			int decision = scanner.nextInt();
			
			System.out.println();
			
			if (decision == 1) {
				System.out.println("Turno " + turno++);
				pelear(jugador, enemigo);
			} 
			
			if(decision==2) {
				if(huidasRestantes>0) {
					System.out.println("Huiste del combate. Te quedan " + (huidasRestantes - 1) + " huidas.");
					return true;
				} else {
					System.out.println("No puedes rendirte mas, debes pelear como un hombre");
				}
				
			}
		}
		// ultima comprobacion de que sigues vive y pasas a otra ronda, y al devolver true demuestras que sigues vivo
		if(jugador.getVida()>0) {
			return true;
		}
		return false;
	}

	public static void pelear(Personaje jugador, Enemigo enemigo) {

		System.out.println("Empiezas tu!");
		enemigo.recibirDaño(jugador.getAtaque());
		System.out.println("Has hecho: " + jugador.getAtaque() + " puntos de daño");

		if (enemigo.getVida() <= 0) {

			System.out.println("Le quedan 0 puntos de vida");
			System.out.println("Muy bien, has derrotado al monstruo!");
			jugador.subirNivel(jugador);
			System.out.println("--------------------------------------");
			System.out.println(Colores.VERDE + "Subiste de nivel! Ahora eres nivel: "+ jugador.getNivel() + Colores.RESET);
			System.out.println("--------------------------------------");
			jugador.stats(jugador);
		} else {
			System.out.println("Al enemigo le quedan " + enemigo.getVida() + " puntos de vida");
			jugador.recibirDaño(enemigo.getAtaque());
			System.out.println("El enemigo te ha hecho: " + enemigo.getAtaque() + " de daño ");

			if (jugador.getVida() <= 0) {
				System.out.println("Eres un pringado has muerto");

			} else {
				System.out.println("Te quedan " + jugador.getVida() + " puntos de vida");
			}

		}

	}
	

	/*public static void huir(Personaje jugador, Enemigo enemigo) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Estas seguro que quieres huir?");
		System.out.println("1.Si ");
		System.out.println("2.No, puedo con el ");
		
		int huida = scanner.nextInt();
		
		if(huida==1) {
			
		} else {
			System.out.println("MUY BUENA ELECCIÓN, A POR EL!");
			System.out.println("--------------------------------------");
			pelear(jugador,enemigo);
		}
		
		*/
}
	
	
	
	
	
	

