package facademethod;

import java.util.Scanner;

public class Main {
	
	private static int  choice;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do{       
            System.out.print("*************WELCOME TO THE CANDY STORE!!*******************\n");  
            System.out.print("            1. Godiva.              \n");  
            System.out.print("            2. DairyMilk.              \n");  
            System.out.println("            3. EXIT.                    \n");
            System.out.print("Enter your choice: (from 1-3)");  
            choice = sc.nextInt();  
            CandySeller cs = new CandySeller();  
            switch (choice) {  
            case 1:  
                {   
                  cs.godivaSale();  
                    }  
                break;  
       case 2:  
                {  
                  cs.dairymilkSale();        
                    }  
                break;    
            default:  
            {    
                System.out.println("Thankyou!!!");  
            }         
                return;  
            }  
              
      }while(choice!=3);  
   }
		
	}
