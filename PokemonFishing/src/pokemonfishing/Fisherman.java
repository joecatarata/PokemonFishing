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
	private ArrayList<Badge> badges;
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
	
	
}
