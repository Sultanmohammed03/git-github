package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum, secondnum, result;
	String operations, answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 292, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 258, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//************* Row 1
		
		JButton btnBackspace = new JButton("<-");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String backspace = null;
				
				if(textField.getText().length()>0) {
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				backspace = strB.toString();
				textField.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackspace.setBounds(10, 56, 60, 60);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(76, 56, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercentage.setBounds(142, 56, 60, 60);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnadd.setBounds(208, 56, 60, 60);
		frame.getContentPane().add(btnadd);
		
		//************* Row 2
		
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String  EnterNumber = textField.getText() + btn7.getText();
						textField.setText(EnterNumber);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn7.setBounds(10, 122, 60, 60);
				frame.getContentPane().add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn8.getText();
						textField.setText(EnterNumber);
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn8.setBounds(76, 122, 60, 60);
				frame.getContentPane().add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn9.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn9.setBounds(142, 122, 60, 60);
				frame.getContentPane().add(btn9);
				
				JButton btnsub = new JButton("-");
				btnsub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "-";
					}
				});
				btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnsub.setBounds(208, 122, 60, 60);
				frame.getContentPane().add(btnsub);

				//************* Row 3
				
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn4.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 188, 60, 60);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn5.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(76, 188, 60, 60);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn6.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(142, 188, 60, 60);
				frame.getContentPane().add(btn6);
				
				JButton btnmul = new JButton("*");
				btnmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "*";
					}
				});
				btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnmul.setBounds(208, 188, 60, 60);
				frame.getContentPane().add(btnmul);
				
				//************* Row 4
				
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 254, 60, 60);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(76, 254, 60, 60);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(142, 254, 60, 60);
				frame.getContentPane().add(btn3);
				
				JButton btndiv = new JButton("/");
				btndiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "/";
					}
				});
				btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btndiv.setBounds(208, 254, 60, 60);
				frame.getContentPane().add(btndiv);
				
				//************* Row 5
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btn0.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 320, 60, 60);
				frame.getContentPane().add(btn0);
				
				JButton btndot = new JButton(".");
				btndot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						String  EnterNumber = textField.getText() + btndot.getText();
						textField.setText(EnterNumber);
					}
				});
				
				btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btndot.setBounds(76, 320, 60, 60);
				frame.getContentPane().add(btndot);
				
				JButton btnaddsub = new JButton("+-");
				btnaddsub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
					double ops = Double.parseDouble(String.valueOf(textField.getText()));
					ops = ops * (-1);
					textField.setText(String.valueOf(ops));
					
					}
				});
				btnaddsub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnaddsub.setBounds(142, 320, 60, 60);
				frame.getContentPane().add(btnaddsub);
				
				JButton btnEqualto = new JButton("=");
				btnEqualto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
					String answer;
					secondnum = Double.parseDouble(textField.getText());
					if(operations == "+") {
						result = firstnum + secondnum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					
					else if(operations == "-") {
						result = firstnum - secondnum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					
					else if(operations == "*") {
						result = firstnum * secondnum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					
					else if(operations == "/") {
						result = firstnum / secondnum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					
					else if(operations == "%") {
						result = firstnum % secondnum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					}
				});
				btnEqualto.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqualto.setBounds(208, 320, 60, 60);
				frame.getContentPane().add(btnEqualto);
	}
}
