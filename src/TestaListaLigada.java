public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		//Adicionando no começo da lista
		System.out.println(lista);
		lista.adicionaComeco("Gabriel");
		System.out.println(lista);
		lista.adicionaComeco("Alice");
		System.out.println(lista);
		lista.adicionaComeco("Rodrigo");
		System.out.println(lista);
		
		// Adicionando no final da lista
		lista.adicionaFim("Marcelo");
		System.out.println(lista);
		
		//Adicionando em qualquer lugar da lista
		lista.adiciona(1, "Fernanda");
		System.out.println(lista);
		
		//Pegando de qualquer posição
		System.out.println(lista.pega(1));
		
		//TAMANHO DA LISTA
		System.out.println(lista.tamanho());
		
		//VER SE O ELEMENTO ESTA CONTIDO NA LISTA
		System.out.println(lista.contem("Cezar"));
		
		//removendo do começo
		lista.removeComeco();
		System.out.println(lista);
		
		//removendo do fim
		lista.removeFim();
		System.out.println(lista);
		
		//removendo qualquer posição
		lista.remove(0);
		System.out.println(lista);
		
		
		
	}

}
