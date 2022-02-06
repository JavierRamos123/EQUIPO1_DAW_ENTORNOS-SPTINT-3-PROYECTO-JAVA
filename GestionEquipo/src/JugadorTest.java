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
		String nombreJugador = "ANTONIO";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar jugador que su nombre tenga 20 caracteres
	 */
	@Test
	
	void testSetNombreJugadorValidoMaxCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JOSEANTONIODELALUCES";
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

	
	/**
	 * Guardar jugador con edad v�lida (mayor)
	 */
	@Test
	void testSetEdadValida() {
		Jugador jugador = new Jugador();
		int edadJugador = 20;
		jugador.setEdad(edadJugador);
		
		assertEquals(edadJugador, jugador.getEdad());
	}
	
	/**
	 * Guardar jugador con edad igual al limite
	 */
	@Test
	void testSetEdadValidaLimite() {
		Jugador jugador = new Jugador();
		int edadJugador = 18;
		jugador.setEdad(edadJugador);
		
		assertEquals(edadJugador , jugador.getEdad());
	}
	
	/**
	 * Guardar jugador con edad menor
	 */
	@Test
	void testSetEdadInvalidaMenor() {
		Jugador jugador = new Jugador();
		int edadJugador = 16;
		jugador.setEdad(edadJugador);
		
		assertEquals(-1 , jugador.getEdad());
	}
	
	/**
	 * Guardar jugador con campo vacio
	 */
	@Test
	void testSetEdadInvalidaVacio() {
		Jugador jugador = new Jugador();
		int edadJugador=-1;
		jugador.setEdad(edadJugador);
		
		assertEquals(-1 , jugador.getEdad());
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
	@Test
	void testSetIdiomaValido02() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Ingl�s";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(idiomaJugador, jugador.getIdioma());
	}
	/**
	 * Guardar jugador con idioma valido
	 */
	@Test
	void testSetIdiomaValido03() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Alem�n";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(idiomaJugador, jugador.getIdioma());
	}
	/**
	 * Guardar jugador con idioma valido
	 */
	@Test
	void testSetIdiomaValido04() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Franc�s";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(idiomaJugador, jugador.getIdioma());
	}
	
	/**
	 * Guardar jugador con idioma invalido
	 */
	@Test
	void testSetIdiomaInvalido() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "Turco";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(null, jugador.getIdioma());
	}
	
	/**
	 * Guardar jugador con idioma vacio
	 */
	@Test
	void testSetIdiomaInvalidoVacio() {
		Jugador jugador = new Jugador();
		String idiomaJugador = "";
		jugador.setIdioma(idiomaJugador);
		
		assertEquals(null, jugador.getIdioma());
	}



	// Tests para TipoJugador
	
	@Test
	void testTipoJugadorJunior01() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 18;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		assertEquals("Junior" , jugador.tipoJugador());
	}
	
	@Test
	void testTipoJugadorJunior02() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 20;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		assertEquals("Junior" , jugador.tipoJugador());
	}
	@Test
	void testTipoJugadorJunior03() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 25;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		assertEquals("Junior" , jugador.tipoJugador());
	}
	@Test
	void testTipoJugadorSenior01() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 26;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		assertEquals("Senior" , jugador.tipoJugador());
	}
	
	@Test
	void testTipoJugadorSenior02() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 30;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		assertEquals("Senior" , jugador.tipoJugador());
	}
	@Test
	void testTipoJugadorSenior03() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 35;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		assertEquals("Senior" , jugador.tipoJugador());
	}
	@Test
	void testTipoJugadorMaster01() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 36;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		assertEquals("Master" , jugador.tipoJugador());
	}
	
	
}
