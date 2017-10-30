package pokemonfishing;

/**
 * This class provides the layout for the badges in the game.
 * @author Michael Gerra-Clarin
 */
public class Badge {

	private String sBadgeName;
                        
                     public Badge(){
                         sBadgeName = "";
                     }
                    
                     public Badge(String name){
                         sBadgeName = name;
                     }
                     /**
                      * Retrieves the name of the badge
                      * @return A string data type.
                      */
	public String getsBadgeName() {
		return sBadgeName;
	}
                    /**
                     * Assigns a nam to the badge.
                     * @param sBadgeName The name to be assigned to the badge.
                     */
	public void setsBadgeName(String sBadgeName) {
		this.sBadgeName = sBadgeName;
	}
	
}
