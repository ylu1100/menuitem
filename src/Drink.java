public class Drink {
    private String Name;
    private double price;
    public Drink(double price,String name){
        this.Name = name;
        this.price = price;
    }
    public String getName(){
        return Name;
    }
    public double getPrice(){
        return price;
    }
}
