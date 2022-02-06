
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		boolean esNulo=false;
		if(nombreEquipo.isEmpty()) {
			esNulo=true;
		}
		if(nombreEquipo.length()>20) {
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
		if(ranking>=0 && ranking<=10) {
		}else {
			ranking=-1;
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
		if (nombreEquipo != null && ranking != -1) {
			if(this.ranking>=7 && this.ranking<=10) {
				return "Primera";
			}else if(this.ranking>=3 && this.ranking<=6) {
				return "Segunda";
			}else if(this.ranking<3) {
				return "Tercera";
			}
		}
		return null;
		
	}
}
