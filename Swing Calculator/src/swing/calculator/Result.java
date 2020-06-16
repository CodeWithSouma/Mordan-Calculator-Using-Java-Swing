
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

public class Result implements Calculate{
    

    @Override
    public String addition(double numberOne, double numberTwo) {
        return Double.toString(numberOne+numberTwo);
    }

    @Override
    public String subtraction(double numberOne, double numberTwo) {
     return Double.toString(numberOne-numberTwo);
    }

    @Override
    public String multiplication(double numberOne, double numberTwo) {
     return Double.toString(numberOne*numberTwo);
    }

    @Override
    public String divition(double numberOne, double numberTwo) {
         return Double.toString(numberOne/numberTwo);
    }

    @Override
    public String addition(String numberOne, String numberTwo) {
       return  Double.toString(Double.parseDouble(numberOne)+Double.parseDouble(numberTwo));
        
    }

    @Override
    public String subtraction(String numberOne, String numberTwo) {
        return Double.toString(Double.parseDouble(numberOne)-Double.parseDouble(numberTwo));
    }

    @Override
    public String multiplication(String numberOne, String numberTwo) {
        return Double.toString(Double.parseDouble(numberOne)*Double.parseDouble(numberTwo));
    }

    @Override
    public String divition(String numberOne, String numberTwo) {
        return Double.toString(Double.parseDouble(numberOne)/Double.parseDouble(numberTwo));
    }

    @Override
    public String percentage(String number) {
        return Double.toString(Double.parseDouble(number)/100.0);
    }
    
   
    
}
