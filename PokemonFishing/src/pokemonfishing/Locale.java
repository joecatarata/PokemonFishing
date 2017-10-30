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
                         findPort();
                     }
	public Locale (String name, Badge badge, ArrayList pokemons, char[][] map) {
                        this.sLocaleName = name;
                        pokemonInLocale = pokemons;
                        this.badge = badge;
	   mapLength = 11;
                         mapWidth =  11;
                         this.map = map;
                         findPort();
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

	public void findPort() {
		for(int i=0; i<mapLength; i++){
                                                for(int j=0; j<mapWidth; j++){
                                                    if(map[i][j] == 'P'){
                                                        port = new Port(i,j);
                                                        break;
                                                    }
                                                }
                        }
	}
        
                     public void setTile(char icon, int x, int y){
                         map[y][x] = icon;
                     }
                     
        
                    public void showLocale(){
                        for(int i=0; i<mapLength; i++){
                          for(int j=0; j<mapWidth; j++){
                              System.out.print(map[i][j]);
                          }
                          System.out.println("");
                      }
                    }
                    
                    public char getIconAtIndex(int x, int y){
                        return map[y][x];
                    } 
                    
                    public ArrayList getPokemonInLocale(){
                        return pokemonInLocale;
                    }
                    
       


}
