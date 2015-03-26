package bst;

public class Main {

	public static void main(String[] args) {
		FuncoesArvoreDeBuscaBinaria f = new FuncoesArvoreDeBuscaBinaria();
		ArvoreDeBuscaBinaria f1 = new ArvoreDeBuscaBinaria(4);
		
		f.inserirNo(f1, 6);
		f.inserirNo(f1, 2);
		f.inserirNo(f1, 8);
		f.inserirNo(f1, 5);
		f.inserirNo(f1, 11);
		f.inserirNo(f1, 3);
		f.inserirNo(f1, 18);
		f.inserirNo(f1, 12);
		f.inserirNo(f1, 25);
		f.inserirNo(f1, 14);
		f.inserirNo(f1, 1);
		f.inserirNo(f1, 9);
		f.inserirNo(f1, 7);
		f.inserirNo(f1, 10);
		f.inserirNo(f1, 16);
		
		
		
		FuncoesArvoreDeBuscaBinaria.imprimirDiagramaArvore(f1, 0);
		System.out.println();
		
		f.imprimirTodosNiveis(f1, 7);
		
		System.out.println("");
		System.out.println("Altura da árvore: " + f.altura(f1));
		
		
	}

}
