package Lista;

class No { 
	private Object elem;
	private No prox;
	
	public No(Object e,No p) { 
		elem=e;
		prox=p;
	}
	
	public Object getElem() { 
		return this.elem;
	}
	
	public No getProx() { 
		return this.prox;
	} 

	public void setProx(No o){ 
		this.prox = o;
	}
} 
