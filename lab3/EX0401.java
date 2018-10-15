package ex0401;

public class EX0401 {
	public static void main(String[] args) {
		
		Vetor v1 = new Vetor(3.123,7.497);
		Vetor v2;
		
		String s1;
		
		v2 = v1.clone();
		
		s1 = v2.toString();
		
		System.out.println(s1);
	}
}
