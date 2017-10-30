package pokemonfishing;


public class Reel {

	private String sReelName;
	private int nReelCost;
	private double dReelAddedERate;
	private double dReelAddedCRate;
        
	public Reel(){
                            sReelName = "Good ol' Reel";
                            nReelCost = 0;
                            dReelAddedCRate = 0.0;
                            dReelAddedERate = 0.0;
                    }
                    public Reel(String name, int cost, double encounterRate, double captureRate){
                        sReelName = name;
                        nReelCost = cost;
                        dReelAddedERate = encounterRate;
                        dReelAddedERate = captureRate;
                    }
	public String getsReelName() {
		return sReelName;
	}
	
	public void setsReelName(String sReelName) {
		this.sReelName = sReelName;
	}
	
	public int getnReelCost() {
		return nReelCost;
	}
	
	public void setnReelCost(int nReelCost) {
		this.nReelCost = nReelCost;
	}
	
	public double getfReelAddedERate() {
		return dReelAddedERate;
	}
	
	public void setfReelAddedERate(float fReelAddedERate) {
		this.dReelAddedERate = fReelAddedERate;
	}
	
	public double getfReelAddedCRate() {
		return dReelAddedCRate;
	}
	
	public void setfReelAddedCRate(float fReelAddedCRate) {
		this.dReelAddedCRate = fReelAddedCRate;
	}
	
	
}
