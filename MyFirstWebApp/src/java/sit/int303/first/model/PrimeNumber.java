/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.model;

/**
 *
 * @author INT303
 */
public class PrimeNumber {
    private int number;
    
    public PrimeNumber(){
        
    }

    public PrimeNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public boolean isPrimeNumber(){
        boolean isPrime = number>1?true:false;
        for (int i = 2; i <= number/2; i++) {
            if (number%i==0) {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

}
