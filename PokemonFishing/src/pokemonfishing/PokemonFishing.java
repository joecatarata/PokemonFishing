/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonfishing;

import java.util.Scanner;

/**
 *
 * @author joe
 */
public class PokemonFishing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name, Fisherman!: ");
            String name = sc.nextLine();
            Game mainGame = new Game(name);
            mainGame.run();
    }
    
}
