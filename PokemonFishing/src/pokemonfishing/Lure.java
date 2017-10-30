package pokemonfishing;

/**
 * This class provides the layout for the lures in the game.
 * @author Michael Gerra-Clarin
 */
public class Lure {

	private String sLureName;
	private int nLureCost;
	private double dLureAddedERate;
	private double dLureAddedCRate;
                    
	public Lure(){
                            sLureName = "Good ol' Reel";
                            nLureCost = 0;
                            dLureAddedCRate = 0.0;
                            dLureAddedERate = 0.0;
                    }
                     public Lure(String name, int cost, double encounterRate, double captureRate){
                        sLureName = name;
                        nLureCost = cost;
                        dLureAddedERate = encounterRate;
                        dLureAddedERate = captureRate;
                    }
                     /** 
                     * Retrieves the name of the lure.
                     * @return A string data type.
                     */
	public String getsLureName() {
		return sLureName;
	}
	/**
                        * Assigns a name to the lure.
                        * @param sLureName The name to be assigned.
                        */
	public void setsLureName(String sLureName) {
		this.sLureName = sLureName;
	}
	/**
                        * Retrieves the cost of the reel.
                        * @return An integer datatype.
                        */
	public int getnLureCost() {
		return nLureCost;
	}
	/**
                        * Assigns a cost to the lure.
                        * @param nLureCost The cost to be assigned.
                        */
	public void setnLureCost(int nLureCost) {
		this.nLureCost = nLureCost;
	}
	/**
                        * Retrieves the encounter rate bonus of the reel.
                        * @return A double data type.
                        */
	public double getfLureAddedERate() {
		return dLureAddedERate;
	}
	/**
                        * Assigns an encouter rate bonus to the lure.
                        * @param fLureAddedERate The bonus to be added.
                        */
	public void setfLureAddedERate(float fLureAddedERate) {
		this.dLureAddedERate = fLureAddedERate;
	}
	/**
                        * Retrieves the capture rate bonus of the reel.
                        * @return A double data type.
                        */
	public double getfLureAddedCRate() {
		return dLureAddedCRate;
	}
	/**
                        * Assigns an capture rate bonus to the lure.
                        * @param fLureAddedCRate The bonus to be added.
                        */
	public void setfLureAddedCRate(float fLureAddedCRate) {
		this.dLureAddedCRate = fLureAddedCRate;
	}
	
	
	
}
