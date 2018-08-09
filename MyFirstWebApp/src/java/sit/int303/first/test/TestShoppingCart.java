package sit.int303.first.test;

import java.util.List;
import sit.int303.first.model.LineItem;
import sit.int303.first.model.ShoppingCart;
import sit.int303.mockup.model.Product;

public class TestShoppingCart {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p = new Product();
        p.setProductCode("S10_001");
        p.setProductName("Harley");
        p.setMsrp(100.0);

        cart.add(p);

        p = new Product();
        p.setProductCode("S10_002");
        p.setProductName("Honda");
        p.setMsrp(15.0);

        cart.add(p);
        cart.add(p);
        cart.add(p);
        List<LineItem> lines = cart.getLineItems();
        for (LineItem line : lines) {
            System.out.printf("%-8s %-15s %8.2f %2d %10.2f\n",
                    line.getProduct().getProductCode(),line.getProduct().getProductName(),
                    line.getSalePrice(),line.getQuantity(),line.getTotalPrice()); //เป็นรูปแบบการแสดงของ prinf กำหนดได้
        }

        System.out.println("Total price: " + cart.getTotalPrice());
        System.out.println("Total quantity: " + cart.getTotalQuantity());

        cart.remove("S10_001");

        System.out.println("--------------------");
        System.out.println("Total price: " + cart.getTotalPrice());
        System.out.println("Total quantity: " + cart.getTotalQuantity());

        cart.remove(p); //ลบทุกอย่างที่มี product code ตรงกัน
        System.out.println("--------------------");
        System.out.println("Total price: " + cart.getTotalPrice());
        System.out.println("Total quantity: " + cart.getTotalQuantity());
    }

}
