package pokemonfishing;


public class Treasure {

	private String sTreasureName;
	private int nPrice;
	private double captureRate;
                     private double encounterRate;
                     public Treasure(){
                         
                     }
                     
                     public Treasure(String name, int price, double encounterRate){
                         sTreasureName = name;
                         nPrice = price;
                         this.captureRate = 1.0;
                         this.encounterRate = encounterRate;
                     }
	public String getsTreasureName() {
		return sTreasureName;
	}
	
	public void setsTreasureName(String sTreasureName) {
		this.sTreasureName = sTreasureName;
	}
	
	public int getnPrice() {
		return nPrice;
	}
	
	public void setnPrice(int nPrice) {
		this.nPrice = nPrice;
	}
	
	
}
