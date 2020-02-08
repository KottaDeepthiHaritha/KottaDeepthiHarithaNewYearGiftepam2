package Maven_oop.Maven_oop_demo;
interface int2{
	public void disp_choco();
}
public class Candy extends App implements int2{
	int candy_weight,candy_quantity,p,t;
	public Candy(int cw,int q) {
		this.candy_weight=cw;
		this.candy_quantity=q;
	}
	int chocowt() {
		t=this.candy_weight*this.candy_quantity;
		return(t);
	}
	public void disp_choco() {
		System.out.println("candy_weight="+candy_weight+" "+"candy_quantity="+candy_quantity);
	}
	

}
