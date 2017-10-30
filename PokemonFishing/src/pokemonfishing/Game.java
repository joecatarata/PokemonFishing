package pokemonfishing;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Math;

public class Game {

	private Fisherman player;
                     private int FishingDay;
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
                         FishingDay = 1;
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
                        Scanner sc = new Scanner(System.in);
                        char choice = '\'';
                        backToPort();
                        Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                        do{
                            
                            if(player.getGear().getBoat().getnMoves() <= 0.0){
                             System.out.println("You ran out of moves! Returning back to port for the next day...");
                                 backToPort();
                             System.out.println("Press enter to continue...");
                             sc.nextLine();
                            }

                            if(currentTile == 'P' && choice != '\''){
                                System.out.println("You went back to port! Advancing to the next day...");
                                FishingDay += 1;
                                backToPort();
                                System.out.println("Press enter to continue...");
                                  sc.nextLine();
                            }
   
                            Locales.get(currentLocale).showLocale();
                            System.out.println("Greetings " + player.getsPlayerName()+"!");
                            System.out.println("Moves left: " + player.getGear().getBoat().getnMoves());
                            System.out.println("Use WASD to move");
                            System.out.println("Fishing Day: " + FishingDay);
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
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;
                            case 'a':
                            case 'A': 
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerXpos(player.getPlayerXpos()-1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;    
                            case 's':
                            case 'S': 
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerYpos(player.getPlayerYpos()+1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;         
                            case 'd':
                            case 'D': 
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerXpos(player.getPlayerXpos()+1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;                
                        }
                    }
                    
                    public void backToPort(){
                        
                        String boatName = player.getGear().getBoat().getsBoatName();
                        
                        if(boatName.equalsIgnoreCase("Starting Boat"))
                            player.getGear().getBoat().setnMoves(5.0);
                        if(boatName.equalsIgnoreCase("Speed Boat"))
                            player.getGear().getBoat().setnMoves(10.0);
                        if(boatName.equalsIgnoreCase("Sharpedo Boat"))
                            player.getGear().getBoat().setnMoves(15.0);
                        if(boatName.equalsIgnoreCase("Lapras"))
                            player.getGear().getBoat().setnMoves(25.0);
                        
                        String boxName = player.getGear().getTacklebox().getsTackleboxName();
                        if(boxName.equalsIgnoreCase("Basic Tackle Box"))
                            player.getGear().getTacklebox().setnCasts(5);
                        if(boxName.equalsIgnoreCase("Good Tackle Box"))
                            player.getGear().getTacklebox().setnCasts(8);
                        if(boxName.equalsIgnoreCase("Super Tackle Box"))
                            player.getGear().getTacklebox().setnCasts(10);
                        if(boxName.equalsIgnoreCase("Master Tackle Box"))
                            player.getGear().getTacklebox().setnCasts(15);
                        
                        
                        Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                        currentTile = 'P';
                        player.setPlayerXpos( Locales.get(currentLocale).getPort().getPortXpos());
                        player.setPlayerYpos( Locales.get(currentLocale).getPort().getPortYpos());
                        Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                            
                        
                    }
                    public void showMenu(){
                        System.out.println("----Menu----");
                        System.out.println("[1] Cast");
                        System.out.println("[E] Exit game");
                        
                    }
                    
                    
	
}