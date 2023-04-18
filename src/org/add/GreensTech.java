package org.add;

public class GreensTech {
	private void greensOmr(String greensadd) {
		System.out.println("Greens Address:"+greensadd);
		}
	private void greensOmr(int greensid,float empsal) {
		System.out.println("Greens Id:"+greensid);
		System.out.println("Greens salary:"+empsal);
		
		}
	private void greensOmr(float empsal,int greensid) {
		System.out.println("Greens Id:"+greensid);
		System.out.println("Greens salary:"+empsal);
		}
	private void greensOmr123(float empsal,int greensid) {
		System.out.println("Greens Id:"+greensid);
		System.out.println("Greens salary:"+empsal);
		}
public static void main(String[] args) {
	GreensTech g=new GreensTech();	
	 g.greensOmr("chennai");
	 g.greensOmr(3453456,45678.988f);
	 g.greensOmr(567345.89f,3434565);
	
     }	 
}
