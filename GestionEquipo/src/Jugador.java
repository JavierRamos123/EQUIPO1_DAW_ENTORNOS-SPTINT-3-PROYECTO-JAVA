
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador() {

	}

	public void setNombreJugador(String nombre) {
		boolean esNulo = false;
		if (nombre == null) {
			this.nombre = null;
		} else {
			nombre=nombre.toUpperCase();
			if (nombre.isEmpty()) {
				esNulo = true;
			}
			if (nombre.length() > 20) {
				esNulo = true;
			}
			for (int i = 0; i <= nombre.length() - 1; i++) {
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
		if (edad >= 18) {
		} else {
			edad = -1;
		}
		this.edad = edad;
	}

	public void setIdioma(String idioma) {
		if (idioma == null) {
			this.idioma = null;
		} else {
			if (idioma.equalsIgnoreCase("español") || idioma.equalsIgnoreCase("francés")
					|| idioma.equalsIgnoreCase("alemán") || idioma.equalsIgnoreCase("inglés")) {

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
		if (nombre != null && edad != -1 && idioma != null) {
			if(this.edad>=18 && this.edad<=25) {
				return "Junior";
			}else if(this.edad>=26 && this.edad<=35) {
				return "Senior";
			}else if(this.edad>=36 && this.edad<=99) {
				return "Master";
			}else if(this.edad>=100){
				return "Super Master";
			}
		}
		return null;
	}
}
