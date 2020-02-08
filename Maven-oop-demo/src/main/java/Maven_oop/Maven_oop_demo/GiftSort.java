package Maven_oop.Maven_oop_demo;
public class GiftSort  extends App{
	public  void sort(int a[]) {
		int v=a.length;
	    for(int i=0;i<v;i++){
	    	for(int j=i+1;j<v;j++) {
	    		if(a[i]>a[j]) {
	    			int z=a[i];
		    		a[i]=a[j];
		    		a[j]=z;
	    		}
	    	}
	    }
	    for(int k=0;k<v;k++) {
	    	System.out.print(a[k]+" ");
	    }
	    System.out.println();
	}

}
