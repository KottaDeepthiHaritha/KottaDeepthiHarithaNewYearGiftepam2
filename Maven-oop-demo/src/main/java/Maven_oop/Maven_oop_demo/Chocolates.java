package Maven_oop.Maven_oop_demo;
interface int1{
	public void disp_choco();
}
class Chocolates extends App implements int1{
	int choco_weight,choco_quantity,p,t;
	public Chocolates(int cw,int q) {
		this.choco_weight=cw;
		this.choco_quantity=q;
	}
	int chocowt() {
		t=this.choco_weight*this.choco_quantity;
		return(t);
	}
	public void disp_choco() {
		System.out.println("chocolate_weight="+choco_weight+" "+"chocolate_quantity="+choco_quantity);
	}
}
