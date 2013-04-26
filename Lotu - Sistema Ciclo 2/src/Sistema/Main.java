package Sistema;
import Classes.*;
import Telas.*;

public class Main {
        /*
         * 
         * @author Rafael Zurawski
         * 
         */

	/**
	 * @param args
	 */
	public static void main(String[] args) 
        {
		// TODO Auto-generated method stub

		Cartao card = new  Cartao();

		System.out.println("teste");
		System.out.println(card.getValidade());
                
                TelaLogin login = new TelaLogin();
                login.setVisible(true);

	}

}
