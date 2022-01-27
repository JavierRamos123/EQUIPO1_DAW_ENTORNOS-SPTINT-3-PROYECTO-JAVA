import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Equipo1DAW
 *
 */


class JugadorTest {
	


	/**
	 * Guardar jugador que su nombre sea menor de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar jugador que su nombre tenga 20 caracteres
	 */
	@Test
	
	void testSetNombreJugadorValidoMaxCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JoseAntonioDeLaLuces";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
		
	}
	
	/**
	 * Guardar jugador que su nombre tenga mas de 20 caracteres
	 */
	@Test
	
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}
	
	/**
	 * Guardar jugador que su nombre contenga caracteres numericos
	 */
	@Test
	
	void testSetNombreJugadorInvalidoCaracteresNum() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Manolito69";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}
	
	/**
	 * Guardar jugador que su nombre este vacio
	 */
	@Test
	
	void testSetNombreJugadorInvalidoVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}
	

	/**
	 * Test method for {@link Jugador#setEdad(int)}.
	 */
	@Test
	
	/**
	 * Guardar jugador con edad v�lida (mayor)
	 */
	void testSetEdadValida() {
		Jugador jugador = new Jugador();
		int edadJugador = 20;
		jugador.setEdad(edadJugador);
		
		assertEquals(edadJugador, jugador.getEdad());
	}
	
	/**
	 * Guardar jugador con edad igual al limite
	 */
	void testSetEdadValidaLimite() {
		Jugador jugador = new Jugador();
		int edadJugador = 18;
		jugador.setEdad(edadJugador);
		
		assertEquals(edadJugador , jugador.getEdad());
	}
	
	/**
	 * Guardar jugador con edad menor
	 */
	void testSetEdadInvalidaMenor() {
		Jugador jugador = new Jugador();
		int edadJugador = 16;
		jugador.setEdad(edadJugador);
		
		assertEquals(0 , jugador.getEdad());
	}
	
	/**
	 * Guardar jugador con campo vacio
	 */
	void testSetEdadInvalidaVacio() {
		Jugador jugador = new Jugador();
		int edadJugador = (Integer) null;
		jugador.setEdad(edadJugador);
		
		assertEquals(0 , jugador.getEdad());
	}
	


	/**
	 * Test method for {@link Jugador#setIdioma(java.lang.String)}.
	 */
	
	
	@Test
	/**
	 * Guardar jugador con idioma valido
	 */
	void testSetIdiomaValido01() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Espa�ol";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(idiomaJugador, jugador.getIdioma());
	}
	/**
	 * Guardar jugador con idioma valido
	 */
	void testSetIdiomaValido02() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Ingl�s";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(idiomaJugador, jugador.getIdioma());
	}
	/**
	 * Guardar jugador con idioma valido
	 */
	void testSetIdiomaValido03() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Alem�n";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(idiomaJugador, jugador.getIdioma());
	}
	/**
	 * Guardar jugador con idioma valido
	 */
	void testSetIdiomaValido04() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Franc�s";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(idiomaJugador, jugador.getIdioma());
	}
	
	/**
	 * Guardar jugador con idioma invalido
	 */
	void testSetIdiomaInvalido() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Turco";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(null, jugador.getIdioma());
	}
	
	/**
	 * Guardar jugador con idioma vacio
	 */
	void testSetIdiomaInvalidoVacio() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(null, jugador.getIdioma());
	}
	


}
