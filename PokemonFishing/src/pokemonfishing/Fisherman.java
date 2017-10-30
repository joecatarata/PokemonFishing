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
	
                     public Fisherman(){
                         sPlayerName = "John Doe";
                         nFame = new HashMap();
                         badges = new ArrayList<>();
                         gears = new HashMap();
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
                                          
                                           //equippedGear = gears.get("Lake of Rage");
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

	public ArrayList getBadges() {
		return badges;
	}
	
	
}
