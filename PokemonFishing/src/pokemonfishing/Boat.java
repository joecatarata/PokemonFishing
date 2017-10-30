package pokemonfishing;


public class Boat {

	private String sBoatName;
	private int nBoatCost;
	private int nMoves;
	
                    public Boat(){
                        sBoatName = "Starting Boat";
                        nMoves = 5;
                        nBoatCost = 0;
                    }
                    public Boat(String name, int cost, int moves){
                        sBoatName = name;
                        nBoatCost = cost;
                        nMoves = moves;
                    }
	public String getsBoatName() {
		return sBoatName;
	}
	
	public void setsBoatName(String sBoatName) {
		this.sBoatName = sBoatName;
	}
	
	public int getnBoatCost() {
		return nBoatCost;
	}
	
	public void setnBoatCost(int nBoatCost) {
		this.nBoatCost = nBoatCost;
	}
	
	public int getnMoves() {
		return nMoves;
	}
	
	public void setnMoves(int nMoves) {
		this.nMoves = nMoves;
	}
	
	
}
