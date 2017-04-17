
public class Car implements Valuable{
	private String name;
	private double price;

	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public double EstimateValue(int month){
		
		return	price*0.8*Math.pow(0.99, month);
	}
	public double EstimateValue(){
		return	price*0.8*Math.pow(0.99, 1);
	}
	public String toString(){
		return String.format("Human name: %s\ninitial price: %f",name,price);
	}

}
