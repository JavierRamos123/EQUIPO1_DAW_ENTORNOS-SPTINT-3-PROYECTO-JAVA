package gestionequipo;

/**
 * 
 * Esta clase asigna los jugadores de la clase Jugador con los equipos de la
 * clase Equipo.
 * 
 * @author: Equipo 1 DAW.
 * 
 * @version: 13/02/2022/A
 * 
 */

public class AsignarEquipo {

	// Campos de la clase
	private Equipo equipo;
	private Jugador jugador;

	/**
	 * 
	 * Constructor para AsignarEquipo.
	 * 
	 */

	public AsignarEquipo() {

	} // Cierre del constructor

	/**
	 * 
	 * M�todo que asigna un equipo si sus par�metros son v�lidos.
	 * 
	 * 
	 * @param equipo define el equipo que queremos asignar.
	 * 
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = null;
		if (equipo.esValidoEquipo()) {
			this.equipo = equipo;
		}
	}

	/**
	 * 
	 * M�todo que asigna un jugador si sus par�metros son v�lidos.
	 * 
	 * 
	 * @param jugador define el jugador que queremos asignar.
	 * 
	 */
	public void setJugador(Jugador jugador) {
		if (jugador == null) {
			this.jugador = null;
		} else {
			if (jugador.esValidoJugador()) {
				this.jugador = jugador;
			} else {
				this.jugador = null;
			}
		}

	}


	/**
	 * 
	 * M�todo que devuelve un equipo.
	 * 
	 * 
	 * @return un equipo.
	 * 
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * 
	 * M�todo que devuelve un jugador.
	 * 
	 * 
	 * @return un jugador.
	 * 
	 */
	public Jugador getJugador() {
		return jugador;
	}

}