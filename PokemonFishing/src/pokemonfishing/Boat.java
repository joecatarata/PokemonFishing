package pokemonfishing;

/**
 *  This class provides the layout for the boat.
 * @author Michael Gerra-Clarin
 */
public class Boat {

	private String sBoatName;
	private int nBoatCost;
	private double nMoves;
	private Engine engine;
                    public Boat(){
                        sBoatName = "Starting Boat";
                        nMoves = 5.0;
                        nBoatCost = 0;
                        engine = new Engine();
                    }
                    public Boat(String name, int cost, int moves){
                        sBoatName = name;
                        nBoatCost = cost;
                        nMoves = moves;
                        engine = new Engine();
                    }
                    /**
                     * Retrieves the name of the boat.
                     * @return A String data type.
                     */
	public String getsBoatName() {
		return sBoatName;
	}
	/**
                        * Assigns the name of the boat to the value of sBoatName.
                        * @param sBoatName The value to be assigned to.
                        */
	public void setsBoatName(String sBoatName) {
		this.sBoatName = sBoatName;
	}
	/**
                        * Retrieves the cost of the boat.
                        * @return An integer data type.
                        */
	public int getnBoatCost() {
		return nBoatCost;
	}
	/**
                        * Assigns the boat cost.
                        * @param nBoatCost The cost to be assigned to the boat.
                        */
	public void setnBoatCost(int nBoatCost) {
		this.nBoatCost = nBoatCost;
	}
	/**
                        * Retrieves the moves left on the boat.
                        * @return A double-precision floating point data type.
                        */
	public double getnMoves() {
		return nMoves;
	}
	/**
                        * Assigns moves to the boat.
                        * @param nMoves The value to be assigned to the moves to the boat.
                        */
	public void setnMoves(double nMoves) {
		this.nMoves = nMoves;
	}
                        
                        /**
                         * Retrieves the engine of the boat.
                         * @return An engine data type.
                         */
                      public Engine getEngine(){
                          return engine;
                      }
	/**
                        * Reduces the moves of the user by the value of x.
                        * @param x The value to be deducted to the moves.
                        */
                     public void reducenMoves(double x){
                         nMoves = nMoves - x;
                     }
	
}
