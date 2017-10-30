package pokemonfishing;


public class Gear {

	private Rod rod;
	private Boat boat;
	private Tacklebox tacklebox;
                     public Gear(){
                         rod = new Rod();
                         boat = new Boat();
                         tacklebox = new Tacklebox();
                     }
	
	public Rod getRod() {
		return rod;
	}
	
	public Boat getBoat() {
		return boat;
	}
	
	public Tacklebox getTacklebox() {
		return tacklebox;
	}
	
	
	
}
