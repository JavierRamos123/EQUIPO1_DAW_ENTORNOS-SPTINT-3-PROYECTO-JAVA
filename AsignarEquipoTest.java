import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {
    
	/*Asignar jugador que exista y tenga todos los campos válidos*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
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

	void testSetEquipoInvalido01() {
		AsignarEquipo asignarJugador = new AsignarEquipo();
		/*Creamos un equipo con todos los campos válidos*/
		Equipo equipo = new Equipo();
		String nombreJugadorInvalido = "Antonio33";
		String nombreEquipoInvalido = "Pepito los Limones";
		int rankingvalido = 1;
		equipo.setNombreEquipo(nombreEquipoInvalido);
		equipo.setRanking(rankingvalido);
		
		Equipo equipoGuardado = asignarJugador.getEquipo();
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingvalido, equipoGuardado.getRanking());
	}
	

}
