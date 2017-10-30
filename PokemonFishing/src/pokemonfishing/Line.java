package pokemonfishing;

/**
 * This class provides the layout for the lines in the game.
 * @author Michael Gerra-Clarin
 */
public class Line {

	private String sLineName;
	private int nLineCost;
	private double dLineAddedCRate;
                     private double dLineAddedERate;
                    public Line(){
                            sLineName = "Good ol' Reel";
                            nLineCost = 0;
                            dLineAddedCRate = 0.0;
                            dLineAddedERate = 0.0;
                    }
                     public Line(String name, int cost, double encounterRate, double captureRate){
                        sLineName = name;
                        nLineCost = cost;
                        dLineAddedERate = encounterRate;
                        dLineAddedERate = captureRate;
                    }
                     /** 
                     * Retrieves the name of the line.
                     * @return A string data type.
                     */
	public String getsLineName() {
		return sLineName;
	}
	/**
                        * Assigns a name to the line.
                        * @param sLineName The name to be assigned.
                        */
	public void setsLineName(String sLineName) {
		this.sLineName = sLineName;
	}
	/**
                        * Retrieves the cost of the reel.
                        * @return An integer datatype.
                        */
	public int getnLineCost() {
		return nLineCost;
	}
	/**
                        * Assigns a cost to the line.
                        * @param nLineCost The cost to be assigned.
                        */
	public void setnLineCost(int nLineCost) {
		this.nLineCost = nLineCost;
	}
	/**
                        * Retrieves the capture rate bonus of the reel.
                        * @return A double data type.
                        */
	public double getfLineAddedCRate() {
		return dLineAddedCRate;
	}
                    /**
                        * Retrieves the encounter rate bonus of the reel.
                        * @return A double data type.
                        */
                     public double getfLineAddedERate(){
                         return dLineAddedERate;
                     }
	/**
                        * Assigns an encouter rate bonus to the lure.
                        * @param fLineAddedERate The bonus to be added.
                        */
	public void setfLineAddedCRate(float fLineAddedCRate) {
		this.dLineAddedCRate = fLineAddedCRate;
	}
	
	
	
}
