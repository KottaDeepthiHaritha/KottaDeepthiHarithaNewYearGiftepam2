package Maven_oop.Maven_oop_demo;
class Ladu extends Sweetwt{
	int quantity;
	int t;
	public Ladu(int weight,int q) {
		super(weight);
		this.quantity=q;
  }
  int calc(){
	  t=this.weight*this.quantity;
	  return(t);
  }
  void display(){
		System.out.println("Ladu_weight="+this.weight+" "+"Ladu_quantity="+this.quantity);
  }

}
