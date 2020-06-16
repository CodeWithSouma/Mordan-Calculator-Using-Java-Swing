
package swing.calculator;

import java.util.Scanner;
/**
 *
 * @author Soumadip Dey 
 * B.Tech in C.S.E(Techno India).
 * Address:-Antira,Uchalan,Burdwan,713427
 * Phone:-8768454982
 * Email:-souma.hitech@gmail.com
 * 
 * 
 */

public class Main {
    public static void main(String[] args) {
        //double numberOne;
        //double numberTwo;
        
       String numberOne;
       String numberTwo;
          
        Calculate calculate=new Result();
        Scanner scanner=new Scanner(System.in);
     /*   while(true){
            
        System.out.println("Enter Two number: ");
        numberOne=scanner.nextDouble();
        numberTwo=scanner.nextDouble();
        System.out.println("sum:"+calculate.addition(numberOne, numberTwo));
        System.out.println("subtraction:"+calculate.subtraction(numberOne, numberTwo));
        System.out.println("multiplication:"+calculate.multiplication(numberOne, numberTwo));
        System.out.println("divition:"+calculate.divition(numberOne, numberTwo));
        System.out.println("Do you want to contiue: (Y/N): ");
        if((scanner.next().equalsIgnoreCase("N"))){
            break;
        }
            System.out.println("");
        
        }*/
        
           /*     while(true){
            
        System.out.println("Enter Two number: ");
        numberOne=scanner.next();
        numberTwo=scanner.next();
        System.out.println("sum:"+calculate.addition(numberOne, numberTwo));
        System.out.println("subtraction:"+calculate.subtraction(numberOne, numberTwo));
        System.out.println("multiplication:"+calculate.multiplication(numberOne, numberTwo));
        System.out.println("divition:"+calculate.divition(numberOne, numberTwo));
        System.out.println("Do you want to contiue: (Y/N): ");
        if((scanner.next().equalsIgnoreCase("N"))){
            break;
        }
            System.out.println("");
        
        }*/
       
 
//      UI ui=new UserInterface();
//      ui.UI();
          
        System.out.println("enter a numbr: ");
        System.out.println(calculate.percentage(scanner.next()));;
        
    }
    
}
