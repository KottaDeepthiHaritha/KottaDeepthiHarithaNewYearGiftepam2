package Maven_oop.Maven_oop_demo;
import java.util.*;
public class App{
	Scanner s=new Scanner(System.in);
    public static void main( String[] args){ 
    	Scanner inp=new Scanner(System.in);
        int p,q,r,tot,wt,qt,cwt,cqt,wt1,wt2,j=0;
        int all[]=new int[3];
        int gwt[]=new int[3];
        App a=new App();
        Sweets sw=new Sweets();
        
        
        //first gift Details
        System.out.println("First gift box:");
        System.out.println("Sweet Details:");
        System.out.println("Enter wt,qt of sweets:");
        wt=inp.nextInt();
        qt=inp.nextInt();
        Jaangiri g=new Jaangiri(wt,qt);
        p=g.calc();//weight of sweet
        g.display();
        System.out.println("Dairymilk Details:");
        System.out.println("Enter wt,qt of chocolate:");
        cwt=inp.nextInt();
        cqt=inp.nextInt();
        Chocolates dairymilk=new Chocolates(cwt,cqt);
        q=dairymilk.chocowt();
        dairymilk.disp_choco();
        all[0]=tot=p+q;
        System.out.println("Total weight of gift1: "+all[0]+"\n");
        
        
        //Second Gift Details
        p=q=tot=wt=qt=0;
        System.out.println("Second gift box:");
        System.out.println("Sweet Details:");
        System.out.println("Enter wt,qt of sweets:");
        wt=inp.nextInt();
        qt=inp.nextInt();
        Kajubarfi k=new Kajubarfi(wt,qt);
        p=k.calc();//weight of sweet
        k.display();
        System.out.println("perk Details:");
        System.out.println("Enter wt,qt of chocolate:");
        cwt=inp.nextInt();
        cqt=inp.nextInt();
        Chocolates perk=new Chocolates(cwt,cqt);
        q=perk.chocowt();
        perk.disp_choco();
        all[1]=tot=p+q;
        System.out.println("Total weight of gift2: "+all[1]+"\n");
        
        //Third gift Details
        p=q=tot=wt=qt=0;
        System.out.println("Third gift box:");
        System.out.println("Sweet Details:");
        System.out.println("Enter wt,qt of sweets:");
        wt=inp.nextInt();
        qt=inp.nextInt();
        Ladu l=new Ladu(wt,qt);
        p=l.calc();//weight of sweet
        l.display();
        System.out.println("milkyway candy Details:");
        System.out.println("Enter wt,qt of candy:");
        cwt=inp.nextInt();
        cqt=inp.nextInt();
        Candy mw=new Candy(cwt,cqt);
        q=mw.chocowt();
        mw.disp_choco();
        all[2]=tot=p+q;
        System.out.println("Total weight of gift3: "+all[2]+"\n");
        
        //sorted Gift Boxes
        System.out.println("Sorted weight list for 3 GiftBoxes:");
        GiftSort gs=new GiftSort();
        gs.sort(all);
        
        //range for giftBox weights to be displayed
        System.out.println("Enter the wt range to display GiftBoxes:");
        wt1=inp.nextInt();
        wt2=inp.nextInt();
        for(int i=0;i<all.length;i++) {
        	if(all[i]>wt1 & all[i]<wt2) {
        		gwt[j]=all[i];
        		j++;
        	}
        }
        System.out.println("In range:");
        for(int i=0;i<j;i++) {
        	System.out.print(gwt[i]+" ");
        }
        System.out.println();
    }
}
