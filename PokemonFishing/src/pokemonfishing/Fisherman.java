package pokemonfishing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pokemonfishing.Locale;

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

	public String getsPlayerName() {
		return sPlayerName;
	}

	public void setsPlayerName(String sPlayerName) {
		this.sPlayerName = sPlayerName;
	}
	public HashMap getnFame() {
		return (HashMap) nFame;
	}
        
                    public void addGear(Gear g, String localeName){
                        gears.get(localeName);
                    }
                     
                     public void changeGear(String localeName){
                         equippedGear = gears.get(localeName);
                     }
                     
                     public void changeCurrentLocaleFame(String localeName){
                         currentLocaleFame = nFame.get(localeName);
                     }
                     public Gear getGear(){
                         return equippedGear;
                     }
	public ArrayList getBadges() {
		return badges;
	}
        
                    public void setPlayerXpos(int x){
                        playerXpos = x;
                    }
                    
                    public void setPlayerYpos(int y){
                       playerYpos = y;
                    }
                    
                    public int getPlayerXpos(){
                        return playerXpos;
                    }
                    
                    public int getPlayerYpos(){
                        return playerYpos;
                    }
                    public char getIcon(){
                        return playerIcon;
                    }
                    
                    public void cast(){
                        equippedGear.getTacklebox().reducenCasts(1);
                    }
                    
                    public void addCaughtPokemon(Pokemon p){
                        caughtPokemon.add(p);
                    }
                    
                    public void showStats(){
                        System.out.println("Caught Pokemon: " + caughtPokemon.size());
                        System.out. print("Pokemon Caught: " );
                        for(int i=0; i<caughtPokemon.size(); i++){
                           System.out.print(caughtPokemon.get(i).getsPokemonName() + " ");                        
                        }
                        System.out.println("");
                        System.out.println("Fame in current locale: " + currentLocaleFame);
                    }
                    
                    public void addFame(int add){
                        currentLocaleFame +=  add;
                    }
                    
                    public ArrayList getCaughtPokemon(){
                        return caughtPokemon;
                    }
	
}
