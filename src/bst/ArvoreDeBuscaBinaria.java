package bst;


public class ArvoreDeBuscaBinaria {
	
	int info;
	ArvoreDeBuscaBinaria noParente;
	ArvoreDeBuscaBinaria subArvoreEsquerda;
	ArvoreDeBuscaBinaria subArvoreDireita;

    public ArvoreDeBuscaBinaria(int info)
    {
        this.info = info;
        this.subArvoreEsquerda = null;
        this.subArvoreDireita = null;
        this.noParente = null;
    }

    public ArvoreDeBuscaBinaria()
    {
    }
    
    

}
