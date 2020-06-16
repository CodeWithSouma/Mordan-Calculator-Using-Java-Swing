
package swing.calculator;

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

public interface Calculate {
    
    //these are work with double
   public String addition(double numberOne,double numberTwo);
   public String subtraction(double numberOne,double numberTwo);
   public String multiplication(double numberOne,double numberTwo);
   public String divition(double numberOne,double numberTwo);
   
   //this are work with string
   //we use these method to build this project
   public String addition(String numberOne,String numberTwo);
   public String subtraction(String numberOne,String numberTwo);
   public String multiplication(String numberOne,String numberTwo);
   public String divition(String numberOne,String numberTwo);
   public String percentage(String number);
   
    
}
