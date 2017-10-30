package pokemonfishing;

/**
 * This class provides the layout for the gear of the player.
 * @author Michael Gerra-Clarin
 */
public class Gear {

	private Rod rod;
	private Boat boat;
	private Tacklebox tacklebox;
                     public Gear(){
                         rod = new Rod();
                         boat = new Boat();
                         tacklebox = new Tacklebox();
                     }
	/**
                        * Retrieves the rod present in the gear.
                        * @return A rod data type.
                        */
	public Rod getRod() {
		return rod;
	}
	/**
                        * Retrieves the Boat present in the gear.
                        * @return A Boat data type.
                        */
	public Boat getBoat() {
		return boat;
	}
	/**
                        * Retrieves the Tacklebox present in the gear.
                        * @return A Tacklebox data type.
                        */
	public Tacklebox getTacklebox() {
		return tacklebox;
	}
	
	
	
}
