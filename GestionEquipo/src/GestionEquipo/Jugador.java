package GestionEquipo;

public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador() {

	}

	public void setNombreJugador(String nombre) {
		boolean esNulo = false;
		int caracterMax = 20;
		int valorInicial = 0;
		int enteroNull = -1;

		if (nombre == null) {
			this.nombre = null;
		} else {
			nombre=nombre.toUpperCase();
			if (nombre.isEmpty()) {
				esNulo = true;
			}
			if (nombre.length() > caracterMax) {
				esNulo = true;
			}
			for (int i = valorInicial; i <= nombre.length()+enteroNull; i++) {
				char letra = nombre.charAt(i);
				if (!Character.isLetter(letra) && letra != 32) {
					esNulo = true;
				}
			}
			if (esNulo) {
				nombre = null;
			}
			this.nombre = nombre;
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
		if (idioma == null) {
			this.idioma = null;
		} else {
			if (idioma.equalsIgnoreCase("espanol") || idioma.equalsIgnoreCase("frances")
					|| idioma.equalsIgnoreCase("aleman") || idioma.equalsIgnoreCase("ingles")) {

			} else {
				idioma = null;
			}
			this.idioma = idioma;
		}

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

	public String tipoJugador() {
		int enteroNull = -1;
		int edadJuniorMin = 18;
		int edadJuniorMax = 25;
		int edadSeniorMin = 26;
		int edadSeniorMax = 35;
		int edadMasterMin = 36;
		int edadMasterMax = 99;
		int edadSuperMasterMin = 100;

		if (nombre != null && edad != enteroNull && idioma != null) {
			if(this.edad>=edadJuniorMin && this.edad<=edadJuniorMax) {
				return "Junior";
			}else if(this.edad>=edadSeniorMin && this.edad<=edadSeniorMax) {
				return "Senior";
			}else if(this.edad>=edadMasterMin && this.edad<=edadMasterMax) {
				return "Master";
			}else if(this.edad>=edadSuperMasterMin){
				return "Super Master";
			}
		}
		return null;
	}
}
