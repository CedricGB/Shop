
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private ArrayList<Item> items;
    private double totalIncome;

    public Shop(){
        this.items = new ArrayList<>();
        this.totalIncome = 0;
        createBaseShop();

    }

    public void createBaseShop(){

        this.items.add(new Item("Bubblegum", 2));
        this.items.add(new Item("Toffee", 0.2));
        this.items.add(new Item("Ice cream", 5));
        this.items.add(new Item("Milk chocolate", 4));
        this.items.add(new Item("Doughnut", 2.5));
        this.items.add(new Item("Pancake", 3.2));

    }

    public void addEarning(double[] price){

        System.out.println("Earned amount:");
        for(int i = 0; i < this.items.size();i++){
            this.items.get(i).setEarnedAmount(price[i]);
            this.totalIncome += price[i];
            System.out.println(this.items.get(i).earning());
        }
        System.out.println();
        System.out.println("Income: $" + this.totalIncome);
    }

    public void printPrice(){
        System.out.println("Prices:");
        for(Object item : this.items){
            System.out.println(item);
        }
    }

    public void staffExpense(){


        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Staff expenses:");
            this.totalIncome -= scanner.nextDouble();

            System.out.println("Other expenses:");
            this.totalIncome -= scanner.nextDouble();

        } catch (Exception e){
            System.out.println(e.fillInStackTrace());
        } finally {
            System.out.println("Net income: $" + this.totalIncome);
        }
    }
}