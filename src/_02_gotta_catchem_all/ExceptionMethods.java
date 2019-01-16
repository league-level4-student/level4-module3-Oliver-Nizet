package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double n1, double n2) throws Exception {
		if(n2==0.0) {
			throw new Exception();
		}
		return(n1/n2);
	}
	public static String reverseString(String s) throws Exception {
		if(s.length()==0) {
			throw new Exception();
		}
		String a = "";
		for(int i = s.length()-1; i >= 0; i--) {
			a += s.charAt(i);
		}
		return a;
	}
}
