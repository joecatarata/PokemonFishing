package pokemonfishing;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Math;

public class Game {

	private Fisherman player;
	private ArrayList<Locale> Locales;
                     private char currentTile;
                     private int currentLocale;
                     public Game(){}
                     public Game(String name){
                         
                         Locales = new ArrayList<>();
                         player  =  new Fisherman(name);
                         initializeLocales();
                         currentLocale = 0;
                         currentTile = ' ';
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
                        char choice;
                        currentTile = 'P';
                        player.setPlayerXpos( Locales.get(currentLocale).getPort().getPortXpos());
                        player.setPlayerYpos( Locales.get(currentLocale).getPort().getPortYpos());
                        Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                        do{
                            
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Use WASD to move");
                            Locales.get(currentLocale).showLocale();
                            System.out.println("Greetings " + player.getsPlayerName()+"!");
                            System.out.print("Enter your choice! (Enter M to show menu): ");
                            choice = sc.next().charAt(0);
                            checkChoice(choice);
                            System.out.println("Press enter to continue...");
                            sc.nextLine(); sc.nextLine();
                            
                        }while(true);
                        
                    }
                    
                    public void  checkChoice(char choice){
                        switch(choice){
                            case 'M': showMenu();
                                            break;
                            case 'E': System.exit(1);
                                            break;
                            case 'w':
                            case 'W': 
                                            
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerYpos(player.getPlayerYpos()-1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            break;
                            case 'a':
                            case 'A': 
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerXpos(player.getPlayerXpos()-1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            break;    
                            case 's':
                            case 'S': 
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerYpos(player.getPlayerYpos()+1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            break;         
                            case 'd':
                            case 'D': 
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerXpos(player.getPlayerXpos()+1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            break;                
                        }
                    }
                    public void showMenu(){
                        System.out.println("----Menu----");
                        System.out.println("[1] Transfer Locale");
                        System.out.println("[E] Exit game");
                        
                    }
                    
                    
	
}