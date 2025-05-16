package bill;

import java.util.Scanner;

public class Main {
    

    public static void main (String[] args){ 


        System.out.println("------------------------Welcome to Pizzamania-----------------------\n");
        System.out.println("Which pizza: (1. Veg Pizaa   2.Non Veg Pizza  3.Delux Veg Pizza  4.Delux Non-Veg Pizza)===>");
        Scanner sc =new Scanner(System.in);
        int ch =sc.nextInt();

        switch(ch) {
            case 1 -> {
                Pizza vegPizza = new Pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
            }
    
            case 2 -> {
                Pizza nonvegPizza = new Pizza(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeAway();
                nonvegPizza.getBill();
            }

            case 3 -> {
                DeluxPizza veg = new DeluxPizza(true);
                veg.basePizzaPrice=550;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
            }
    
            case 4 -> {
                DeluxPizza nonveg =new DeluxPizza(false);
                nonveg.basePizzaPrice=650;
                nonveg.addExtraCheese();
                nonveg.addExtraToppings();
                nonveg.takeAway();
                nonveg.getBill();
            }

            default -> {
                System.out.println("Sorry Enter again!!!!!");
                return;
            }
        }
        sc.close();
    }


}