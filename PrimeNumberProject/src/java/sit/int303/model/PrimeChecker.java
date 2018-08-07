/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.model;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class PrimeChecker {
    private int number;
    
    public String getResult(){
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return "This isn't prime number";                    
                }
            }
            return "This is prime number";
        }
        return "This isn't prime number";
    }

    @Override
    public String toString() {
        return "num=" + number + "\n" +getResult();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        this.number = num;
    }
    
    
}
