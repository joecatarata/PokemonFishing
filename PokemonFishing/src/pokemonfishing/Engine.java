/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonfishing;

/**
 * This class provides the layout for the engine of the boat in the game.
 * @author Michael Gerra-Clarin
 */
public class Engine {
    private String name;
    private double moveDeduction;
    // 1 = no deduction
    // 0.5 = 1/2 etc.
    public Engine(){
        name = "Basic Engine";
        moveDeduction = 1;
    }
    public Engine(String name, double deduc){
        this.name = name;
        moveDeduction = deduc;
    }
    /**
     * Specifies how much each move is deducted
     * @return A double data type.
     */
    public double getmoveDeduction(){
        return moveDeduction;
    }
}
