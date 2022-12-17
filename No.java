public class No {
		
    private int valor;
    private No proximo;

    public No() { //método construtor
        valor = 0;
        proximo = null;
        }
    

    public int getValor() {
            return valor;
        }

    public void setValor(int valor){ 
    this.valor = valor;
    }

    public void setProx(No proximo){
    this.proximo = proximo;
    }

    public No getProx(){
    return this.proximo;
    }

}