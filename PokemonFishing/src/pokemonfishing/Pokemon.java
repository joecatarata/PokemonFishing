package pokemonfishing;


public class Pokemon {

	private String sPokemonName;
	private String sDepthEncountered;
	private double fCatchRate;
	private double fEncounterRate;
	private double nFameGiven;
	private boolean bisRare;
                    
                    public Pokemon(String name, String depth, double catchRate, double encounter, double nFame, boolean rare){
                        
                    }
	
	public String getsPokemonName() {
		return sPokemonName;
	}
	
	public void setsPokemonName(String sPokemonName) {
		this.sPokemonName = sPokemonName;
	}
	
	public String getsDepthEncountered() {
		return sDepthEncountered;
	}
	
	public void setsDepthEncountered(String sDepthEncountered) {
		this.sDepthEncountered = sDepthEncountered;
	}
	
	public double getfCatchRate() {
		return fCatchRate;
	}
	
	public void setfCatchRate(float fCatchRate) {
		this.fCatchRate = fCatchRate;
	}
	
	public double getfEncounterRate() {
		return fEncounterRate;
	}
	
	public void setfEncounterRate(float fEncounterRate) {
		this.fEncounterRate = fEncounterRate;
	}
	
	public double getnFameGiven() {
		return nFameGiven;
	}
	
	public void setnFameGiven(int nFameGiven) {
		this.nFameGiven = nFameGiven;
	}
	
	public boolean isBisRare() {
		return bisRare;
	}
	
	public void setBisRare(boolean bisRare) {
		this.bisRare = bisRare;
	}
	
	
}
