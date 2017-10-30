package pokemonfishing;

import java.util.ArrayList;

/**
 * This class provides the layout for each locale in the game.
 * @author Michael Gerra-Clarin
 */
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
                         System.out.println(map[0][0]);
                         
	}
                    /**
                     * Assigns a 2d character array to the map of the Locale.
                     * @param map The map to be assigned to the map of the locale.
                     */
                    public void setMap(char[][] map){
                        this.map = map;
                    }
	
                    /**
                     * Retrieves the locale's name
                     * @return A string data type.
                     */
	public String getsLocaleName() {
		return sLocaleName;
	}
	
                    /**
                     * Assigns a name to the locale
                     * @param sLocaleName The name to be assigned to the locale.
                     */
	public void setsLocaleName(String sLocaleName) {
		this.sLocaleName = sLocaleName;
	}
                    
                    /**
                     * Retrieves the badge for the locale.
                     * @return A badge data type.
                     */
	public Badge getBadge() {
		return badge;
	}
                    /**
                     * Assigns a badge to the locale.
                     * @param badge A badge to be assigned to the locale.
                     */
	public void setBadge(Badge badge) {
		this.badge = badge;
	}
                    /**
                     * Retrieves the ArrayList.
                     * @return An ArrayList data type.
                     */
	public ArrayList getTreasures() {
		return treasures;
	}
                    /**
                     * Retrieves the port of the Locale.
                     * @return A port data type.
                     */
	public Port getPort() {
		return port;
	}
                    
                    /**
                     * Looks for the port in the Locale.
                     */
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
                    /**
                     * Assigns an icon the specific tile.
                     * @param icon The character icon to be assigned to the specific index.
                     * @param x The x position of the index.
                     * @param y The y position of the index.
                     */
                     public void setTile(char icon, int x, int y){
                         map[y][x] = icon;
                     }
                     
                     /**
                      * Displays the map of the locale.
                      */
                    public void showLocale(){
                        for(int i=0; i<mapLength; i++){
                          for(int j=0; j<mapWidth; j++){
                              System.out.print(map[i][j]);
                          }
                          System.out.println("");
                      }
                    }
                    /**
                     * Retrieves an icon from the specific index.
                     * @param x The x position of the icon to be retrieved. 
                     * @param y The y position of the icon to be retrieved.
                     * @return A character data type.
                     */ 
                    public char getIconAtIndex(int x, int y){
                        return map[y][x];
                    } 
                    /**
                     * Retrieves the available Pokemon in the locale.
                     * @return An ArrayList data type.
                     */
                    public ArrayList getPokemonInLocale(){
                        return pokemonInLocale;
                    }
                    
       


}
