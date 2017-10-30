package pokemonfishing;


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
	
	public double getnMoves() {
		return nMoves;
	}
	
	public void setnMoves(double nMoves) {
		this.nMoves = nMoves;
	}
        
                      public Engine getEngine(){
                          return engine;
                      }
	
                     public void reducenMoves(double x){
                         nMoves = nMoves - x;
                     }
	
}
