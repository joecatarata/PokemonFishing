package pokemonfishing;

/**
 * This class provides the layout for the reels in the game.
 * @author Michael Gerra-Clarin
 */
public class Reel {

	private String sReelName;
	private int nReelCost;
	private double dReelAddedERate;
	private double dReelAddedCRate;
        
	public Reel(){
                            sReelName = "Good ol' Reel";
                            nReelCost = 0;
                            dReelAddedCRate = 0.0;
                            dReelAddedERate = 0.0;
                    }
                    public Reel(String name, int cost, double encounterRate, double captureRate){
                        sReelName = name;
                        nReelCost = cost;
                        dReelAddedERate = encounterRate;
                        dReelAddedERate = captureRate;
                    }
                    /** 
                     * Retrieves the name of the reel.
                     * @return A string data type.
                     */
	public String getsReelName() {
		return sReelName;
	}
	/**
                        * Assigns a name to the reel.
                        * @param sReelName The name to be assigned.
                        */
	public void setsReelName(String sReelName) {
		this.sReelName = sReelName;
	}
	/**
                        * Retrieves the cost of the reel.
                        * @return An integer datatype.
                        */
	public int getnReelCost() {
		return nReelCost;
	}
	/**
                        * Assigns a cost to the reel.
                        * @param nReelCost The cost to be assigned.
                        */
	public void setnReelCost(int nReelCost) {
		this.nReelCost = nReelCost;
	}
	/**
                        * Retrieves the encounter rate bonus of the reel.
                        * @return A double data type.
                        */
	public double getfReelAddedERate() {
		return dReelAddedERate;
	}
	/**
                        * Assigns an encouter rate bonus to the reel.
                        * @param fReelAddedERate The bonus to be added.
                        */
	public void setfReelAddedERate(float fReelAddedERate) {
		this.dReelAddedERate = fReelAddedERate;
	}
	/**
                        * Retrieves the capture rate bonus of the reel.
                        * @return A double data type.
                        */
	public double getfReelAddedCRate() {
		return dReelAddedCRate;
	}
	/**
                        * Assigns an capture rate bonus to the reel
                        * @param fReelAddedCRate The bonus to be added.
                        */
	public void setfReelAddedCRate(float fReelAddedCRate) {
		this.dReelAddedCRate = fReelAddedCRate;
	}
	
	
}
