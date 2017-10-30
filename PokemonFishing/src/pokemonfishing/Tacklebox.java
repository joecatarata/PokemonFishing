package pokemonfishing;

/**
 * This class provides the layout for the Tacklebox in the game.
 * @author Michael Gerra-Clarin
 */
public class Tacklebox {

	private String sTackleboxName;
	private int nTackleBoxCost;
	private int nCasts;
      
	public Tacklebox(){
                        sTackleboxName = "Basic Tackle Box";
                        nCasts = 5;
                        nTackleBoxCost = 0;
                    }
                     /**
                      * Retrieves the name of the Tacklebox.
                      * @return A string data type.
                      */
	public String getsTackleboxName() {
		return sTackleboxName;
	}
	/**
                        * Assigns a name to the Tacklebox.
                        * @param sTackleboxName The name to be assigned to the tacklebox.
                        */
	public void setsTackleboxName(String sTackleboxName) {
		this.sTackleboxName = sTackleboxName;
	}
	/**
                        * Retrieves the cost of the tacklebox.
                        * @return An integer datatype.
                        */
	public int getnTackleBoxCost() {
		return nTackleBoxCost;
	}
	/**
                        *   Assigns a cost to the tacklebox.
                        * @param nTackleBoxCost The cost to be assigned.
                        */
	public void setnTackleBoxCost(int nTackleBoxCost) {
		this.nTackleBoxCost = nTackleBoxCost;
	}
	/**
                        * Retrieves the casts left in the tacklebox.
                        * @return An integer data type.
                        */
	public int getnCasts() {
		return nCasts;
	}
	/**
                        * Assigns the number of casts left.
                        * @param nCasts  The number to be assigned to the casts.
                        */
	public void setnCasts(int nCasts) {
		this.nCasts = nCasts;
	}
                    /**
                     * Reduces the casts by an amount.
                     * @param reduceNumber The number to be deducted from the casts.
                     */
                     public void reducenCasts(int reduceNumber){
                         nCasts = nCasts - reduceNumber;
                     }
	
	
}
