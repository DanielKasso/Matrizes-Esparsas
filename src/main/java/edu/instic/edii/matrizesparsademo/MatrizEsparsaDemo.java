/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.instic.edii.matrizesparsademo;

/**
 *
 * @author D.N.Kasso
 */
public class MatrizEsparsaDemo {

    public static void main(String[] args) {
        MatrizEsparsa<String> m = new MatrizEsparsa(4, 4);
        
         m.adicionar(0, 1, "A");
         m.adicionar(0, 2, "B");
         m.adicionar(1, 1, "C");
         m.adicionar(2, 3, "D");
         m.adicionar(3, 1, "E");
         m.adicionar(0, 0, "F");
         m.adicionar(1, 0, "K");
         m.adicionar(3, 0, "L");
         m.adicionar(0, 0, "P");
        
         m.imprimirMatriz();
         

    }
}
