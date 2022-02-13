package gestionequipo;

public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador() {

	}

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

	public void setEdad(int edad) {
		int edadMin = 18;
		int enteroNull = -1;

		if (edad >= edadMin) {
		} else {
			edad = enteroNull;
		}
		this.edad = edad;
	}

	public void setIdioma(String idioma) {

		this.idioma = null;
		if (idioma != null) {
			if (idioma.equalsIgnoreCase("espanol") || idioma.equalsIgnoreCase("frances")
					|| idioma.equalsIgnoreCase("aleman") || idioma.equalsIgnoreCase("ingles")) {
				this.idioma = idioma;
			}
		}

	}

	public String tipoJugador() {
		int edadJuniorMin = 18;
		int edadJuniorMax = 25;
		int edadSeniorMin = 26;
		int edadSeniorMax = 35;
		int edadMasterMin = 36;
		int edadMasterMax = 99;
		int edadSuperMasterMin = 100;
		String categoria = null;

		if (esValido()) {
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

	public boolean esValido() {
		int enteroNull = -1;
		boolean valido = false;
		if (nombre != null && edad != enteroNull && idioma != null) {
			valido = true;
		}
		return valido;

	}

	public String getIdioma() {
		return idioma;
	}

	public String getNombreJugador() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

}
