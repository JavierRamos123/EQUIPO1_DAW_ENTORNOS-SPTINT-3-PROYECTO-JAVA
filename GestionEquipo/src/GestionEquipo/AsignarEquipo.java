package gestionequipo;

public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;

	public AsignarEquipo() {

	}

	public void setEquipo(Equipo equipo) {
		this.equipo = null;
		if (equipo.getNombreEquipo() != null && equipo.getRanking() != -1) {
			this.equipo = equipo;
		}
	}

	public void setJugador(Jugador jugador) {
		if (jugador == null) {
			this.jugador = null;
		} else {
			if (esValido()) {
				this.jugador = jugador;
			} else {
				this.jugador = null;
			}
		}

	}

	public boolean esValido() {
		int enteroNull = -1;
		boolean valido = false;
		if (jugador.getNombreJugador() != null && jugador.getEdad() != enteroNull && jugador.getIdioma() != null) {
			valido = true;
		}
		return valido;

	}

	public Equipo getEquipo() {
		return equipo;
	}

	public Jugador getJugador() {
		return jugador;
	}

}
