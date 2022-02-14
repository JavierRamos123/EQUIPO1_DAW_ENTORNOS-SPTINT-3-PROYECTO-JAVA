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

	     * M�todo que sirve para asignarle un nombre a un Equipo
	     * @param nombreEquipo El par�metro nombreEquipo define el nombre del Equipo

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

    * M�todo que sirve para asignarle El Ranking a un Equipo
    * @param ranking El par�metro ranking define la  posicion del equipo

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

     * M�todo que sirve para devolver el nombre del Equipo
     * @param nombreEquipo El par�metro nombreEquipo define el nombre del Equipo

     */
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	//Cierre del metodo
		 /**

	     * M�todo que sirve para devolver el ranking del Equipo
	     * @param ranking El par�metro ranking define el ranking del Equipo

	     */
	public int getRanking() {
		return ranking;
	}
	 /**

	    * M�todo que sirve para  asignar la categoria a un Equipo
	    * @param categoria El par�metro categoria define la  categoria del Equipo

	    */

	public String categoriaEquipo() {
		String categoria = null;
		int rankingPrimeroMin = 7;
		int rankingPrimeroMax = 10;
		int rankingSegundoMin = 3;
		int rankingSegundoMax = 6;
		int rankingTerceroMin = 3;

		if (esValidoEquipo()) {
			if(this.ranking>= rankingPrimeroMin && this.ranking<=rankingPrimeroMax) {
				categoria = "Primera";
			}else if(this.ranking>=rankingSegundoMin && this.ranking<=rankingSegundoMax) {
				categoria = "Segunda";
			}else if(this.ranking<rankingTerceroMin) {
				categoria = "Tercera";
			}
		}	//Cierre del metodo
		return categoria;
		 /**

		    * Metodo que sirve para  comprobar la validez   de nombreEquipo y ranking
		    * @param valido El parametro  valido comprueba si nombreEquipo y ranking son validos

		    */

	}
	public boolean esValidoEquipo() {
        int enteroNull=-1;
        boolean valido=false;
        if (nombreEquipo != null && ranking!= enteroNull ) {
            valido = true;
        }
        return valido;

    }//Cierre del metodo
}
