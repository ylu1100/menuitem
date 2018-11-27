public class Sandwich implements Menuitem {
    private String Name;
    private double price;
    public Sandwich(double price,String name){
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
