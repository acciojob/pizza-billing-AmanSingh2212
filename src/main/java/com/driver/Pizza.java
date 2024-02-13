package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int pizzaPrice;
    private boolean extraCheeseAdded = false;
    private boolean extraToppingAdded = false;
    private boolean paperbag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price += 300;
            this.pizzaPrice += 300;
        }
        else{
            this.price += 400;
            this.pizzaPrice += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price += 80;
        this.extraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        this.price += 70;
        this.extraToppingAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        this.price += 20;
        this.paperbag = true;
    }

    public String getBill(){
        // your code goes here
        System.out.println("Base Price Of The Pizza:"+ this.pizzaPrice);

        if(this.extraCheeseAdded)
        {
            this.bill += "Extra Cheese Added:"+80 + "\n";
        }

        if(this.extraToppingAdded)
        {
            this.bill += "Extra Toppings Added:"+70+ "\n";
        }

        if(this.paperbag)
        {
            this.bill += "Paperbag Added:"+20+ "\n";
        }

        this.bill += "Total Price:"+this.price + "\n";

        return this.bill;
    }
}
