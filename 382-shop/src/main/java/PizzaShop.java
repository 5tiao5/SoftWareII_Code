import java.util.ArrayList;

public class PizzaShop extends Shop implements Nameable{
    String companyName;

    ArrayList<Item> foodOfferings = new ArrayList<Item>();
    public PizzaShop(){
        companyName = "Big Pizza";
        Item i1 = new Item("Pizza",1.0);
        Item i2 = new Item("Spaghetti",1.5);
        Item i3 = new Item("Garden Salad",2.0);
        Item i4 = new Item("Antipasto",2.5);
        Item i5 = new Item("Calzone",3.0);

        foodOfferings.add(i1);
        foodOfferings.add(i2);
        foodOfferings.add(i3);
        foodOfferings.add(i4);
        foodOfferings.add(i5);

        //todo:add code here
        //set the calculator
        calculator=new LinearTaxCalculator(0.15,0.1);
    }

    public ArrayList<Item> getInventory(){
        return foodOfferings;
    }
    public boolean buyInventory(String name){
        //todo:add code here
        boolean res=false;
        for(Item i:foodOfferings){
            if(i.getName().equals(name)){
                //foodOfferings.remove(i);
                income+=i.getPrice();
                res=true;
            }
        }
        return res;
    }
    public String getName(){
        //todo:add code here
        return companyName;
    }
    public void setName(String name){
        companyName = name;
    }
}
