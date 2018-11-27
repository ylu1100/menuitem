public class Salad implements Menuitem{
    private String Name;
    private double price;
    public Salad(double price,String name){
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
