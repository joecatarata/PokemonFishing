package pokemonfishing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pokemonfishing.Locale;


public class Fisherman {

	private String sPlayerName;
	private HashMap nFame;
	private Gear gear;
	private ArrayList<Badge> badges;
	
                     public Fisherman(){
                         sPlayerName = "John Doe";
                         nFame = new HashMap();
                         badges = new ArrayList<>();
                         gear = new Gear();
                     }
	public Fisherman(String sName,Gear gear) {
                                           sPlayerName = sName;
                                           nFame = new HashMap();
                                          this.gear = gear;
                                          badges = new ArrayList<>();
	}

	public String getsPlayerName() {
		return sPlayerName;
	}

	public void setsPlayerName(String sPlayerName) {
		this.sPlayerName = sPlayerName;
	}

	public Gear getGear() {
		return gear;
	}

	public void setGear(Gear gear) {
		this.gear = gear;
	}

	public HashMap getnFame() {
		return (HashMap) nFame;
	}

	public ArrayList getBadges() {
		return badges;
	}
	
	public void Move() {
		
	}
	
	public void Cast() {
		
	}
	
	
	
}
