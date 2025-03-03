package CLASES;

import java.util.Scanner;
import java.util.Random;

public class Juego {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println(Colores.VERDE +" ______  _________ _______  _                 _______  _       _________ ______   _______ \r\n"
				+ "(  ___ \\ \\__   __/(  ____ \\( (    /||\\     /|(  ____ \\( (    /|\\__   __/(  __  \\ (  ___  )\r\n"
				+ "| (   ) )   ) (   | (    \\/|  \\  ( || )   ( || (    \\/|  \\  ( |   ) (   | (  \\  )| (   ) |\r\n"
				+ "| (__/ /    | |   | (__    |   \\ | || |   | || (__    |   \\ | |   | |   | |   ) || |   | |\r\n"
				+ "|  __ (     | |   |  __)   | (\\ \\) |( (   ) )|  __)   | (\\ \\) |   | |   | |   | || |   | |\r\n"
				+ "| (  \\ \\    | |   | (      | | \\   | \\ \\_/ / | (      | | \\   |   | |   | |   ) || |   | |\r\n"
				+ "| )___) )___) (___| (____/\\| )  \\  |  \\   /  | (____/\\| )  \\  |___) (___| (__/  )| (___) |\r\n"
				+ "|/ \\___/ \\_______/(_______/|/    )_)   \\_/   (_______/|/    )_)\\_______/(______/ (_______)\r\n"
				+ "                                                                                          "+ Colores.RESET);
		System.out.println("--------------------------------------");
		System.out.println("Eres un joven humano que siempre");
		System.out.println("ha sido excluido de los gremios");
		System.out.println("por tu debilidad, y eso tiene que cambiar.");
		System.out.println("Empiezas este camino de conseguir el ");
		System.out.println("nivel 10 para ser el mas respetado");
		System.out.println("lugar asique, para empezar:");
		System.out.println("--------------------------------------");
		System.out.println("Introduce el nombre de tu personaje:");
		System.out.println("--------------------------------------");
		String nombre = scanner.nextLine();
		Personaje personaje = new Personaje();

		System.out.println("--------------------------------------");
		System.out.println(Colores.AZUL + "Bienvenido " + nombre);
		System.out.println("Tu aventura acaba de comenzar..."+ Colores.RESET);
		System.out.println("--------------------------------------");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*
		 * Enemigo enemigo = new Enemigo(); enemigo.setVida(50);
		 * Combate.empezarBatalla(personaje, enemigo);
		 */
	
		String[] nombresFaciles = { "Slime", "Ogrete", "Esqueleto", "Sombrio" };
		int[][] atributosFaciles = { { 42, 12 }, { 70, 10 }, { 35, 15 }, { 60, 15 } };
		
		String[] nombresEnemigos = { "Goblin", "Orco", "Troll", "Zombie" };
		int[][] atributosEnemigos = { { 90, 32 }, { 130, 30 }, { 100, 25 }, { 115, 23 } };
		
		int huidasRestantes = 3;
		/*
		while (personaje.getNivel() < 10) {
			while (personaje.getNivel() < 5) {

				int indice = random.nextInt(nombresFaciles.length);
				Enemigo enemigo = new Enemigo(nombresFaciles[indice], atributosFaciles[indice][0],
						atributosFaciles[indice][1]);
				boolean victoria = Combate.empezarBatalla(personaje, enemigo, huidasRestantes);
				// !vitoria es lo mismo que victoria == false
				if (!victoria) {
					System.out.println("MORITE MALARAZA");
				}
			}
			int indice = random.nextInt(nombresEnemigos.length);
			Enemigo enemigo = new Enemigo(nombresEnemigos[indice], atributosEnemigos[indice][0],
					atributosEnemigos[indice][1]);
			boolean victoria = Combate.empezarBatalla(personaje, enemigo, huidasRestantes);
			
			if (!victoria) {
				System.out.println("MORITE MALARAZA");
			}

		}
		*/
		while (personaje.getNivel() < 10) {
            if (personaje.getNivel() < 5) {
                lucharContraEnemigo(personaje, nombresFaciles, atributosFaciles, random, huidasRestantes);
            } else {
                lucharContraEnemigo(personaje, nombresEnemigos, atributosEnemigos, random, huidasRestantes);
            }
        }

		System.out.println("Felicidades HAS ALCANZADO EL NIVEL 10, ");
		System.out.println("ahora todos te respetaran!");
		System.out.println("--------------------------------------");
		System.out.println("BUM, BUM,BUM");
		// Parando 1000 miliesgundos el hilo,
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
		System.out.println("O NO, QUE ES ESO, NO SERA...");
		System.out.println("--------------------------------------");
		System.out.println(Colores.ROJO + "WILLOW" + Colores.RESET + ", ERA CIERTA LA LEYENDA, ACABA CON EL");

		Enemigo jefeFinal = new Enemigo("Willow", 275, 70);
		huidasRestantes = 0;
		boolean victoria = Combate.empezarBatalla(personaje, jefeFinal, huidasRestantes);
		if (!victoria) {
			System.out.println("MORITE MALARAZA");
			System.out.println("Sera la proxima vez");
		}
		
		System.out.println("--------------------------------------");
		System.out.println("No puede ser acabaste con Willow, ");
		System.out.println("eres increible " + nombre + " espero poder\n contar mas contigo");
		System.out.println("--------------------------------------");
		System.out.println(Colores.VERDE +"_________          _______    _______  _        ______  \r\n"
				+ "\\__   __/|\\     /|(  ____ \\  (  ____ \\( (    /|(  __  \\ \r\n"
				+ "   ) (   | )   ( || (    \\/  | (    \\/|  \\  ( || (  \\  )\r\n"
				+ "   | |   | (___) || (__      | (__    |   \\ | || |   ) |\r\n"
				+ "   | |   |  ___  ||  __)     |  __)   | (\\ \\) || |   | |\r\n"
				+ "   | |   | (   ) || (        | (      | | \\   || |   ) |\r\n"
				+ "   | |   | )   ( || (____/\\  | (____/\\| )  \\  || (__/  )\r\n"
				+ "   )_(   |/     \\|(_______/  (_______/|/    )_)(______/ \r\n"
				+ ""+ Colores.RESET);
		

	}
	private static void lucharContraEnemigo(Personaje personaje, String[] nombres, int[][] atributos, Random random,
			int huidasRestantes) {
		int indice = random.nextInt(nombres.length);
		Enemigo enemigo = new Enemigo(nombres[indice], atributos[indice][0], atributos[indice][1]);
		//System.out.println("Te encuentras con un " + nombres[indice]);
		boolean victoria = Combate.empezarBatalla(personaje, enemigo, huidasRestantes);
		// !victoria es lo mismo que victoria == false
		if (!victoria) {
			System.out.println("Has sido derrotado...");
			System.exit(0); 
		}
	}

}
