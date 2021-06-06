package ex11.base;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();

        System.out.print("How many euros are you exchanging? ");
        float c_from = myApp.readInput();
        System.out.print("What is the exchange rate? ");
        float rate = myApp.readInput();

        String output = myApp.doMath(c_from,rate);
        myApp.displayOutput(output);


    }
    private float readInput(){
        return in.nextFloat();
    }
    private String doMath(float c_from, float rate){
        double c_to = c_from * rate;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return (int)c_from + " euros at an exchange rate of " + String.format("%.4f",rate) + " is\n" + df.format(c_to)+ " U.S. dollars.";
    }
    private void displayOutput(String output){
        System.out.println(output);
    }
}
