package pokemonfishing;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;
/**
 * This class handles the whole game loop.
 * @author Michael Gerra-Clarin
 */
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
	
                     /**
                      * Retrieves the main player .
                      * @return a Fisherman class
                      */
	public Fisherman getFisherman() {
		return player;
	}
	
                    /**
                     *  Assings a fisherman to the main player.
                     * @param fisherman The main player.
                     */
	public void setFisherman(Fisherman fisherman) {
		player = fisherman;
	}
	/**
                    * Retrieves the list of locales available in the game.
                    * @return an ArrayList.
                    */
	public ArrayList<Locale> getLocale() {
		return Locales;
	}
	
                    /**
                     *  Assigns the game map to a preset map defined by locale.
                     * @param locale An ArrayList of Locales.
                     */
	public void setLocale(ArrayList<Locale> locale) {
		Locales = locale;
	}
                    /**
                     * This function initializes all available locals in the game.
                     * 
                     */
                    public void initializeLocales(){
                        //Lake of rage
                        String name = "Lake of Rage";
                        Badge tempBadge = new Badge("Scale Badge");
                        Pokemon p1 = new Pokemon("Magikarp", "Shallow Water", 0.40, 0.5, 0.10, false, 2);
                         Pokemon p2 = new Pokemon("Staryu", "Very Deep Water", 0.15, 0.1, 0.20, false,5);
                         Pokemon p3 = new Pokemon("Tentacool", "Deep Water", 0.2, 0.25, 0.20, false, 10);
                         Pokemon rare = new Pokemon("Red Gyarados", "T", 0.1, 1.0, 0.0, true, 0);
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
	/**
                    * Contains the game loop as well as handles inputs made by the user.
                    */
                    public void run(){                 
                        //Initial
                        boolean didNotMove = false;
                        Scanner sc = new Scanner(System.in);
                        char choice = '.';
                        backToPort();
                        Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                        do{
                            
                            if(player.getGear().getBoat().getnMoves() <= 0.0 || player.getGear().getTacklebox().getnCasts() <= 0){
                             System.out.println("You ran out of moves or  casts! Returning back to port for the next day...");
                                 backToPort();
                             System.out.println("Press enter to continue...");
                             sc.nextLine();
                            }

                            if(currentTile == 'P' && choice != '.' && !didNotMove){
                                System.out.println("You went back to port! Advancing to the next day...");
                                FishingDay += 1;
                                backToPort();
                                System.out.println("Press enter to continue...");
                                  sc.nextLine();
                            }
   
                            Locales.get(currentLocale).showLocale();
                            System.out.println("Greetings " + player.getsPlayerName()+"!");
                            System.out.println("Moves left: " + player.getGear().getBoat().getnMoves());
                            System.out.println("Casts left: "+ player.getGear().getTacklebox().getnCasts());
                            System.out.println("Use WASD to move");
                            System.out.println("Fishing Day: " + FishingDay);
                            System.out.print("Enter your choice! (Enter M to show menu): ");

                            choice = sc.next().charAt(0);
                            didNotMove = checkChoice(choice);
                            System.out.println("Press enter to continue...");
                            sc.nextLine(); sc.nextLine();
                            
                        }while(true);
                        
                    }
                    /**
                     * Processes the choice of the user if it is available.
                     * @param choice
                     * @return A boolean value which checks if the choice is a movement command or not.
                     */
                    public boolean  checkChoice(char choice){
                        int newPos;
                        char checkTile;
                        switch(choice){
                            case 'm':
                            case 'M': showMenu();
                                                return true;
                                            
                            case 'E': System.exit(1);
                                            break;
                            case 'b':
                            case 'B': showStats();
                                       return true;
                            case 'w':
                            case 'W':
                                            newPos = player.getPlayerYpos()-1;
                                            checkTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(), newPos);
                                            if(checkTile == 'U' || (checkTile == 'T' && player.getCurrentLocaleFame()<= 100)){
                                                     System.out.println("You can't go there");
                                                     return false;
                                            }
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());

                                            player.setPlayerYpos(player.getPlayerYpos()-1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;
                            case 'a':
                            case 'A': 
                                            newPos = player.getPlayerXpos()-1;
                                            checkTile = Locales.get(currentLocale).getIconAtIndex(newPos, player.getPlayerYpos());
                                            if(checkTile == 'U' || (checkTile == 'T' && player.getCurrentLocaleFame()<= 100)){
                                                     System.out.println("You can't go there");
                                                     return false;
                                            }
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerXpos(player.getPlayerXpos()-1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;    
                            case 's':
                            case 'S': 
                                    
                                            newPos = player.getPlayerYpos()+1;
                                            checkTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(), newPos);
                                            if(checkTile == 'U' || (checkTile == 'T' && player.getCurrentLocaleFame()<= 100)){
                                                     System.out.println("You can't go there");
                                                     return false;
                                            }
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerYpos(player.getPlayerYpos()+1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;         
                            case 'd':
                            case 'D': 
                                            newPos = player.getPlayerXpos()+1;
                                            checkTile = Locales.get(currentLocale).getIconAtIndex(newPos, player.getPlayerYpos());
                                            if(checkTile == 'U' || (checkTile == 'T' && player.getCurrentLocaleFame()<= 100)){
                                                     System.out.println("You can't go there");
                                                     return false;
                                            }
                                            Locales.get(currentLocale).setTile(currentTile, player.getPlayerXpos(), player.getPlayerYpos());
                                            player.setPlayerXpos(player.getPlayerXpos()+1);
                                            currentTile = Locales.get(currentLocale).getIconAtIndex(player.getPlayerXpos(),  player.getPlayerYpos());
                                            Locales.get(currentLocale).setTile(player.getIcon(), player.getPlayerXpos(), player.getPlayerYpos());
                                            player.getGear().getBoat().reducenMoves(player.getGear().getBoat().getEngine().getmoveDeduction());
                                            break;                
                            case 'c':
                            case 'C':
                                            if(currentTile == 'P')
                                                System.out.println("You can't cast in a port silly!"); 
                                            else{
                                                cast();
                                            }
                                           return true;
                        }
                        return false;
                    }
                    
                    /**
                     * Handles the casting of the rod of the player to the water.
                     */
                    public void cast(){
                        double encounterChance = Math.random();
                        double captureChance;
                        Scanner sc = new Scanner(System.in);
                        ArrayList<Pokemon> pokemonInLocale = Locales.get(currentLocale).getPokemonInLocale();
                        boolean encountered = false;
                        
                        for(int i =0; i<pokemonInLocale.size(); i++){
                            double lureErate = player.getGear().getRod().getLure().getfLureAddedERate();
                            double reelErate = player.getGear().getRod().getReel().getfReelAddedERate();
                            double lineErate = player.getGear().getRod().getLine().getfLineAddedERate();
                            double totalEncounterRate = pokemonInLocale.get(i).getfEncounterRate() + lureErate+reelErate+lineErate;
                            double totalCaptureRate = pokemonInLocale.get(i).getfCatchRate();
                            if((encounterChance -= totalEncounterRate) < 0 && currentTile == pokemonInLocale.get(i).getsDepthEncountered().charAt(0)){
                                System.out.println("Encountered a wild " + pokemonInLocale.get(i).getsPokemonName() + "!!!");
                                System.out.println("Capture rate of  " + pokemonInLocale.get(i).getsPokemonName() + " is " + (pokemonInLocale.get(i).getfCatchRate()*100) + "%");
                                encountered = true;
                                System.out.print("Press any key to try and capture...");
                                sc.nextLine(); sc.nextLine();
                            }
                            
                            if(encountered){
                                captureChance = Math.random();
                                double lureCrate = player.getGear().getRod().getLure().getfLureAddedCRate();
                                double reelCrate = player.getGear().getRod().getReel().getfReelAddedCRate();
                                double lineCrate = player.getGear().getRod().getLine().getfLineAddedCRate();
                                if((captureChance -= totalCaptureRate+lureCrate+reelCrate+lineCrate) < 0){
                                    System.out.println("You captured the wild " + pokemonInLocale.get(i).getsPokemonName() +"!!");
                                    Pokemon p = pokemonInLocale.get(i);
                                    System.out.println("Added " + pokemonInLocale.get(i).getsPokemonName() + " to caught Pokemon!");
                                    double fameAdded = p.getnFameGiven() * 100;
                                    ArrayList<Pokemon> caughtPokemon = player.getCaughtPokemon();
                                    for(int j =0; j<caughtPokemon.size(); j++){
                                        if(p.getsPokemonName().equalsIgnoreCase(caughtPokemon.get(j).getsPokemonName()))
                                                fameAdded -= caughtPokemon.get(j).getFameDeduction();
                                    }
                                    System.out.println("Added "+ (int)fameAdded+" fame!");
                                    player.addFame((int)fameAdded);
                                    player.addCaughtPokemon(p);
                                    if(currentTile == 'T')
                                    {
                                        System.out.println("You captured a Legendary Pokemon!");
                                        Badge b = Locales.get(currentLocale).getBadge();
                                        System.out.println("You earned the  " + b.getsBadgeName() + "!!");
                                        player.addBadge(b);
                                    }
                                    
                                }
                                else{
                                    System.out.print("The wild "+  pokemonInLocale.get(i).getsPokemonName()+ " got away !!");
                                }                            
                                break;
                            }
                        }                       
                        if(!encountered){
                            System.out.println("Not even a nibble...");
                        }
                        player.cast();
                    }
                    
                    /**
                     * Transports the player back to the port of the locale as well as refreshing his TackleBox and Boat.
                     */
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
                    
                    /**
                     * Shows the commands (aside from movement) available in the game.
                     */
                    public void showMenu(){
                        System.out.println("----Menu----");
                        System.out.println("[C] Cast");
                        System.out.println("[B] Show your fisherman statistics");
                        System.out.println("[E] Exit game");
                        
                    }
                    
                    /**
                     * Displays the players current stats.
                     */
                    public void showStats(){
                        player.showStats();
                    }
                    
                    
	
}