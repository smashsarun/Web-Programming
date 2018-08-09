/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sit.int303.mockup.model.Product;

/**
 *
 * @author INT303
 */
public class ShoppingCart implements Serializable { //อิมพลีเมนท์นี้ให้เขียนไฟล์ลงสตรีมได้

    private Map<String, LineItem> cart; //StringคือProductCode lineItemคือvalue

    public ShoppingCart() {
        cart = new HashMap();
    }

    public void add(Product p) { //เอาproductมาสร้างlineitem แล้วแอดเข้าcart
        LineItem line = cart.get(p.getProductCode()); //ขอดูว่า lineItem เป็นอย่างไร
        if (line == null) { //เอา lineItem มาเช็คว่ามีไหม
            //ดูของเดิมถ้าไม่มีก็ไปสร้าง ถ้ามีก็ไปขอดูว่ามีเท่าไรและบวก1
            cart.put(p.getProductCode(), new LineItem(p));
        } else{
            line.setQuantity(line.getQuantity()+1);
        }
    }
    
    public void remove(Product p){
        this.remove(p.getProductCode()); 
    }
    
    public void remove(String productCode){
        cart.remove(productCode);
    }
    
    public double getTotalPrice(){
        double sum = 0;    
        Collection<LineItem> lineItems = cart.values(); //return เป็น collection ของ lineItems
        for (LineItem lineItem : lineItems) {
            sum+=lineItem.getTotalPrice();
        }
        return sum;        
    }
    
    public int getTotalQuantity(){
        int sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum+=lineItem.getQuantity();
        }
        return sum;
    }
    
    public List<LineItem> getLineItems(){
        return new ArrayList(cart.values());
    }
}
