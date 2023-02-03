package Test;

import javax.swing.UIManager;

import Model.Calculator_Model;

import View.Calculator_View;

public class Calculator_Test {
	public static void main(String[] args) {
		
		try {
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new Calculator_View();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
