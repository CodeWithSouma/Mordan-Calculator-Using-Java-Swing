
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
public class UserInterface implements UI{
    private Calculator calculator=new Calculator();//we use adapter design pattern
    @Override
    public void UI() {
        calculator.setVisible(true);

    }
    
}
