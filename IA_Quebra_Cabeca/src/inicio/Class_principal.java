package inicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import buscas.Largura;
import buscas.Profundidade;
import logica.No;
import estrutura.Busca;


public class Class_principal {
    
    private int proximo;
    private Busca busca;
    private No no;
    private List<logica.Celula> lista;
    private List<No> solucao;
    private int estado[][] = new int[3][3];

    
    public void estado_inicial_quebra_cabeca() {
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                estado [i][j] = ler.nextInt();
            }
        }
        no.setPai(null);
        no.setEstados(estado);
    }

    public Class_principal() {
        lista = new ArrayList<>();
        lista = new ArrayList<>();
        no = new No();
        proximo = 0;
    }
    
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int n;
        int proximo;

        System.out.println("Escolha um tipo de busca:\n1 - Profundidade.\n2 - Expansão.");
        n = ler.nextInt();
        
        if (n == 1){
		System.out.println("Busca por Profundidade"); 
                estado_inicial_quebra_cabeca();
                busca = new Profundidade();
                busca.solucionar(no);
                System.out.println("Custo de busca: " + busca.getContador());
                System.out.println("Custo de solução: " + busca.getMovimentos());
                solucao = busca.getSolucao();
                busca.setContador(0);
                
        } if (n == 2){
            System.out.println("Busca por Expansão"); 
                estado_inicial_quebra_cabeca();
                busca = new Largura(); //mudar
                busca.solucionar(no);
                System.out.println("Custo de busca: " + busca.getContador());
                System.out.println("Custo de solução: " + busca.getMovimentos());
                solucao = busca.getSolucao();
                busca.setContador(0);
    	}
    }
  
}
