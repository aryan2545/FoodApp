package com.foodapp;
import com.foodapp.*;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws SQLException {
		  Scanner sc = new Scanner(System.in);
	        UserService us= new UserService();
	        Menuservice ms = new Menuservice();
	        Orderservice os = new Orderservice();
int userid=1;
System.out.println("welcome Online Food Delivery App");

	        while (true) {
	        	      
	                    System.out.println("\n1. View Menu\n2. Place Order\n3. View Orders\n4. Cancel Order\n5.Exit");
                        System.out.println("\nEnter Your choice: ");  
	                    int option = sc.nextInt();
	                        sc.nextLine();

	                        switch (option) {
	                            case 1 : ms.displayMenu();break;
	                            case 2 : os.placeOrder(sc, userid); break;
	                            case 3 : os.viewOrder(userid); break;
	                            case 4 : os.cancelOrder(sc, userid);break;
	                            case 5: System.out.println("Thanks for Visiting");
	                           
	                            break;
	                            default :System.out.println("invalid choice !try Another choice");
	                        }
	                    }
	                }
	}
