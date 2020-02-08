package Maven_oop.Maven_oop_demo;
class Kajubarfi extends Sweetwt{
	int quantity;
	int t;
	public Kajubarfi(int weight,int qt){
		super(weight);
		this.quantity=qt;
	}
	int calc(){
		 t=this.weight*this.quantity;
		 return(t);
	}
	void display(){
		System.out.println("Kajubarfi_weight="+this.weight+" "+"Kajubarfi_quantity="+this.quantity);
	}
}
