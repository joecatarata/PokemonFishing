package pokemonfishing;

import java.util.ArrayList;
public class Game {

	private Fisherman player;
	private ArrayList<Locale> Locales;
                        
                     public Game(){}
                     public Game(String name){
                         
                         Locales = new ArrayList<>();
                         player  =  new Fisherman(name);
                         initializeLocales();
                         
                     }
	
	public Fisherman getFisherman() {
		return player;
	}
	
	public void setFisherman(Fisherman fisherman) {
		player = fisherman;
	}
	
	public ArrayList<Locale> getLocale() {
		return Locales;
	}
	
	public void setLocale(ArrayList<Locale> locale) {
		Locales = locale;
	}
        
                    public void initializeLocales(){
                        //Lake of rage
                        String name = "Lake of Rage";
                        Badge tempBadge = new Badge("Scale Badge");
                        Pokemon p1 = new Pokemon("Magikarp", "Shallow Water", 0.40, 0.5, 0.10, false);
                         Pokemon p2 = new Pokemon("Staryu", "Very Deep Water", 0.15, 0.1, 0.20, false);
                         Pokemon p3 = new Pokemon("Tentacool", "Deep Water", 0.2, 0.25, 0.20, false);
                         Pokemon rare = new Pokemon("Red Gyarados", "Very Deep Water", 0.1, 1.0, 0.0, true);
                         ArrayList<Pokemon> p = new ArrayList<>();
                         p.add(p1);
                         p.add(p2);
                         p.add(p3);
                         p.add(rare);
                         char[][] Grid = new char[][] {
		
		{ 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U'},
		{ 'U', 'U', 'U', 'V', 'V', 'V', 'V', 'V', 'V', 'U', 'U'},
		{ 'U', 'U', 'V', 'V', 'D', 'D', 'D', 'D', 'D', 'U', 'U'},
		{ 'U', 'U', 'V', 'D', 'S', 'S', 'T', 'S', 'D', 'V', 'U'},
		{ 'U', 'V', 'D', 'D', 'S', 'S', 'S', 'S', 'D', 'V', 'U'},
		{ 'U', 'V', 'S', 'S', 'S', 'P', 'S', 'D', 'D', 'V', 'U'},
		{ 'U', 'V', 'D', 'D', 'S', 'S', 'S', 'S', 'D', 'V', 'U'},
		{ 'U', 'V', 'D', 'D', 'D', 'S', 'D', 'D', 'D', 'V', 'U'},
		{ 'U', 'V', 'V', 'D', 'D', 'D', 'D', 'D', 'V', 'V', 'U'},
		{ 'U', 'U', 'U', 'V', 'V', 'V', 'V', 'V', 'L', 'U', 'U'},
		{ 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U'} };
                         
                      
                      Locale l = new Locale(name, tempBadge, p, Grid);
                      Locales.add(l);
                      System.out.println(Locales.get(0).getsLocaleName());
                    }
	
                    public void run(){                 
                        //Initial
                        int currentLocale = 0;
                        do{
                            Locales.get(currentLocale).showLocale();
                            
                        }while(true);
                    }
	
}