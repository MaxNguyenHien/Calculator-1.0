package Model;

public class Calculator_Model {
	private String sign_Choose = "";
	private String choose = "";
	private double rootValue;
	private double newValue;

	
	
	public String getSign_Choose() {
		return sign_Choose;
	}
	public void setSign_Choose(String sign_Choose) {
		this.sign_Choose = sign_Choose;
	}
	public double getRootValue() {
		return rootValue ;
	}
	public void setRootValue(double rootValue) {
		this.rootValue = rootValue;
	}
	public double getNewValue() {
		return newValue;
	}
	public void setNewValue(double newValue) {
		this.newValue = newValue;
	}
	
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}
	
	public void Sum () {
		this.rootValue = this.rootValue + this.newValue;
	}
	
	public void Minus () {
		this.rootValue = this.rootValue - this.newValue;
	}
	
	public void Mutiple () {
		this.rootValue = this.rootValue * this.newValue;
	}
	
	public void Divide () {
		this.rootValue = this.rootValue / this.newValue;
	}

	
}
