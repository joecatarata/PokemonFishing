package pokemonfishing;

/**
 * This class provides the layout for the Pokemon in the game.
 * @author Michael Gerra-Clarin
 */
public class Pokemon {

	private String sPokemonName;
	private String sDepthEncountered;
	private double fCatchRate;
	private double fEncounterRate;
	private double nFameGiven;
                     private int fameDeduction;
	private boolean bisRare;
                    
                    public Pokemon(String name, String depth, double catchRate, double encounter, double nFame, boolean rare, int deduc){
                        sPokemonName = name;
                        sDepthEncountered = depth;
                        fCatchRate = catchRate;
                        fEncounterRate = encounter;
                        nFameGiven = nFame;
                        fameDeduction = deduc;
                        bisRare = rare;
                    }
	/**
                        * Retrieves the name of the Pokemon.
                        * @return A string data type.
                        */
	public String getsPokemonName() {
		return sPokemonName;
	}
	/**
                    * Assigns a name to the Pokemon.
                    * @param sPokemonName The name to be assigned.
                    */
	public void setsPokemonName(String sPokemonName) {
		this.sPokemonName = sPokemonName;
	}
	/**
                        *  Retrieves the depth where the Pokemon is found.
                        * @return A string data type.
                        */
	public String getsDepthEncountered() {
		return sDepthEncountered;
	}
	/**
                        * Assigns the depth where the Pokemon is found.
                        * @param sDepthEncountered The depth where the Pokemon is found.
                        */
	public void setsDepthEncountered(String sDepthEncountered) {
		this.sDepthEncountered = sDepthEncountered;
	}
	/**
                        * Retrieves the catch rate of the Pokemon
                        * @return A double data type.
                        */
	public double getfCatchRate() {
		return fCatchRate;
	}
	/**
                        * Assigns the catch rate of the Pokemon.
                        * @param fCatchRate The catch rate to be assigned.
                        */
	public void setfCatchRate(float fCatchRate) {
		this.fCatchRate = fCatchRate;
	}
	/**
                        * Retrieves the fame deduction of the Pokemon.
                        * @return An integer data type.
                        */
                    public int getFameDeduction(){
                        return fameDeduction;
                    }
                    /**
                     * Retrieves the encounter rate of the Pokemon.
                     * @return A double data type.
                     */
	public double getfEncounterRate() {
		return fEncounterRate;
	}
	/**
                    * Assigns an encounter rate to the Pokemon.
                    * @param fEncounterRate The encounter rate to be assigned.
                    */
	public void setfEncounterRate(double fEncounterRate) {
		this.fEncounterRate = fEncounterRate;
	}
	/**
                        * Retrieves the fame given by the Pokemon when captured.
                        * @return A double data type.
                        */
	public double getnFameGiven() {
		return nFameGiven;
	}
	/**
                        * Assigns the fame given by a Pokemon.
                        * @param nFameGiven The integer to be assigned.
                        */
	public void setnFameGiven(int nFameGiven) {
		this.nFameGiven = nFameGiven;
	}
	/**
                        *  Checks if the Pokemon is rare.
                        * @return A boolean data type.
                        */
	public boolean isBisRare() {
		return bisRare;
	}
	/**
                        * Assigns a value that tells if the Pokemon is rare.
                        * @param bisRare The boolean value to be assigned.
                        */
	public void setBisRare(boolean bisRare) {
		this.bisRare = bisRare;
	}
	
	
}
