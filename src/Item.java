
public class Item {
    private String name;
    private double price;
    private double earnedAmount;




    public Item(String name, double price){
        assert (price > 0.0) : "Price can't be under 0";
        assert (name != null) : "Name can't be null";
        assert (name.length() < 255) : "Name can't be to long";
        this.name = name;
        this.price = price;
        this.earnedAmount = 0;


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEarnedAmount() {
        return earnedAmount;
    }

    public void setEarnedAmount(double earnedAmount) {
        this.earnedAmount = earnedAmount;
    }

    @Override
    public String toString(){
        return this.name + ": $" + this.price;
    }

    public String earning(){
        return this.name + ": $" + this.earnedAmount;
    }

}