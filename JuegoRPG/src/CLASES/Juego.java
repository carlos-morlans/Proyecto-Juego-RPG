package CLASES;

import java.util.Scanner;
import java.util.Random;

public class Juego {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Introduce el nombre de tu personaje:");
		String nombre = scanner.nextLine();
		Personaje personaje = new Personaje();

		System.out.println("Comienza tu aventura...");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*
		 * Enemigo enemigo = new Enemigo(); enemigo.setVida(50);
		 * Combate.empezarBatalla(personaje, enemigo);
		 */

		String[] nombresFaciles = { "G", "O", "T", "Z" };
		int[][] atributosFaciles = { { 50, 10 }, { 70, 15 }, { 40, 8 }, { 60, 12 } };
		
		String[] nombresEnemigos = { "Goblin", "Orco", "Troll", "Zombie" };
		int[][] atributosEnemigos = { { 50, 10 }, { 70, 15 }, { 40, 8 }, { 60, 12 } };
		int huidasRestantes = 3;
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
			// !vitoria es lo mismo que victoria == false
			if (!victoria) {
				System.out.println("MORITE MALARAZA");
			}

		}
		System.out.println("Felicidades HAS ALCANZADO EL NIVEL 10, eres todo un PRO");
		System.out.println("--------------------------------------");
		System.out.println("BUM, BUM,BUM");
		// Parando 1000 miliesgundo el hilo,
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
		System.out.println("O NO, QUE ES ESO, NO SERA...");
		System.out.println("--------------------------------------");
		System.out.println(Colores.ROJO + "WILLOW" + Colores.RESET + ", ERA CIERTA LA LEYENDA, ACABA CON EL");

		Enemigo jefeFinal = new Enemigo("Willow", 350, 75);
		huidasRestantes = 0;
		boolean victoria = Combate.empezarBatalla(personaje, jefeFinal, huidasRestantes);
		if (!victoria) {
			System.out.println("MORITE MALARAZA");
		}
		System.out.println("THE END");

	}

}
