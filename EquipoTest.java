import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Equipo1DAW
 *
 */

public class EquipoTest {
	
	/**
	 * Guardar equipo que su nombre sea menor de 20 caracteres
	 */
	@Test
	//El campo nombre del equipo contiene menos de 20 caracteres
	void testSetNombreEquipoValido01() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Real Madrid F.C.";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}
	//El campo nombre del equipo contiene justo 20 caracteres
	void testSetNombreEquipoValido02() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Chargoggagoggmanchau";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}
	
	//Este campo es inválido por que supera el mínimo de carácteres
	void testSetNombreEquipoInvalido01() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "djhuighuidgfhihdgzfhjojuju";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(null, equipo.getNombreEquipo());
	}
	//El campo nombre del equipo contiene números o caracteres especiales
	void testSetNombreEquipoInvalido02() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "hjdbhv7hgfjfh_uiuihju";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(null, equipo.getNombreEquipo());
	}
	//El nombre del equipo no tiene contenido
	void testSetNombreEquipoVacio01() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(null, equipo.getNombreEquipo());
	}
	//El campo Ranking es un número mayor que 0 y menor que 10
	void testSetRankingEquipoValido01() {
		Equipo ranking = new Equipo();
		int rankingEquipo = 5;
		ranking.setRanking(0);
		
		assertEquals(rankingEquipo,ranking.getRanking());
	
	}
	//El campo ranking es igual a 0
	void testSetRankingEquipoValido02() {
		Equipo ranking = new Equipo();
		int rankingEquipo = 0;
		ranking.setRanking(0);
		
		assertEquals(rankingEquipo,ranking.getRanking());
	
	}
	//El campo Ranking es igual a 10
	void testSetRankingEquipoValido03() {
		Equipo ranking = new Equipo();
		int rankingEquipo = 10;
		ranking.setRanking(0);
		
		assertEquals(rankingEquipo,ranking.getRanking());
	
	}
	//El campo Ranking contiene un caracter no numérico
	void testSetRankingEquipoInvalido01() {
		Equipo ranking = new Equipo();
		String rankingEquipo = "nueve";
		ranking.setRanking(0);
		
		assertEquals((Integer)null, ranking.getRanking());
	
	}
	//El campo Ranking contiene un número menor que 0
	void testSetRankingEquipoInvalido02() {
		Equipo ranking = new Equipo();
		int rankingEquipo = -25;
		ranking.setRanking(0);
		
		assertEquals((Integer)null, ranking.getRanking());
	
	}
	//El campo Ranking contiene un número mayor que 10
	void testSetRankingEquipoInvalido03() {
		Equipo ranking = new Equipo();
		int rankingEquipo = 16;
		ranking.setRanking(0);
		
		assertEquals((Integer)null, ranking.getRanking());
	
	}
	//El campo Ranking está vacío
	void testSetRankingEquipoVacio01() {
		Equipo ranking = new Equipo();
		int rankingEquipo = ' ';
		ranking.setRanking(0);
		
		assertEquals((Integer)null, ranking.getRanking());
	
	}
	
	
	
}
