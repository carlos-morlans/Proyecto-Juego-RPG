package CLASES;

import java.util.Random;

public class Enemigo {

	// primero creo los atributos
	
	String nombre;
	int vida;
	int ataque;

	
	
	// constructor
	public Enemigo(String nombre, int vida, int ataque) {
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
	}

	public Enemigo() {

	}

	public int getVida() {
		return vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int ataque() {
		return ataque;
	}

	public void recibirDaño(int dañoPersonaje) {
		vida -= dañoPersonaje;
	}

	public void stats(Enemigo enemigo) {
		
		System.out.println("Estadisticas del enemigo:");
		System.out.println("Vida del enemigo: " + enemigo.getVida());
		System.out.println("Ataque del enemigo: " + enemigo.getAtaque());
		

	}
}
