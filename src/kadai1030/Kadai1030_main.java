package kadai1030;

import java.util.Arrays;

import kadai1030.Kadai1030_lib;

public class Kadai1030_main {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		double a[][]= {{0,1},{2,0},{0,3}};
		double b[][]= {{1,-1,2},{3,0,4}};
		Kadai1030_lib mlib = new Kadai1030_lib(a,b);
	    System.out.println("Product =" + Arrays.deepToString(mlib.getProduct()));
	    System.out.println("Transport =" + Arrays.deepToString(mlib.getTranspose(b)));
	    
	}


}
