package logica;

public class No implements Comparable<No> {

    private No pai;
    private int estados[][];
    private int fator;
    private int custo;
    
    
    public No() {
        custo = 0;
        fator = 0;
        custo = 0;
    }

    @Override
    public int compareTo(No o) {
        if(this.fator < o.getFator()){
            return -1;
        }else if (this.fator > o.getFator()){
            return 1;
        }
        return 0;    
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public int[][] getEstados() {
        return estados;
    }

    public void setEstados(int[][] estados) {
        this.estados = estados;
    }

    public int getFator() {
        return fator;
    }

    public void setFator(int fator) {
        this.fator = fator;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }  
}
