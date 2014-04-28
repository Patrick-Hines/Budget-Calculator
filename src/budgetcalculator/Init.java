package budgetcalculator;

import javax.swing.JFrame;

public class Init {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserInterface window = new UserInterface();
		window.setTitle("Budget Calculator");
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setSize(425, 500);

	}

}
