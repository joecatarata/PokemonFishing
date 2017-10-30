package pokemonfishing;

/**
 * This class provides the layout for the treasures in the game.
 * @author Michael Gerra-Clarin
 */
public class Treasure {

	private String sTreasureName;
	private int nPrice;
	private double captureRate;
                     private double encounterRate;
                     public Treasure(){
                         
                     }
                     
                     public Treasure(String name, int price, double encounterRate){
                         sTreasureName = name;
                         nPrice = price;
                         this.captureRate = 1.0;
                         this.encounterRate = encounterRate;
                     }
                     /**
                      * Retrieves the name of the treasure.
                      * @return A string data type.
                      */
	public String getsTreasureName() {
		return sTreasureName;
	}
	/**
                        * Assigns a name to the treasure.
                        * @param sTreasureName The name to be assigned.
                        */
	public void setsTreasureName(String sTreasureName) {
		this.sTreasureName = sTreasureName;
	}
	/**
                        *  Retrieves the price of the treasure.
                        * @return An integer data type.
                        */
	public int getnPrice() {
		return nPrice;
	}
	/** 
                        * Assigns a price to the treasure.
                        * @param nPrice The price to be assigned.
                        */
	public void setnPrice(int nPrice) {
		this.nPrice = nPrice;
	}
	
	
}
