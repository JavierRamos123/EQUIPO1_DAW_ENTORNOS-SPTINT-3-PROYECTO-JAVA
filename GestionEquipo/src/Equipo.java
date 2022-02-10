
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		boolean esNulo=false;
		int maxCaracter= 20;
		if(nombreEquipo.isEmpty()) {
			esNulo=true;
		}
		if(nombreEquipo.length()>maxCaracter) {
			esNulo=true;
		}
		for(int i=0;i<=nombreEquipo.length()-1;i++) {
			char letra=nombreEquipo.charAt(i);
			if(!Character.isLetter(letra) && letra!=32) {
				esNulo=true;
			}
		}
		nombreEquipo=nombreEquipo.toUpperCase();
		if(esNulo) {
			nombreEquipo=null;
		}
		this.nombreEquipo=nombreEquipo;
		
	}
	public void setRanking(int ranking) {
		int enteroNull = -1;
		int valorMin = 0;
		int valorMax = 10;
		if(ranking>=valorMin && ranking<=valorMax) {
		}else {
			ranking=enteroNull;
		}
		this.ranking=ranking;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
	
	public String categoriaEquipo() {
		int enteroNull = -1;
		int rankingPrimeroMin = 7;
		int rankingPrimeroMax = 10;
		int rankingSegundoMin = 3;
		int rankingSegundoMax = 6;
		int rankingTerceroMin = 3;

		if (nombreEquipo != null && ranking != enteroNull) {
			if(this.ranking>= rankingPrimeroMin && this.ranking<=rankingPrimeroMax) {
				return "Primera";
			}else if(this.ranking>=rankingSegundoMin && this.ranking<=rankingSegundoMax) {
				return "Segunda";
			}else if(this.ranking<rankingTerceroMin) {
				return "Tercera";
			}
		}
		return null;
		
	}
}
