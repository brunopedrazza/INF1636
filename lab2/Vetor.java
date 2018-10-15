
public class Vetor {
	private double x; 
	private double y;
	
	public Vetor() {
		x = y = 0.0;
	}
	
	public Vetor(double x) {
		this.x = x;
		y = 0.0;
	}
	
	public Vetor(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void soma(Vetor v) {
		this.x += v.x;
		this.y += v.y;
	}
	
	public void exibe() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	{
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
}
