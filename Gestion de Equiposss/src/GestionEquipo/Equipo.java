package gestionequipo;


public class Equipo {
	private String nombreEquipo;
	private int ranking;

	public Equipo() {
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = null;
        if(nombreEquipo != null) {
            if (nombreEquipo.length()>=4 && nombreEquipo.length()<=20) {
                if (nombreEquipo.matches("[a-zA-Z]+")){       
                    this.nombreEquipo=nombreEquipo.toUpperCase();
                }
            }
        }
	}

	

	public void setRanking(int ranking) {
		int enteroNull = -1;
		int valorMin = 0;
		int valorMax = 10;
		if(ranking>=valorMin && ranking<=valorMax) {
		}else {
			ranking=enteroNull;
		}
		this.ranking = ranking;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public int getRanking() {
		return ranking;
	}

	public String categoriaEquipo() {
		int enteroNull = -1;
		String categoria = null;
		int rankingPrimeroMin = 7;
		int rankingPrimeroMax = 10;
		int rankingSegundoMin = 3;
		int rankingSegundoMax = 6;
		int rankingTerceroMin = 3;

		if (nombreEquipo != null && ranking != enteroNull) {
			if(this.ranking>= rankingPrimeroMin && this.ranking<=rankingPrimeroMax) {
				categoria = "Primera";
			}else if(this.ranking>=rankingSegundoMin && this.ranking<=rankingSegundoMax) {
				categoria = "Segunda";
			}else if(this.ranking<rankingTerceroMin) {
				categoria = "Tercera";
			}
		}
		return categoria;

	}
}
