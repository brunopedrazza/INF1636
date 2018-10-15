package ex0401;

public class Vetor { 
	private double x,y; 
	public Vetor(double x,double y) {
		
		this.x=x;
		this.y=y; 
		
	}
	
	private Vetor() { 

	} 
	
	public Vetor clone() {
		
		Vetor vet = new Vetor();
		vet.x = this.x;
		vet.y = this.y;
		return vet;
		
	}
	
	public String toString() {
		
		String s = String.format("( %.2f , %.2f )", this.x,this.y);
		return s;
	}
	
} 
