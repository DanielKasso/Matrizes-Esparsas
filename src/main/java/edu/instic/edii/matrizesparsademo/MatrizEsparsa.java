/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.edii.matrizesparsademo;

/**
 *
 * @author D.N.Kasso
 * @param <T>
 */
public class MatrizEsparsa<T> {
    private No<T> cabeca;
    private final int linhas;
    private final int colunas;

    public MatrizEsparsa(int linhas, int colunas) {
        cabeca = null;
        this.linhas = linhas;
        this.colunas = colunas;
    }

public void adicionar(int i, int j, T dado){
       if( dado == null) return;  
        if(i < 0 || j < 0) return;
       if(i >= linhas || j >= colunas) return;
       if( procurar(i , j) != null ) return;
       No<T> ponteiro = cabeca;
       No<T> novoNo = new No<>(i, j, dado);
       if(cabeca == null) 
           cabeca = novoNo;
       else{
           if( cabeca.getLinha() == i && cabeca.getColuna() > j ){
               novoNo.setSeguinte(cabeca);
               cabeca = novoNo;
           }
           else{ 
                int c = 1, tamanho = extensao();
                while( ponteiro.getSeguinte() != null ){
                    if( ponteiro.getSeguinte().getLinha() > i || ( ponteiro. getSeguinte ().getLinha()    
						== i && ponteiro.getSeguinte().getColuna() > j ))
                        break;
                     else
                         ponteiro = ponteiro.getSeguinte(); 
                    c++;
                }
                if( c == tamanho )
                    ponteiro.setSeguinte(novoNo);
                if( c < tamanho ){
                    novoNo.setSeguinte(ponteiro.getSeguinte());
                    ponteiro.setSeguinte(novoNo);
                }
            }
       }
    }
public No<T> procurar(int i, int j) {
        if (cabeca == null) return null;
        No<T> ponteiro = cabeca;
	while(ponteiro != null) {
            if ((ponteiro.getLinha() == i) && (ponteiro.getColuna() == j)) 
                return ponteiro;
            ponteiro = ponteiro.getSeguinte();
	}
	return null;
    }
public int extensao(){
        int c = 0;
        No<T> ponteiro = cabeca;
        while(ponteiro != null){
            c++;
            ponteiro = ponteiro.getSeguinte();
        }
        return c; 
}
public void imprimirMatriz() {
       for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                No<T> actual = cabeca;
                boolean encontrado = false;
                while(actual != null){
                    if(actual.getLinha() == i && actual.getColuna() == j){
                        System.out.print(actual.getDado() + " ");
                        encontrado = true;
                        break;
                    }
                    actual = actual.getSeguinte();
                }
                if(!encontrado){ 
                    System.out.print("N ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "MatrizEsparsa{" + "cabeca=" + cabeca + ", linhas=" + linhas + ", colunas=" + colunas + '}';
    }



}
