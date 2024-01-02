package dynamic_array;

import java.util.Scanner ;

public class Dynamicuse {
	public static void main(String[]  args) {
		dynamicArray usearr = new dynamicArray();
		for(int i = 1 ; i<= 100 ; i++) {
			usearr.add(i);
		}
		
//		usearr.add(2);
		for(int i = 0 ; i< usearr.size(); i++) {
			System.out.println(usearr.get(i));
		}
		
	}
}
