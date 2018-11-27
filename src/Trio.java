public class Trio implements Menuitem{
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    public Trio(Sandwich sandwich,Salad salad,Drink drink){
        this.sandwich = sandwich;
        this.drink = drink;
        this.salad = salad;
    }
    public String getName(){
       return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
    }
    public double getPrice(){
        double price = 0;
        if (sandwich.getPrice()<salad.getPrice() && sandwich.getPrice()<drink.getPrice())
        {
            price = sandwich.getPrice();
        }
        else if (salad.getPrice()<drink.getPrice() && salad.getPrice() < sandwich.getPrice())
        {
            price = salad.getPrice();
        }
        else {
            price = drink.getPrice();
        }
        return sandwich.getPrice() + salad.getPrice() + drink.getPrice()- price;
    }
}
