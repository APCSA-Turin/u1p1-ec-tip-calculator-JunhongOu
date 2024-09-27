package com.example.project;
import java.util.Scanner;

public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
        double totalTip;
        
        totalTip = Math.round(cost*percent)/100.0;
        double totalBill = cost + totalTip;
        double  totalCostPerPerson = (int)(totalBill/people*100) / 100.0; //Rounding learned from https://www.geeksforgeeks.org/java-math-round-method-example/
        double totalTipPerPerson = Math.round(totalTip/people * 100) / 100.0;
        double perCost = Math.round(cost/people * 100) / 100.0;
  
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + totalTip + "\n");
        result.append("Total Bill with tip: $" + totalBill + "\n");
        result.append("Per person cost before tip: $" + perCost + "\n");
        result.append("Tip per person: $" + totalTipPerPerson + "\n");
        result.append("Total cost per person: $" + totalCostPerPerson + "\n" );
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);

        return result.toString(); 
    }  
        public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
    
        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);
        String item = "a";
        String items = "";

    // the while loop condition is checked,
    // and if TRUE, runs the code inside.
    // when the code inside is done running, the condition is rechecked,
    // and the loop repeats as long as the condition remains TRUE.
    // when the condition becomes FALSE, it stops
        
        while (!items.equals("-1")) { //while loop begins until input = -1
        System.out.println("Enter an item name or type '-1' to finish:");
        item = scan.nextLine();
        if (item.equals("-1")){ //learned item.equals from Eric Lin
            break; //Stops the list
        }
        else{
            items = items + item + "\n"; //Amount of items increases overtime if input =/= -1
        }
    }

        System.out.println(calculateTip(people,percent,cost,items));
        scan.close();
    }
}
