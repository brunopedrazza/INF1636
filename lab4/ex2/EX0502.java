package ex0502;

public class EX0502 { 
	public static void main(String[] args) { 
		Contribuinte []lst;
		int i;

		lst =  Contribuinte.listaContr() ;
		
		System.out.printf("NOME                       IMPOSTO\n"); 
		System.out.printf("====================       =======\n\n"); 
		for (i=0; i<6; i++)	{
			System.out.printf("%-20s     %9.2f\n",lst[i].getNome(), lst[i].calcImposto());
		}
	} 
} 