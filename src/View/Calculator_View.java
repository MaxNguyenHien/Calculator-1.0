package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Calculator_Model;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Controller.Calculator_Controller;

public class Calculator_View extends JFrame {
	public Calculator_Model model;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_View frame = new Calculator_View();
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
	public Calculator_View() {
		this.model = new Calculator_Model();
		this.setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Calculator_Controller ac = new Calculator_Controller(this);
		
		JButton btn_Zero = new JButton("0");
		btn_Zero.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Zero.setBounds(10, 440, 85, 53);
		contentPane.add(btn_Zero);
		btn_Zero.addActionListener(ac);
		
		JButton btn_Dot = new JButton(".");
		btn_Dot.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Dot.setBounds(123, 440, 85, 53);
		contentPane.add(btn_Dot);
		btn_Zero.addActionListener(ac);
		
		JButton btn_Equal = new JButton("=");
		btn_Equal.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Equal.setBounds(235, 440, 191, 53);
		contentPane.add(btn_Equal);
		btn_Equal.addActionListener(ac);
		
		JButton btn_One = new JButton("1");
		btn_One.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_One.setBounds(10, 366, 85, 53);
		contentPane.add(btn_One);
		btn_One.addActionListener(ac);
		
		JButton btn_Two = new JButton("2");
		btn_Two.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Two.setBounds(123, 366, 85, 53);
		contentPane.add(btn_Two);
		btn_Two.addActionListener(ac);
		
		JButton btn_Three = new JButton("3");
		btn_Three.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Three.setBounds(235, 366, 85, 53);
		contentPane.add(btn_Three);
		btn_Three.addActionListener(ac);
		
		JButton btn_Division = new JButton("/");
		btn_Division.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Division.setBounds(341, 366, 85, 53);
		contentPane.add(btn_Division);
		btn_Division.addActionListener(ac);
		
		JButton btn_Four = new JButton("4");
		btn_Four.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Four.setBounds(10, 291, 85, 53);
		contentPane.add(btn_Four);
		btn_Four.addActionListener(ac);
		
		JButton btn_Five = new JButton("5");
		btn_Five.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Five.setBounds(123, 291, 85, 53);
		contentPane.add(btn_Five);
		btn_Five.addActionListener(ac);
		
		JButton btn_Six = new JButton("6");
		btn_Six.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Six.setBounds(235, 291, 85, 53);
		contentPane.add(btn_Six);
		btn_Six.addActionListener(ac);
		
		JButton btn_Multiplication = new JButton("*");
		btn_Multiplication.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Multiplication.setBounds(341, 291, 85, 53);
		contentPane.add(btn_Multiplication);
		btn_Multiplication.addActionListener(ac);
		
		JButton btn_Seven = new JButton("7");
		btn_Seven.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Seven.setBounds(10, 218, 85, 53);
		contentPane.add(btn_Seven);
		btn_Seven.addActionListener(ac);
		
		JButton btn_Eight = new JButton("8");
		btn_Eight.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Eight.setBounds(123, 218, 85, 53);
		contentPane.add(btn_Eight);
		btn_Eight.addActionListener(ac);
		
		JButton btn_Nine = new JButton("9");
		btn_Nine.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Nine.setBounds(235, 218, 85, 53);
		contentPane.add(btn_Nine);
		btn_Nine.addActionListener(ac);
		
		JButton btn_Subtraction = new JButton("-");
		btn_Subtraction.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Subtraction.setBounds(341, 218, 85, 53);
		contentPane.add(btn_Subtraction);
		btn_Subtraction.addActionListener(ac);
		
		JButton btn_AC = new JButton("AC");
		btn_AC.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_AC.setBounds(123, 143, 85, 53);
		contentPane.add(btn_AC);
		btn_AC.addActionListener(ac);
		
		JButton btn_CE = new JButton("CE");
		btn_CE.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_CE.setBounds(235, 143, 85, 53);
		contentPane.add(btn_CE);
		btn_CE.addActionListener(ac);
		
		JButton btn_Addition = new JButton("+");
		btn_Addition.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Addition.setBounds(341, 143, 85, 53);
		contentPane.add(btn_Addition);
		btn_Addition.addActionListener(ac);
		
		JRadioButton rdbtn_On = new JRadioButton("On");
		rdbtn_On.setSelected(true);
		rdbtn_On.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtn_On.setBounds(21, 143, 85, 33);
		contentPane.add(rdbtn_On);
		rdbtn_On.addActionListener(ac);
		
		JRadioButton rdbtn_Off = new JRadioButton("Off");
		rdbtn_Off.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtn_Off.setBounds(21, 178, 85, 33);
		contentPane.add(rdbtn_Off);
		rdbtn_Off.addActionListener(ac);
		
		ButtonGroup btn_On_Off = new ButtonGroup();
		btn_On_Off.add(rdbtn_Off);
		btn_On_Off.add(rdbtn_On);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(10, 36, 416, 80);
		textField.setText("");
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	public void AddNumber(String src) {
		if((this.model.getSign_Choose().equals("+") 
			|| this.model.getSign_Choose().equals("-")
			|| this.model.getSign_Choose().equals("*")
			|| this.model.getSign_Choose().equals("/")) && (this.model.getChoose().equals("!"))) {
			this.textField.setText("");
			this.textField.setText(this.textField.getText()+src);
			double jtf_value_1 = Double.valueOf(this.textField.getText());
			this.model.setNewValue(jtf_value_1);
		}  else if((this.model.getSign_Choose().equals("+") 
				|| this.model.getSign_Choose().equals("-")
				|| this.model.getSign_Choose().equals("*")
				|| this.model.getSign_Choose().equals("/")) && (this.model.getChoose().equals(""))) {
			this.textField.setText(this.textField.getText()+src);
			double jtf_value_1 = Double.valueOf(this.textField.getText());
			this.model.setNewValue(jtf_value_1);
		} else  {
			
				this.textField.setText(this.textField.getText()+src);
			
			double jtf_value_2 = Double.valueOf(this.textField.getText());
			if(this.model.getSign_Choose().equals("")) {
				this.model.setRootValue(jtf_value_2);
			}
		}
		
		
		
		
		
	}

	public void Calculate() {
		if(this.model.getSign_Choose().equals("+")) {
			this.model.setRootValue(this.model.getRootValue() + this.model.getNewValue());
			this.model.setNewValue(0);
		}else if(this.model.getSign_Choose().equals("-")) {
			this.model.setRootValue(this.model.getRootValue() - this.model.getNewValue());
			this.model.setNewValue(0);
		}else if(this.model.getSign_Choose().equals("*")) {
			this.model.setRootValue(this.model.getRootValue() * this.model.getNewValue());
			this.model.setNewValue(1);
		}else if(this.model.getSign_Choose().equals("/")) {
			this.model.setRootValue(this.model.getRootValue() / this.model.getNewValue());
			this.model.setNewValue(1);
		}
		
		String value = Double.toString(this.model.getRootValue());
		this.textField.setText(value);
	}

	public void DeleteAll() {
		this.textField.setText("");
		this.model.setChoose("");
		this.model.setSign_Choose("");
		this.model.setRootValue(0);
		this.model.setNewValue(0);
		
	}

	public void DeleteNumber() {
		// TODO Auto-generated method stub
		
	}
}
