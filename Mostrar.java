public class Mostrar {

    public static void main(String [] args) throws Exception {

        Lista l = new Lista();
			l.insereUltimo(10);
			l.insereUltimo(20);
			l.insereUltimo(30);
			l.inserePrimeiro(5);
			l.insereUltimo(50);
			l.inserePrimeiro(99);
			l.mostrar();
			System.out.println("\n");
			l.removePrimeiro();
			l.mostrar();
			l.removeUltimo();
			System.out.println("\n");
			l.mostrar();
			System.out.println("\n");
			No anterior = l.getPrimeiro();
			l.insereDepois(100, anterior);
			l.mostrar();
			System.out.println("\n");
			No excluido = l.getPrimeiro().getProx();
			l.remove(excluido);
			l.mostrar();
    }
    
}
