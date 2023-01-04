package eoam;

import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String st=sc.nextLine();
		String sr="";
		if(st.charAt(0)==s.charAt(s.length()-1))
			sr=sr+s+st.substring(1, st.length());
		else
			sr=sr+s+" "+st;
		System.out.println(sr);
		
	
		
		
		
		sc.close();

	}

}
