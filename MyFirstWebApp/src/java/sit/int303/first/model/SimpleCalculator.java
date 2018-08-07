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
public class SimpleCalculator {

    private int x;
    private int y;
    private String operator;

    public int getResult() {
        if (operator.equals("+")) {
            return x + y;
        } else if (operator.equals("-")) {
            return x - y;
        } else if (operator.equals("*")) {
            return x * y;
        } else if (operator.equals("/")) {
            return x / y;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("x=%d , y=%d %d%s%d=%d",
                        x,y,x,operator,y,getResult());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}
