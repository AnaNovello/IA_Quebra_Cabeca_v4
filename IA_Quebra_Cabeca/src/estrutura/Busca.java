package estrutura;

import logica.No;
import java.util.List;
import java.util.Stack;

public abstract class Busca {
    
    protected int objetivo[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    //protected int objetivo[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    protected Stack<No> pilha;
    protected List<No> fila;
    protected List solucao;
    protected int movimentos;
    protected int contador;
    
    public abstract void solucionar(No no);
    
    public List getSolucao(){
        return solucao;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(int movimentos) {
        this.movimentos = movimentos;
    }
    
    public void flushSolution(){
        solucao.clear();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
