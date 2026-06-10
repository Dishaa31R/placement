package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class product{
    String itemName;
    int itemPrice;
    public product(String itemName, int itemPrice) {
        //TODO Auto-generated constructor stub
    }
    public product() {
        //TODO Auto-generated constructor stub
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    @Override
    public String toString(){
        return itemName+" = "+itemPrice+"\n";
    }
}

public class DemoLambda {
    public static void pojoLambda(){
        product p1=new product();
        p1.itemName="HP Pavillion";p1.itemPrice=45000;
        product p2=new product();
        p2.itemName="Mac Book";
        p2.itemPrice=1200000;
        product p3=new product();
        p3.itemName="Dell Vostro";
        p3.itemPrice=610000;
        List<product> items=new ArrayList<>();
        items.add(p1);
        items.add(p2);
        items.add(p3);
        Collections.sort(items,(o1,o2)->o1.itemPrice-o2.itemPrice);
        System.out.print(items);

    }
    public static void main(String[] args) {
        List<Integer> alpha=new ArrayList<>();
        alpha.add(34);
        alpha.add(78);
        alpha.add(46);
        alpha.add(12);
        System.out.println(alpha);
        Collections.sort(alpha,(i1,i2)->i2-i1);
        System.out.println(alpha);
        pojoLambda();
    }
}
