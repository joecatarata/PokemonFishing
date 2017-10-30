package pokemonfishing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pokemonfishing.Locale;
/**
 * This class provides the layout of the main player.
 * @author Michael Gerra-Clarin
 */
public class Fisherman {

	private String sPlayerName;
	private HashMap<String, Integer> nFame;
	private HashMap<String, Gear> gears;
                     private Gear equippedGear;
                     private int currentLocaleFame;
	private ArrayList<Badge> badges;
                     private ArrayList <Pokemon> caughtPokemon;
	private int playerXpos;
                     private int playerYpos;
                     private char playerIcon;
                     
                     public Fisherman(){
                         sPlayerName = "John Doe";
                         nFame = new HashMap();
                         badges = new ArrayList<>();
                         gears = new HashMap();
                         playerXpos = 0;
                         playerYpos = 0;
                         playerIcon = 'X';
                         caughtPokemon = new ArrayList<>();
                     }
                     
	public Fisherman(String sName) {
                                           sPlayerName = sName;
                                           nFame = new HashMap();
                                           nFame.put("Lake of Rage", 0);
                                          //add more in Phase 2
                                          
                                          badges = new ArrayList<>();
                                          gears = new HashMap();
                                          // Add gear for
                                          gears.put("Lake of Rage", new Gear());
                                          caughtPokemon = new ArrayList<>();
                                          currentLocaleFame = nFame.get("Lake of Rage");
                                           equippedGear = gears.get("Lake of Rage");
                                           playerXpos = 0;
                                           playerYpos = 0;
                                           playerIcon = 'X';
	}
                    
                    /**
                     * Retrieves the player name.
                     * @return The player name.
                     */
	public String getsPlayerName() {
		return sPlayerName;
	}
                    /**
                     * Assigns a name to the player.
                     * @param sPlayerName The name to be assigned.
                     */
	public void setsPlayerName(String sPlayerName) {
		this.sPlayerName = sPlayerName;
	}
                    /**
                     * Retrieves the fame per locale of the user.
                     * @return A HashMap data type.
                     */
	public HashMap getnFame() {
		return (HashMap) nFame;
	}
                    /**
                     * Assigns a specific gear in a specific locale.
                     * @param g The gear object.
                     * @param localeName The name of the locale for the gear to be assigned to.
                     */
                    public void addGear(Gear g, String localeName){
                        gears.get(localeName);
                    }
                     
                    /**
                     * Changes the gear according to the current locale.
                     * @param localeName The name of the locale.
                     */
                     public void changeGear(String localeName){
                         equippedGear = gears.get(localeName);
                     }
                     
                     /**
                      * Changes the fame according to the current locale.
                      * @param localeName  The name of the locale.
                      */
                     public void changeCurrentLocaleFame(String localeName){
                         currentLocaleFame = nFame.get(localeName);
                     }
                     
                     /**
                      * Retrieves the current gear in the locale.
                      * @return A Gear datatype.
                      */
                     public Gear getGear(){
                         return equippedGear;
                     }
                     /**
                      * Retrieves the badges of the fisherman.
                      * @return An ArrayList.
                      */
	public ArrayList getBadges() {
		return badges;
	}
                    
                    /**
                     * Sets the player's X position.
                     * @param x The x position to be used.
                     */
                    public void setPlayerXpos(int x){
                        playerXpos = x;
                    }
                    /**
                     * Sets the player's Y position.
                     * @param y The y position to be used.
                     */
                    public void setPlayerYpos(int y){
                       playerYpos = y;
                    }
                    
                    /**
                     * Retrieves the player's current X position.
                     * @return An integer data type.
                     */
                    public int getPlayerXpos(){
                        return playerXpos;
                    }
                    /**
                     * Retrieves the player's current Y position.
                     * @return An integer data type.
                     */
                    public int getPlayerYpos(){
                        return playerYpos;
                    }
                    /**
                     * Retrieves the player's assigned icon.
                     * @return A character data type.
                     */
                    public char getIcon(){
                        return playerIcon;
                    }
                    /**
                     * Reduces the available casts accordingly.
                     */
                    public void cast(){
                        equippedGear.getTacklebox().reducenCasts(1);
                    }
                    /**
                     * Add's a Pokemon to the total caught Pokemon of the user.
                     * @param p The Pokemon to be added.
                     */
                    public void addCaughtPokemon(Pokemon p){
                        caughtPokemon.add(p);
                    }
                    
                    /**
                     * Displays the statistics of the player.
                     */
                    public void showStats(){
                        System.out.println("Number of Pokemon Caught: " + caughtPokemon.size());
                        System.out. print("Pokemon Caught: " );
                        for(int i=0; i<caughtPokemon.size(); i++){
                           System.out.print(caughtPokemon.get(i).getsPokemonName() + " ");                        
                        }
                        System.out.println("");
                        System.out.println("Fame in current locale: " + currentLocaleFame);
                        System.out.println("Number of badges earned: " + badges.size());
                        System.out.println("Badges earned: ");
                        for(int i=0; i<badges.size(); i++){
                            System.out.print(badges.get(i).getsBadgeName()+ " ");                    
                        }
                    }
                    /**
                     * Increments fame according to the add variable.
                     * @param add The value to be added to.
                     */
                    public void addFame(int add){
                        currentLocaleFame +=  add;
                    }
                    
                    /**
                     * Retrieves all the caught Pokemon of the Fisherman.
                     * @return An ArrayList data type.
                     */
                    public ArrayList getCaughtPokemon(){
                        return caughtPokemon;
                    }
                    
                    /**
                     * Retrieves the current fame of the fisherman in the locale.
                     * @return An Integer data type.
                     */
                    public int getCurrentLocaleFame(){
                        return currentLocaleFame;
                    }
                    /**
                     * Adds a badge to the collected badges of the fisherman.
                     * @param b The badge to be added to.
                     */
                    public void addBadge(Badge b){
                        badges.add(b);
                    }
}
