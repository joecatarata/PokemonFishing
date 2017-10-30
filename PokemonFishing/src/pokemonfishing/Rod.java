package pokemonfishing;


public class Rod {

	private String sRodName;
	private int nRodCost;
                     private double encounterBoost;
                     private double captureBoost;
	private Line line;
	private Lure lure;
	private Reel reel;
                     private int customizationPoints;
                     
	public Rod(){
                            sRodName = "Old Rod";
                            encounterBoost = 0.0;
                            captureBoost = 0.0;
                            nRodCost = 0;
                            line = new Line();
                            lure = new Lure();
                            reel = new Reel();  
                    }
	public String getsRodName() {
		return sRodName;
	}
	
	public void setsRodName(String sRodName) {
		this.sRodName = sRodName;
	}
	
	public int getnRodCost() {
		return nRodCost;
	}
	
	public void setnRodCost(int nRodCost) {
		this.nRodCost = nRodCost;
	}
	
	public Line getLine() {
		return line;
	}
	
	public void setLine(Line line) {
		this.line = line;
	}
	
	public Lure getLure() {
		return lure;
	}
	
	public void setLure(Lure lure) {
		this.lure = lure;
	}
	
	public Reel getReel() {
		return reel;
	}
	
	public void setReel(Reel reel) {
		this.reel = reel;
	}
	
	
	
	
}
