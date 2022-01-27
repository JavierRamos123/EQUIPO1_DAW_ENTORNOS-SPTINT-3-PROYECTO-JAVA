import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {
    
	/*Asignar jugador que exista y tenga todos los campos válidos*/
	@Test
	void testSetJugadorValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadJugador = 20;
		String idiomaJugador = "Español";
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
	
	void testSetJugadorInvalidoJugadorNulo() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos nulos*/
		Jugador jugador = new Jugador();
		String nombreJugador = null;
		int edadJugador = (Integer) null;
		String idiomaJugador = null;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals((Integer) null, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorInvalidoNombre01() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio777";
		int edadJugador = 20;
		String idiomaJugador = "Español";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadJugador, jugadorGuardado.getEdad());
		assertEquals(idiomaJugador, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorInvalidoNombre02() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos y sin el campo de nombre*/
		Jugador jugador = new Jugador();
		int edadJugador = 20;
		String idiomaJugador = "Español";
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadJugador, jugadorGuardado.getEdad());
		assertEquals(idiomaJugador, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorInvalidoEdad01() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos menos la edad*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadJugador = 0;
		String idiomaJugador = "Español";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertEquals(nombreJugador, jugadorGuardado.getNombreJugador());
		assertEquals((Integer) null, jugadorGuardado.getEdad());
		assertEquals(idiomaJugador, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorInvalidoEdad02() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos pero sin edad*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		String idiomaJugador = "Español";
		jugador.setNombreJugador(nombreJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertEquals(nombreJugador, jugadorGuardado.getNombreJugador());
		assertEquals((Integer) null, jugadorGuardado.getEdad());
		assertEquals(idiomaJugador, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorInvalidoIdioma01() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos menos el idioma*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadJugador = 20;
		String idiomaJugador = "Macedonio";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertEquals(nombreJugador, jugadorGuardado.getNombreJugador());
		assertEquals(edadJugador, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorInvalidoIdioma02() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos pero sin idioma*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadJugador = 20;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertEquals(nombreJugador, jugadorGuardado.getNombreJugador());
		assertEquals(edadJugador, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	void testSetEquipoValido() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un equipo con todos los campos válidos*/
		Equipo equipo = new Equipo();
		String nombrevalido = "Real Madrid F.C.";
		int rankingvalido = 1;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingvalido);
		
		Equipo equipoGuardado = asignarJugador.getEquipo();
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido, equipoGuardado.getNombreEquipo());
		assertEquals(rankingvalido, equipoGuardado.getRanking());
	}

	void testSetEquipoInvalidoNombre01() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos menos el nombre*/
		Equipo equipo = new Equipo();
		String nombreEquipo = "Les Carpinches777";
		int rankingEquipo = 2;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(rankingEquipo);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo(); 
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingEquipo, equipoGuardado.getRanking());
	}
	
	void testSetEquipoInvalidoNombre02() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con el campo de ranking válido sin nombre*/
		Equipo equipo = new Equipo();
		int rankingEquipo = 2;
		equipo.setRanking(rankingEquipo);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo(); 
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingEquipo, equipoGuardado.getRanking());
	}
	
	void testSetEquipoInvalidoRanking01() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con el campo de nombre válido y el ranking inválido*/
		Equipo equipo = new Equipo();
		String nombreEquipo = "Les Carpinches";
		int rankingEquipo = 80;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(rankingEquipo);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo(); 
		assertEquals(nombreEquipo, equipoGuardado.getNombreEquipo());
		assertEquals((Integer) null, equipoGuardado.getRanking());
	}

	void testSetEquipoInvalidoRanking02() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un jugador con el campo de nombre válido sin campo de ranking*/
		Equipo equipo = new Equipo();
		String nombreEquipo = "Les Carpinches";
		equipo.setNombreEquipo(nombreEquipo);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarJugador.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarJugador.getEquipo(); 
		assertEquals(nombreEquipo, equipoGuardado.getNombreEquipo());
		assertEquals((Integer) null, equipoGuardado.getRanking());
	}
}
