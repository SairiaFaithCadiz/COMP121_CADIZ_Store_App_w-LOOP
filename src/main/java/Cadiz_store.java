import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class Cadiz_store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("     ......................................      ");
        System.out.println("     .     Welcome to cadECE fastfood     .      ");
        System.out.println("     .          Here is our menu          .      ");
        System.out.println("     . 1. Fried Chicken w/ rice...P60.00  .      ");
        System.out.println("     . 2. Spaghetti...............P50.00  .      ");
        System.out.println("     . 3. Burger..................P30.00  .      ");
        System.out.println("     . 4. Fries...................P30.00  .      ");
        System.out.println("     . 5. Ice cream Sundae........P20.00  .      ");
        System.out.println("     ......................................      ");
        System.out.println("         IT IS OUR 1ST ANIVERSARY!!!!            ");
        System.out.println("          YOU CAN GET A 10% DISCOUNT             ");
        System.out.println("     ......................................      ");
        System.out.println("    BUT IF BUY  200 AND ABOVE WORTH OF ORDER      ");
        System.out.println("         YOU CAN GET A 20% DISCOUNT              ");
        System.out.println("     ......................................      ");

        
        int SumOfOrders = 0;
        int order;
        int number1=0,number2=0,number3=0,number4=0,number5=0;
        int Friedchicken=0,Spaghetti=0,Burger=0,Fries=0,Icecreamsundae=0;
        int finalorder = 0;
        int addorder = 0;
        
        
        do {
            System.out.println("            What' your order please?");
            System.out.println("       (just type the NUMBER of that order)");
            order = input.nextInt();
            
            switch (order){
                case 1:
                    System.out.println("     How many FRIED CHICKEN do you want");
                    number1 = input.nextInt();
                    finalorder = 60*number1;
                    System.out.println("     Your subtotal for this order is P"+finalorder);
                    System.out.println("     ......................................      ");
                    System.out.println("     *Do you still want to add you order?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addorder = input.nextInt();
                break;
                case 2:
                    System.out.println("        How many SPAGHETTI do you want");
                    number2 = input.nextInt();
                    finalorder = 50*number2;
                    System.out.println("     Your subtotal for this order is P"+finalorder);
                    System.out.println("     ......................................      ");
                    System.out.println("     *Do you still want to add you order?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addorder = input.nextInt();
                break;
                case 3:
                    System.out.println("          How many BURGER do you want");
                    number3 = input.nextInt();
                    finalorder = 30*number3;
                    System.out.println("     Your subtotal for this order is P"+finalorder);
                    System.out.println("     ......................................      ");
                    System.out.println("     *Do you still want to add you order?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addorder = input.nextInt();
                break;
                case 4:
                    System.out.println("          How many FRIES do you want");
                    number4 = input.nextInt();
                    finalorder = 30*number4;
                    System.out.println("     Your subtotal for this order is P"+finalorder);
                    System.out.println("     ......................................      ");
                    System.out.println("     *Do you still want to add you order?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addorder = input.nextInt();
                break;
                case 5:
                    System.out.println("     How many ICE CREAM SUNDAE do you want");
                    number5 = input.nextInt();
                    finalorder = 20*number5;
                    System.out.println("     Your subtotal for this order is P"+finalorder);
                    System.out.println("     ......................................      ");
                    System.out.println("     *Do you still want to add you order?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addorder = input.nextInt();
                break;
                
            }
            SumOfOrders += finalorder;
            Friedchicken += number1;
            Spaghetti += number2;
            Burger += number3;
            Fries += number4;
            Icecreamsundae += number5;
            
        } while (addorder == 1);
        
        System.out.println("     ......................................      ");
        System.out.println("              Here is your receipt               ");
        if (Friedchicken != 0) {System.out.println("       Fried Chicken w/ rice........."+Friedchicken+"pcs.");}
        if (Spaghetti != 0) {System.out.println("       Spaghetti....................."+Spaghetti+"pcs.");}
        if (Burger != 0) {System.out.println("       Burger........................"+Burger+"pcs.");}
        if (Fries != 0) {System.out.println("       Fries........................."+Fries+"pcs.");}
        if (Icecreamsundae != 0) {System.out.println("       Ice cream Sundae.............."+Icecreamsundae+"pcs.");}
        System.out.println("       TOTAL: P"+SumOfOrders);
        System.out.println("     ......................................      ");
        System.out.println("     Because you bought P"+SumOfOrders+" worth of order");
        
        if (SumOfOrders <= 200){
        System.out.println("        You will receive a 10% discount");
        double DiscountedTotal = SumOfOrders - (SumOfOrders*0.10) ;
        System.out.println("         You will only pay P" + DiscountedTotal);
        System.out.println("     ......................................      ");
        System.out.println("          Please enter your payment");
        double f = input.nextInt();
        System.out.println("     ......................................      ");
        System.out.println("             We received: P"+f);
        System.out.println("           Your change is P"+ (f-DiscountedTotal));
        System.out.println("         Thank you for ordering :)!"); }
        
        else if(SumOfOrders>=200){
        System.out.println("        You will receive a 20% discount");
        double DiscountedTotal = SumOfOrders - (SumOfOrders*0.20) ;
        System.out.println("         You will only pay P" + DiscountedTotal);
        System.out.println("     ......................................      ");
        System.out.println("          Please enter your payment");
        double f = input.nextInt();
        System.out.println("     ......................................      ");
        System.out.println("             We received: P"+f);
        System.out.println("           Your change is P"+ (f-DiscountedTotal));
        System.out.println("         Thank you for ordering :)!"); }
        }
        
        
    
        }
        
        
        
    

