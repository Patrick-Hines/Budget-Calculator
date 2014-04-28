package budgetcalculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserInterface extends JFrame {

	// Create visual components
	JLabel instructionsLbl;
	JLabel essentialsLbl;
	JLabel essentialsAmount;
	JLabel savingsLbl;
	JLabel savingsAmount;
	JLabel personalSpendingLbl;
	JLabel personalSpendingAmount;

	JButton closeBtn;
	JButton enterAmountBtn;

	JPanel buttonPanel;
	JPanel outputPanel;
	JPanel instructionsPanel;

	public UserInterface() {

		instructionsLbl = new JLabel(
				"Begin by clicked the 'Enter Amount' button below.");

		essentialsLbl = new JLabel("Essentials Amount:", JLabel.RIGHT);
		essentialsAmount = new JLabel("$0.00 USD", JLabel.CENTER);
		personalSpendingLbl = new JLabel("Personal Spending Amount:",
				JLabel.RIGHT);
		personalSpendingAmount = new JLabel("$0.00 USD", JLabel.CENTER);
		savingsLbl = new JLabel("Savings Amount:", JLabel.RIGHT);
		savingsAmount = new JLabel("$0.00 USD", JLabel.CENTER);

		closeBtn = new JButton("Close Application");
		enterAmountBtn = new JButton("Enter Amount");

		buttonPanel = new JPanel();
		outputPanel = new JPanel();
		instructionsPanel = new JPanel();

		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		instructionsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		outputPanel.setLayout(new GridLayout(3, 2));

		instructionsPanel.add(instructionsLbl);

		outputPanel.add(essentialsLbl);
		outputPanel.add(essentialsAmount);
		outputPanel.add(personalSpendingLbl);
		outputPanel.add(personalSpendingAmount);
		outputPanel.add(savingsLbl);
		outputPanel.add(savingsAmount);

		buttonPanel.add(enterAmountBtn);
		buttonPanel.add(closeBtn);

		this.setLayout(new BorderLayout());
		this.add(instructionsPanel, BorderLayout.NORTH);
		this.add(outputPanel, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);

	}
}
