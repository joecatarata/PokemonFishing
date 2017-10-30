package pokemonfishing;


public class Rod {

	private String sRodName;
	private int nRodCost;
	private Line Line;
	private Lure Lure;
	private Reel Reel;
	
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
		return Line;
	}
	
	public void setLine(Line line) {
		Line = line;
	}
	
	public Lure getLure() {
		return Lure;
	}
	
	public void setLure(Lure lure) {
		Lure = lure;
	}
	
	public Reel getReel() {
		return Reel;
	}
	
	public void setReel(Reel reel) {
		Reel = reel;
	}
	
	
	
	
}
