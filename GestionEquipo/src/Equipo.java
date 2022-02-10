
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
		if (ranking >= 0 && ranking <= 10) {
		} else {
			ranking = -1;
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
		
		String categoria=null;
		String primera="Primera";
		String segunda="Segunda";
		String tercera="Tercera";

		
		if (this.nombreEquipo != null && this.ranking != -1) {
			if (this.ranking >= 7 && this.ranking <= 10) {
				categoria = primera;
			} else if (this.ranking >= 3 && this.ranking <= 6) {
				categoria = segunda;
			} else if (this.ranking < 3) {
				categoria = tercera;
			}
		}
		return categoria;

	}
}
