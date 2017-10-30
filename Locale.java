
public class Locale {

	private String sLocaleName;
	private Badges Badges;
	private Pokemon Pokemon;
	private Treasures Treasures;
	private Port Port;
	
	public Locale (String sLocaleName, Badges Badges, Pokemon Pokemon, Treasures Treasures) {
		
	}
	
	public String getsLocaleName() {
		return sLocaleName;
	}
	
	public void setsLocaleName(String sLocaleName) {
		this.sLocaleName = sLocaleName;
	}

	public Badges getBadges() {
		return Badges;
	}

	public void setBadges(Badges badges) {
		Badges = badges;
	}

	public Pokemon getPokemon() {
		return Pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		Pokemon = pokemon;
	}

	public Treasures getTreasures() {
		return Treasures;
	}

	public void setTreasures(Treasures treasures) {
		Treasures = treasures;
	}

	public Port getPort() {
		return Port;
	}

	public void setPort(Port port) {
		Port = port;
	}

}
