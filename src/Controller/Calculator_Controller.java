package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.Calculator_View;
import Model.Calculator_Model;

public class Calculator_Controller implements ActionListener {
	private Calculator_View CCLV;
	
	public Calculator_Controller(Calculator_View CCLV) {
		this.CCLV = CCLV;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("1")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("2")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("3")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("4")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("5")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("6")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("7")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("8")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("9")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}else if(src.equals("0")) {
			this.CCLV.model.setChoose("!");
			this.CCLV.AddNumber("0");
		}else if(src.equals("+")) {
			this.CCLV.Calculate();
			this.CCLV.model.setSign_Choose("+");
			this.CCLV.model.setChoose("!");
		}else if(src.equals("-")) {
			this.CCLV.Calculate();
			this.CCLV.model.setSign_Choose("-");
			this.CCLV.model.setChoose("!");
		}else if(src.equals("*")) {
			this.CCLV.Calculate();
			this.CCLV.model.setSign_Choose("*");
			this.CCLV.model.setChoose("!");
		}else if(src.equals("/")) {
			this.CCLV.Calculate();
			this.CCLV.model.setSign_Choose("/");
			this.CCLV.model.setChoose("!");
		}else if(src.equals("CE")) {
			this.CCLV.model.setChoose("");
			this.CCLV.DeleteNumber();
		}else if(src.equals("AC")) {
			this.CCLV.model.setChoose("");
			this.CCLV.DeleteAll();
		}else if(src.equals("=")) {
			this.CCLV.Calculate();
			this.CCLV.model.setChoose("+");
		}else if(src.equals(".")) {
			this.CCLV.AddNumber(src);
			this.CCLV.model.setChoose("");
		}
		
	}

}
