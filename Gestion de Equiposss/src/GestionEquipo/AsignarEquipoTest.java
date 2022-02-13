package gestionequipo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {
    
	/*Asignar jugador que exista y tenga todos los campos v�lidos*/
	@Test
	void testSetJugadorValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		int edadJugador = 20;
		String idiomaJugador = "Espanol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombreJugador, jugadorGuardado.getNombreJugador());
		assertEquals(edadJugador, jugadorGuardado.getEdad());
		assertEquals(idiomaJugador, jugadorGuardado.getIdioma());
	}
	@Test
	void testSetJugadorInvalidoJugadorNulo() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos nulos*/
		Jugador jugador = new Jugador();
		String nombreJugador = null;
		int edadJugador = -1;
		String idiomaJugador = null;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
	}
	@Test
	void testSetJugadorInvalidoNombre01() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio777";
		int edadJugador = 20;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
	}
	@Test
	void testSetJugadorInvalidoNombre02() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos y sin el campo de nombre*/
		Jugador jugador = new Jugador();
		int edadJugador = 20;
		String idiomaJugador = "Espa�ol";
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
	}
	@Test
	void testSetJugadorInvalidoEdad01() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos menos la edad*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadJugador = 0;
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
	}
	@Test
	void testSetJugadorInvalidoEdad02() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos pero sin edad*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		String idiomaJugador = "Espa�ol";
		jugador.setNombreJugador(nombreJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
	}
	@Test
	void testSetJugadorInvalidoIdioma01() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos menos el idioma*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadJugador = 20;
		String idiomaJugador = "Macedonio";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
	}
	@Test
	void testSetJugadorInvalidoIdioma02() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos pero sin idioma*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadJugador = 20;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
	}
	
	@Test
	void testSetJugadorVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Jugador jugador = null;
		// No hacemos set de nada porque es nulo el jugador
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getEquipo());
		
	}
	
	@Test
	void testSetEquipoValido() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un equipo con todos los campos v�lidos*/
		Equipo equipo = new Equipo();
		String nombrevalido = "REALMADRIDFC";
		int rankingvalido = 1;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingvalido);
		
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo();
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido, equipoGuardado.getNombreEquipo());
		assertEquals(rankingvalido, equipoGuardado.getRanking());
	}
	@Test
	void testSetEquipoInvalidoNombre01() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos menos el nombre*/
		Equipo equipo = new Equipo();
		String nombreEquipo = "Les Carpinches777";
		int rankingEquipo = 2;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(rankingEquipo);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo();

		assertNull(equipoGuardado);
	}
	@Test
	void testSetEquipoInvalidoNombre02() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con el campo de ranking v�lido sin nombre*/
		Equipo equipo = new Equipo();
		int rankingEquipo = 2;
		equipo.setRanking(rankingEquipo);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo();

		assertNull(equipoGuardado);
	}
	@Test
	void testSetEquipoInvalidoRanking01() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con el campo de nombre v�lido y el ranking inv�lido*/
		Equipo equipo = new Equipo();
		String nombreEquipo = "Les Carpinches";
		int rankingEquipo = 80;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(rankingEquipo);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo(); 

		assertNull(equipoGuardado);
	}
	@Test
	void testSetEquipoInvalidoRanking02() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con el campo de nombre v�lido sin campo de ranking*/
		Equipo equipo = new Equipo();
		String nombreEquipo = "Les Carpinches";
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(-1);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo();

		assertNull(equipoGuardado);
	}
}
