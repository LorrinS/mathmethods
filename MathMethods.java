import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MathMethods extends JFrame {

	private JPanel contentPane;
	private JTextField txtIn;
	static double temp;
	static String in;
	private JTextField txtOut;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathMethods frame = new MathMethods();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MathMethods() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMathMethods = new JLabel("Math Methods");
		lblMathMethods.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMathMethods.setBounds(163, 11, 126, 36);
		contentPane.add(lblMathMethods);
		
		txtIn = new JTextField();
		txtIn.setBounds(163, 58, 86, 20);
		contentPane.add(txtIn);
		txtIn.setColumns(10);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setBounds(121, 61, 46, 14);
		contentPane.add(lblInput);
		
		JLabel lblError = new JLabel("New label");
		lblError.setBounds(84, 190, 46, 14);
		contentPane.add(lblError);
		
		JButton btnRound = new JButton("Round");
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//////////////////////////
				in = txtIn.getText();
				if(inCheck(in)) {
					temp = Double.parseDouble(in);
					temp = Math.round(temp);
					txtOut.setText(""+temp);
				}
				else {
					lblError.setText("Error: Incorrect input. Please try again.");
				}
			}
		});
		btnRound.setBounds(23, 120, 89, 23);
		contentPane.add(btnRound);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
 ////////////////////////
            	in = txtIn.getText();
				if(inCheck(in)) {
					temp = Double.parseDouble(in);
					temp = Math.sqrt(temp);
					txtOut.setText(""+temp);
				}
				else {
					lblError.setText("Error: Incorrect input. Please try again.");
				}
            }
        });
		btnSqrt.setBounds(163, 154, 89, 23);
		contentPane.add(btnSqrt);
		
		JButton btnCeiling = new JButton("Ceiling");
		btnCeiling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
/////////////////////////
            	in = txtIn.getText();
				if(inCheck(in)) {
					temp = Double.parseDouble(in);
					temp = Math.ceil(temp);
					txtOut.setText(""+temp);
				}
				else {
					lblError.setText("Error: Incorrect input. Please try again.");
				}
            }
        });
		btnCeiling.setBounds(301, 86, 89, 23);
		contentPane.add(btnCeiling);
		
		JButton btnFloor = new JButton("Floor");
		btnFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
////////////////////////
            	in = txtIn.getText();
				if(inCheck(in)) {
					temp = Double.parseDouble(in);
					temp = Math.floor(temp);
					txtOut.setText(""+temp);
				}
				else {
					lblError.setText("Error: Incorrect input. Please try again.");
				}
            }
        });
		btnFloor.setBounds(301, 120, 89, 23);
		contentPane.add(btnFloor);
		
		JButton btnRandom = new JButton("Random");
		btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
///////////////////////
            	in = txtIn.getText();
				if(inCheck(in)) {
					temp = Double.parseDouble(in);
					temp = Math.random()*temp;
					txtOut.setText(""+temp);
				}
				else {
					lblError.setText("Error: Incorrect input. Please try again.");
				}
            }
        });
		btnRandom.setBounds(23, 86, 89, 23);
		contentPane.add(btnRandom);
		
		JButton btnAdd5 = new JButton("add 5");
		btnAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
///////////////////////
            	in = txtIn.getText();
				if(inCheck(in)) {
					temp = Double.parseDouble(in);
					add5();
					txtOut.setText(""+temp);
				}
				else {
					lblError.setText("Error: Incorrect input. Please try again.");
				}
            }
        });
		btnAdd5.setBounds(163, 86, 89, 23);
		contentPane.add(btnAdd5);
		
		JButton btnDouble = new JButton("double");
		btnDouble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//////////////////////
				in = txtIn.getText();
				if(inCheck(in)) {
					temp = Double.parseDouble(in);
					temp = times2(temp);
					txtOut.setText(""+temp);
				}
				else {
					lblError.setText("Error: Incorrect input. Please try again.");
				}
			}
		});
		btnDouble.setBounds(163, 120, 89, 23);
		contentPane.add(btnDouble);
		
		txtOut = new JTextField();
		txtOut.setBounds(163, 212, 86, 20);
		contentPane.add(txtOut);
		txtOut.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(121, 215, 46, 14);
		contentPane.add(lblOutput);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(335, 227, 89, 23);
		contentPane.add(btnExit);

		btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
	}
	public static void add5(){
		temp+=5;
	}
	public static double times2(double x) {
		x*=2;
		return x;
	}
	 private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
	        // TODO add your handling code here:
	        System.exit(0); // Exit the application.
	    }//GEN-LAST:event_btnExitActionPerformed
	    static public boolean inCheck(String in){
	    	Double temp = .0;
	    	try {
	    		temp = Double.parseDouble(in);
	    		if(temp>=0 && temp <=1000) {
	    		return true;
	    		}
	    		else {
	    			return false;
	    		}
	    	}
	    	catch (Exception e ) {
	    		return false;
	    	}
	    }
}
