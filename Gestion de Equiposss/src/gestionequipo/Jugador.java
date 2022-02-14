package gestionequipo;
import gestionequipo.AsignarEquipo;


 /**
 * Esta clase define jugadores 
 * @author: Equipo1DAW
 * @version 13/02/2022/A
 */



public class Jugador {
	// Atributos de la clase
	private String nombre;
	private int edad;
	private String idioma;
	
    /**
     * Constructor para la serie Jugador
     */

	public Jugador() {

	}
	//Cierre del constructor
	
	/**

    * Método que sirve para asignarle un nombre a un jugador
    * @param nombre El parámetro nombre define el nombre del jugador

    */

	public void setNombreJugador(String nombre) {
		int caracterMax = 20;

		this.nombre = null;
		if (nombre != null) {
			if (nombre.length() <= caracterMax) {
				if (nombre.matches("[a-zA-Z]+")) {
					this.nombre = nombre.toUpperCase();
				}
			}
		}
	}
	//Cierre del metodo
	
	/**

    * Método que sirve para asignarle una edad a un jugador
    * @param edad El parámetro edad define la edad del jugador

    */

	public void setEdad(int edad) {
		int edadMin = 18;
		int enteroNull = -1;

		if (edad < edadMin) {
			edad=enteroNull;
		}
		this.edad = edad;
	}
	//Cierre del metodo
	
	/**

    * Método que sirve para asignarle un idioma a un jugador
    * @param idioma El parámetro idioma define el idioma del jugador

    */

	public void setIdioma(String idioma) {

		this.idioma = null;
		if (idioma != null) {
			if (idioma.equalsIgnoreCase("espanol") || idioma.equalsIgnoreCase("frances")
					|| idioma.equalsIgnoreCase("aleman") || idioma.equalsIgnoreCase("ingles")) {
				this.idioma = idioma;
			}
		}

	}
	//Cierre del metodo
	
	/**

    * Método que sirve para obtener la categoria del jugador a partir de la edad del jugador
	* @return La categoria a la que pertenece el jugador

    */

	public String tipoJugador() {
		int edadJuniorMin = 18;
		int edadJuniorMax = 25;
		int edadSeniorMin = 26;
		int edadSeniorMax = 35;
		int edadMasterMin = 36;
		int edadMasterMax = 99;
		int edadSuperMasterMin = 100;
		String categoria = null;

		if (esValidoJugador()) {
			if (this.edad >= edadJuniorMin && this.edad <= edadJuniorMax) {
				categoria = "Junior";
			} else if (this.edad >= edadSeniorMin && this.edad <= edadSeniorMax) {
				categoria = "Senior";
			} else if (this.edad >= edadMasterMin && this.edad <= edadMasterMax) {
				categoria = "Master";
			} else if (this.edad >= edadSuperMasterMin) {
				categoria = "Super Master";
			}
		}
		return categoria;
	}
	//Cierre del metodo

	
	
	/**

    * Método que sirve para obtener la validez de un jugador
	* @return Un boolean que define si el jugador es valido 

    */
	
	
	public boolean esValidoJugador() {
		int enteroNull = -1;
		boolean valido = false;
		if (nombre != null && edad != enteroNull && idioma != null) {
			valido = true;
		}
		return valido;

	}
	//Cierre del metodo
	
	/**

    * Método que devuelve el idioma del jugador
	* @return Un string que define el idioma del jugador

    */

	public String getIdioma() {
		return idioma;
	}
	
	//Cierre del metodo
	
	/**

    * Método que devuelve el nombre del jugador
	* @return Un string que define el nombre del jugador

    */


	public String getNombreJugador() {
		return nombre;
	}
	//Cierre del metodo
	

	/**

    * Método que devuelve la edad del jugador
	* @return Un int que define la edad del jugador

    */

	public int getEdad() {
		return edad;
	}
	//Cierre del metodo

}
