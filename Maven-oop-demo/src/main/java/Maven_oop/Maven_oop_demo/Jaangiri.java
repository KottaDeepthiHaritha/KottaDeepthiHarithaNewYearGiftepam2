package Maven_oop.Maven_oop_demo;
class Jaangiri extends Sweetwt{
	int quantity;
	int t;
	public Jaangiri(int weight,int qt){
		super(weight);
		this.quantity=qt;
	}
	int calc(){
		 t=this.weight*this.quantity;
		 return(t);
	}
	void display(){
		System.out.println("Jaangiri_weight="+this.weight+" "+"Jaangiri_quantity="+this.quantity);
	}

}
