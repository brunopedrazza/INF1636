package ex0502;

public class PFisica extends Contribuinte { 
	protected String cpf; 
	public PFisica(String n,double r,String c) { 
		this.nome = n;
		this.rendaBrt = r;
		this.cpf = c; 
	} 

	public double calcImposto() { 
		if (this.rendaBrt <= 1400) return 0;
		else if (this.rendaBrt <= 2100) return this.rendaBrt*0.1 - 100;
		else if (this.rendaBrt <= 2800) return this.rendaBrt*0.15 - 270;
		else if (this.rendaBrt <= 3600) return this.rendaBrt*0.25 - 500;
		return this.rendaBrt*0.30 - 700;
	} 
} 