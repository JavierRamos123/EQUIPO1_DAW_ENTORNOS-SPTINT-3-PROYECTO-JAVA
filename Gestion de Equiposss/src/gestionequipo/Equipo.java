
package gestionequipo;
/**
 * Esta clase define Equipos
 * @author: Equipo1DAW
 * @version 13/02/2022/A
 */
public class Equipo {
	// Atributos de la clase
	private String nombreEquipo;
	private int ranking;
	   /**
     * Constructor para la serie Equipo
     */
	public Equipo() {
	}
	//Cierre del constructor
	
		 /**

	     * Método que sirve para asignarle un nombre a un Equipo
	     * @param nombreEquipo El parámetro nombreEquipo define el nombre del Equipo

	     */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = null;
        if(nombreEquipo != null) {
            if (nombreEquipo.length()>=4 && nombreEquipo.length()<=20) {
                if (nombreEquipo.matches("[a-zA-Z]+")){       
                    this.nombreEquipo=nombreEquipo.toUpperCase();
                }
            }
        }
	}//Cierre del metodo
	
	 /**

    * Método que sirve para asignarle El Ranking a un Equipo
    * @param ranking El parámetro ranking define la  posicion del equipo

    */

	

	public void setRanking(int ranking) {
		int enteroNull = -1;
		int valorMin = 0;
		int valorMax = 10;
		if(ranking>=valorMin && ranking<=valorMax) {
		}else {
			ranking=enteroNull;
		}
		this.ranking = ranking;
	}//Cierre del metodo
	 /**

     * Método que sirve para devolver el nombre del Equipo
     * @param nombreEquipo El parámetro nombreEquipo define el nombre del Equipo

     */
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	//Cierre del metodo
		 /**

	     * Método que sirve para devolver el ranking del Equipo
	     * @param ranking El parámetro ranking define el ranking del Equipo

	     */
	public int getRanking() {
		return ranking;
	}
	 /**

	    * Método que sirve para  asignar la categoria a un Equipo
	    * @param categoria El parámetro categoria define la  categoria del Equipo

	    */

	public String categoriaEquipo() {
		String categoria = null;
		int rankingPrimeroMin = 7;
		int rankingPrimeroMax = 10;
		int rankingSegundoMin = 3;
		int rankingSegundoMax = 6;
		int rankingTerceroMin = 3;

		if (esValido()) {
			if(this.ranking>= rankingPrimeroMin && this.ranking<=rankingPrimeroMax) {
				categoria = "Primera";
			}else if(this.ranking>=rankingSegundoMin && this.ranking<=rankingSegundoMax) {
				categoria = "Segunda";
			}else if(this.ranking<rankingTerceroMin) {
				categoria = "Tercera";
			}
		}
		return categoria;

	}//Cierre del metodo
	 /**

	    * Método que sirve para  comprobar la validez del  nombre del Equipo y ranking
	    * @param valido El parámetro valido define la  categoria del Equipo

	    */

	public boolean esValido() {
        int enteroNull=-1;
        boolean valido=false;
        if (nombreEquipo != null && ranking!= enteroNull ) {
            valido = true;
        }
        return valido;

    }//Cierre del metodo
}
