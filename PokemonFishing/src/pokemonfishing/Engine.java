/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonfishing;

/**
 *
 * @author joe
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
}
