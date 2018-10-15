
public class Data {
	private int dia,mes,ano;
	
	 public int get(int e) {
		 switch(e) {
		 case 1: return dia;
		 case 2: return mes;
		 case 3: return ano;
		 default: return -1;
		 }
	 }
	 
	 public String getString() {
		 String s;
		 s = Integer.toString(dia)+ "/";
		 s = s + Integer.toString(mes) + "/";
		 s = s + Integer.toString(ano);
		 return  s;
	 }
	 
	 public Data(int d,int m,int a) {  
		 dia=d;
		 mes=m;
		 ano=a;
	 }

}
