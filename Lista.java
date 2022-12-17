public class Lista {
	private No primeiro;
	
	public Lista(){
		primeiro = null;}
	
		
	/////////////////////// Método vazia ////////////////////////

	public boolean vazia(){
		return primeiro == null; }
	

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	///////////////////// Método inserePrimeiro //////////////////
	public void inserePrimeiro(int valor) {
		No no = new No();
		no.setValor(valor);

		if (!this.vazia()) {
	no.setProx(this.primeiro);}
		this.primeiro = no;
	}

	///////////////////// insereDepois /////////////////////////////

	public void insereDepois(int info, No anterior) {
		No novo = new No();
		novo.setProx(anterior.getProx());
		novo.setValor(info);
		anterior.setProx(novo);
		
		}
	
	//////////////////// Método insereUltimo ///////////////////////

	public void insereUltimo(int valor) {
		if (vazia() == true) {
			inserePrimeiro(valor);
			} 
		else {
				No auxiliar = this.primeiro;

				while (auxiliar != null && auxiliar.getProx() != null) {
					auxiliar = auxiliar.getProx();
				}

					if (auxiliar.getProx() == null) {
					No novo = new No();
					novo.setValor(valor);
					auxiliar.setProx(novo);
					}
				}
	}
	///////////////////// removePrimeiro /////////////////////////////

	public void removePrimeiro(){ //método criado para remover o primeiro item da lista
		if(vazia()) { //caso a lista esteja vazia o método irá alertar o usuário
			System.out.print ("Sem itens encontrados, por favor insira o primeiro número.");
		}
		else { //se a lista não estiver vazia o método fará a remoção do primeiro nó
			primeiro = primeiro.getProx(); 
			}
		}

	///////////////////// removeUltimo ////////////////////////////////

	public void removeUltimo() { //método criado para remover o último item da lista
		if(vazia()) { //caso a lista esteja vazia o método irá alertar o usuário
			System.out.print("Não há itens encontrados, por favor insira um número.");
		}
		else { //caso a lista não esteja vazia o método fará a remoção do último nó
					No primeiro;
					primeiro = this.primeiro;
					for(; primeiro.getProx() != null; primeiro = primeiro.getProx()) {
						if(primeiro.getProx().getProx()==null){
							primeiro.setProx(null);
							break;}
						}
					}
	}

	/////////////////////// remove ////////////////////////////////////

	public void remove(No excluido) {
		if(vazia()) {
		System.out.println("Não há nó para remover!");
			}
		else if(excluido == this.primeiro ) {
			this.removePrimeiro();
			}
		else if(excluido.getProx() == null){
			this.removeUltimo();
			}
		else {	
			No aux = this.primeiro;
			while(aux.getProx() != excluido) {
				aux = aux.getProx();
				}
			if(aux.getProx() == excluido) {
				aux.setProx(excluido.getProx());
				}
			}

		}

	//////////////////////////////// mostrar ///////////////////////////

	public void mostrar() {
		
		No auxiliar = primeiro; //o auxiliar é necessário para percorrer todos os itens
			while(auxiliar != null){
			System.out.print(auxiliar.getValor() + ", ");
			auxiliar = auxiliar.getProx();
			}
	}
}