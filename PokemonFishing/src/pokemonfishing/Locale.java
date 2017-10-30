package pokemonfishing;

import java.util.ArrayList;


public class Locale {

	private String sLocaleName;
	private Badge badge;
	private ArrayList<Pokemon> pokemonInLocale;
	private ArrayList<Treasure> treasures;
	private Port port;
                     private int mapLength;
                     private int mapWidth;
                     private char[][] map;
                     
	
                     public Locale(){
                         sLocaleName = "";
                         badge = new Badge();
                         pokemonInLocale = new ArrayList<Pokemon>();
                         mapLength = 11;
                         mapWidth =  11;
                         map = new char[mapWidth][mapLength];
                         
                     }
	public Locale (String sLocaleName, Badge badge, ArrayList pokemons, char[][] map) {
                        this.sLocaleName = this.sLocaleName;
                        pokemonInLocale = pokemons;
                        this.badge = badge;
	   mapLength = 11;
                         mapWidth =  11;
                         this.map = map;
                         port = new Port();
	}
        
                    public void setMap(char[][] map){
                        this.map = map;
                    }
	
	public String getsLocaleName() {
		return sLocaleName;
	}
	
	public void setsLocaleName(String sLocaleName) {
		this.sLocaleName = sLocaleName;
	}

	public Badge getBadge() {
		return badge;
	}

	public void setBadge(Badge badge) {
		this.badge = badge;
	}

	public ArrayList getTreasures() {
		return treasures;
	}

	public Port getPort() {
		return port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

}
