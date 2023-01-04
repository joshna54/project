package eoam;
import java.util.*;
public class electronic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		int h=(s/3600)%24;
		int t=(s%3600)/60;
		int d=(s%3600)%60;
		System.out.println(+h+":"+t+":"+d);
		
		
		

	}

}
