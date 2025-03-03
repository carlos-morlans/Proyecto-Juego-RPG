package CLASES;

import java.util.*;

public class Personaje {

	// abrimos el scanner
	Scanner sc = new Scanner(System.in);

	// Variables - atributos del personaje
	public int vida = 100;
	public int daño = 20;
	public int nivel = 1;
	String nombre;
	public int huidas = 3;

	// constructor de la clase personaje
	public Personaje(int vida, int daño, int nivel, String nombre, int huidas) {
		this.vida = vida;
		this.daño = daño;
		this.nivel = nivel;
		this.nombre = nombre;
		this.huidas = huidas;
		
	}

	// constructor vacio por si hiciese falta
	public Personaje() {

	}

	
	public int getHuidas() {
		return huidas;
	}

	public void setHuidas(int huidas) {
		this.huidas= huidas;
	}

	public void restarHuidas(int huidas) {
		
	}
	
	// los siguientes metodos con return para actualizar la informacion del
	// personaje
	public int getVida() {
		return vida;
	}

	public int getAtaque() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getNivel() {
		return nivel;
	}

	public void recibirDaño(int dañoEnemigo) {
		vida -= dañoEnemigo;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public static void subirNivel(Personaje personaje) {
		// en las siguientes dos lineas estamos actualizando el valor del daño y de la
		// vida recogiendo el valor actual con get y sumandole 10 y 20 respectivamente
		// por nivel
		personaje.setDaño(personaje.getAtaque() + 10);
		personaje.setVida(personaje.getVida() + 20);
		personaje.setNivel(personaje.getNivel() + 1);

	}

	// metodo avanzar
	/*
	 * public void avanzar() { System.out.println("Avanzas una casilla");
	 * System.out.println("Oh no un monstruo, que quieres hacer: ");
	 * System.out.println(); // salto de linea como si fuese //n
	 * System.out.println("1.pelear: "); System.out.println("2.huir: "); int
	 * decision = sc.nextInt();
	 * 
	 * if (decision == 1) { System.out.println("Vamos alla!"); // de aqui pasas al
	 * metodo combate
	 * 
	 * } else { System.out.println("buena decision "); avanzar(); // para que se
	 * repita el metodo }
	 * 
	 * }
	 */

	public void stats(Personaje personaje) {

		System.out.println("Estadísticas del personaje:");
		System.out.println("Vida del personaje: " + personaje.getVida());
		System.out.println("Ataque del personaje: " + personaje.getAtaque());
		System.out.println("Nivel del personaje: " + personaje.getNivel());

	}

}
