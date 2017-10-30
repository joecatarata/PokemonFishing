package pokemonfishing;


public class Lure {

	private String sLureName;
	private int nLureCost;
	private double dLureAddedERate;
	private double dLureAddedCRate;
                    
	public Lure(){
                            sLureName = "Good ol' Reel";
                            nLureCost = 0;
                            dLureAddedCRate = 0.0;
                            dLureAddedERate = 0.0;
                    }
                     public Lure(String name, int cost, double encounterRate, double captureRate){
                        sLureName = name;
                        nLureCost = cost;
                        dLureAddedERate = encounterRate;
                        dLureAddedERate = captureRate;
                    }
	public String getsLureName() {
		return sLureName;
	}
	
	public void setsLureName(String sLureName) {
		this.sLureName = sLureName;
	}
	
	public int getnLureCost() {
		return nLureCost;
	}
	
	public void setnLureCost(int nLureCost) {
		this.nLureCost = nLureCost;
	}
	
	public double getfLureAddedERate() {
		return dLureAddedERate;
	}
	
	public void setfLureAddedERate(float fLureAddedERate) {
		this.dLureAddedERate = fLureAddedERate;
	}
	
	public double getfLureAddedCRate() {
		return dLureAddedCRate;
	}
	
	public void setfLureAddedCRate(float fLureAddedCRate) {
		this.dLureAddedCRate = fLureAddedCRate;
	}
	
	
	
}
