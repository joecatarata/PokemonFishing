package pokemonfishing;


public class Line {

	private String sLineName;
	private int nLineCost;
	private double dLineAddedCRate;
                     private double dLineAddedERate;
                    public Line(){
                            sLineName = "Good ol' Reel";
                            nLineCost = 0;
                            dLineAddedCRate = 0.0;
                            dLineAddedERate = 0.0;
                    }
                     public Line(String name, int cost, double encounterRate, double captureRate){
                        sLineName = name;
                        nLineCost = cost;
                        dLineAddedERate = encounterRate;
                        dLineAddedERate = captureRate;
                    }
	public String getsLineName() {
		return sLineName;
	}
	
	public void setsLineName(String sLineName) {
		this.sLineName = sLineName;
	}
	
	public int getnLineCost() {
		return nLineCost;
	}
	
	public void setnLineCost(int nLineCost) {
		this.nLineCost = nLineCost;
	}
	
	public double getfLineAddedCRate() {
		return dLineAddedCRate;
	}
        
                     public double getfLineAddedERate(){
                         return dLineAddedERate;
                     }
	
	public void setfLineAddedCRate(float fLineAddedCRate) {
		this.dLineAddedCRate = fLineAddedCRate;
	}
	
	
	
}
