package chapter10;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Andrew Behncke
 * 
 * Bank application as described in Programming Exercise 10.9
 * 
 */

public class Exercise9 {
	
	static JFrame frame;
	static JButton btnDeposit, btnWithdraw;
	static JLabel lblMoney;
	static JTextField input;
	static double money;

	public static void main(String[] args) {
		initFrame();
	}
	
	public static void deposit(double x) {
		money += x;
		lblMoney.setText("Balance: $" + money);
	}
	
	public static void withdraw(double x) throws Exception {
		if (money - x < 0) {
			throw new Exception("You're Broke");
		} else {
			money -= x;
			lblMoney.setText("Balance: $" + money);
		}
	}
	
	public static void initFrame() {
		// JFrame
		frame = new JFrame();
		frame.setSize(300, 105);
		frame.setTitle("Bank");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Buttons
		btnDeposit = new JButton("Deposit");
		btnDeposit.setPreferredSize(new Dimension(125, 20));
		btnDeposit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					deposit(Double.parseDouble(input.getText()));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Be sure input is valid number", "Warning: " + e.getMessage(), JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
		btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setPreferredSize(new Dimension(125, 20));
		btnWithdraw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					withdraw(Double.parseDouble(input.getText()));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Be sure input is valid number", "Warning: " + e1.getMessage(), JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Be sure input is valid number", "Warning: " + e1.getMessage(), JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
		
		// Label
		lblMoney = new JLabel("Balance: $" + money);
		
		// Text Field
		input = new JTextField(20);
		
		// JPanel
		JPanel panel = new JPanel();
		panel.add(input);
		panel.add(btnDeposit);
		panel.add(btnWithdraw);
		panel.add(lblMoney);
		
		frame.add(panel);
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
