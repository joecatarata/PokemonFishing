package pokemonfishing;

/**
 * This class provides the layout for the rods in the game.
 * @author Michael Gerra-Clarin
 */
public class Rod {

	private String sRodName;
	private int nRodCost;
                     private double encounterBoost;
                     private double captureBoost;
	private Line line;
	private Lure lure;
	private Reel reel;
                     private int customizationPoints;
                     
	public Rod(){
                            sRodName = "Old Rod";
                            encounterBoost = 0.0;
                            captureBoost = 0.0;
                            nRodCost = 0;
                            line = new Line();
                            lure = new Lure();
                            reel = new Reel();  
                    }
                     /** 
                      * Retrieves the name of the rod.
                      * @return A string data type.
                      */
	public String getsRodName() {
		return sRodName;
	}
	/**
                        * Assigns a name to the rod.
                        * @param sRodName The name to be assigned.
                        */
	public void setsRodName(String sRodName) {
		this.sRodName = sRodName;
	}
	/**
                        * Retrieves the cost of the rod.
                        * @return An integer data type.
                        */
	public int getnRodCost() {
		return nRodCost;
	}
	/**
                        * Assigns the cost of the rod.
                        * @param nRodCost The value to be assigned.
                        */
	public void setnRodCost(int nRodCost) {
		this.nRodCost = nRodCost;
	}
	/**
                        * Retrieves the line of the rod.
                        * @return A line datatype.
                        */
	public Line getLine() {
		return line;
	}
	/**
                        * Assigns a line to the rod.
                        * @param line The line to be assigned.
                        */
	public void setLine(Line line) {
		this.line = line;
	}
	/**
                        * Retrieves the lure in the rod.
                        * @return A lure data type.
                        */
	public Lure getLure() {
		return lure;
	}
	/**
                        * Assigns a lure to the rod.
                        * @param lure The lure to be assigned.
                        */
	public void setLure(Lure lure) {
		this.lure = lure;
	}
	/**
                        * Retrieves the reel of the rod.
                        * @return A reel datatype.
                        */
	public Reel getReel() {
		return reel;
	}
	/**
                        * Assigns a reel to the rod.
                        * @param reel The reel to be assigned.
                        */
	public void setReel(Reel reel) {
		this.reel = reel;
	}
	
	
	
	
}
