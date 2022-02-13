package gestionequipo;

public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;
      
      
      public AsignarEquipo() {
    	  
      }
      
      public void setEquipo(Equipo equipo) {
    	  this.equipo=null;
		  if(equipo.getNombreEquipo()!=null && equipo.getRanking()!=-1) {
			  this.equipo=equipo;
		  }
      }
      
      public void setJugador(Jugador jugador) {
    	  if(jugador==null) {
    		  this.jugador=null;
    	  }else {
        	  if(jugador.getNombreJugador()!=null && jugador.getEdad()!=-1 && jugador.getIdioma()!=null) {
        		  this.jugador=jugador;
        	  }else {
        		  this.jugador=null;
        	  }
    	  }

      }
      
      public Equipo getEquipo(){
          return equipo;
      }
      
      public Jugador getJugador(){
         return jugador;
      }
      
}
