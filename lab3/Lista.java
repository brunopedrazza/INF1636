package Lista;

public class Lista { 
	
	private int tam=0;
	private No ini=null;
	private No fin=null;
	private No corr=null;
	
	public boolean vazio() { 
		if (this.tam == 0) return true;
		else return false;
	}
	
	public void insIni(Object x) { 
		
		No no_ini = new No(x,null);
		
		no_ini.setProx(this.ini);
		
		this.ini = no_ini;
		
		if (this.tam == 0) {
			this.corr = this.ini;
			this.fin = this.ini;
		}
		
		this.tam += 1;
	
	}
	
	public void insFin(Object x){ 
		No no_fim = new No(x,null);
		
		this.fin.setProx(no_fim);
		
		
		this.fin = no_fim;
		
		if (this.tam == 0) {
			this.ini = this.fin;
			this.corr = this.fin;
		}
		
		this.tam += 1;
		
	}
	
	public Object retIni() { 
		
		if (this.tam == 0) return null;
		
		No ret_ini = ini.getProx();
		No no_ret = this.ini;
		this.ini = ret_ini;
		tam --;
		
		return no_ret;
		
	}
	
	public Object retFin() { 
		
		No aux = this.ini;
		No aux_prox = this.ini;
		
		if (this.tam == 0) return null;
		
		while (aux != null) {
			aux_prox = aux.getProx();
			
			if (aux_prox == this.fin) {
				this.fin = aux;
				fin.setProx(null);
				break;
			}
			
			aux = aux_prox;
		}

		tam --;
		
		return aux_prox;
		
	}
	
	public void posIni() { 
		this.ini = this.corr;
		
		if (this.tam == 0) this.corr = null;
		 
	}
	
	public Object prox() { 
		 if (this.corr == null) return null;
		 
		 No corr_aux = this.corr;
		 this.corr = corr.getProx();
		 
		 return corr_aux;
	}	
}
