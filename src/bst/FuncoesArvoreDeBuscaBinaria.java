package bst;

public class FuncoesArvoreDeBuscaBinaria {
	ArvoreDeBuscaBinaria RAIZ;

	public FuncoesArvoreDeBuscaBinaria() {
		this.RAIZ = null;
	}

	void inserirNo(ArvoreDeBuscaBinaria no, int info) {
		if (no == null) {
			no = new ArvoreDeBuscaBinaria(info);
			RAIZ = no;
		} else if (info < no.info && no.subArvoreEsquerda == null) {
			no.subArvoreEsquerda = new ArvoreDeBuscaBinaria(info);
			no.subArvoreEsquerda.noParente = no;
		} else if (info >= no.info && no.subArvoreDireita == null) {
			no.subArvoreDireita = new ArvoreDeBuscaBinaria(info);
			no.subArvoreDireita.noParente = no;
		} else {
			if (info < no.info) {
				inserirNo(no.subArvoreEsquerda, info);
			} else {
				inserirNo(no.subArvoreDireita, info);
			}
		}
	}

	public boolean busca(ArvoreDeBuscaBinaria no, int info) {
		if (no == null) {
			return false;
		} else if (no.info == info) {
			return true;
		} else {
			if (info < no.info) {
				return busca(no.subArvoreEsquerda, info);
			} else {
				return busca(no.subArvoreDireita, info);
			}
		}
	}

	public void imprimirEmOrdem(ArvoreDeBuscaBinaria no) {
		if (no != null) {
			imprimirEmOrdem(no.subArvoreEsquerda);
			System.out.print(no.info + " - ");
			imprimirEmOrdem(no.subArvoreDireita);
		}
	}

	public void imprimirPosOrdem(ArvoreDeBuscaBinaria no) {
		if (no != null) {
			imprimirPosOrdem(no.subArvoreEsquerda);
			imprimirPosOrdem(no.subArvoreDireita);
			System.out.print(no.info + " - ");
		}
	}

	public void imprmirPreOrdem(ArvoreDeBuscaBinaria no) {
		if (no != null) {
			System.out.print(no.info + " - ");
			imprmirPreOrdem(no.subArvoreEsquerda);
			imprmirPreOrdem(no.subArvoreDireita);
		}
	}

	public void imprimirTodosNiveis(ArvoreDeBuscaBinaria no, int altura) {
		int i;
		for (i = 1; i <= altura; i++) {
			imprimeNivel(no, i);
			System.out.println();
		}
	}

	public void imprimeNivel(ArvoreDeBuscaBinaria no, int nivel) {
		if (no == null)
			return;
		if (nivel == 1)
			System.out.print(no.info + " ");
		else if (nivel > 1) {
			imprimeNivel(no.subArvoreEsquerda, nivel - 1);
			imprimeNivel(no.subArvoreDireita, nivel - 1);
		}
	}

	public int altura(ArvoreDeBuscaBinaria no) {
		if (no == null) {
			return 0;
		} else {
			return 1 + Math.max(altura(no.subArvoreEsquerda),
					altura(no.subArvoreDireita));
		}
	}

	public static void imprimirDiagramaArvore(ArvoreDeBuscaBinaria no, int nivel) {
		if (no == null)
			return;
		imprimirDiagramaArvore(no.subArvoreDireita, nivel + 1);
		if (nivel != 0) {
			for (int i = 0; i < nivel - 1; i++)
				System.out.print("|\t");
			System.out.println("|-------" + no.info);
		} else
			System.out.println(no.info);
		imprimirDiagramaArvore(no.subArvoreEsquerda, nivel + 1);
	}

}
