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
public class No<T> {
    private int linha;
    private int coluna;
    private T dado;
    private No<T> seguinte;

    public No(int linha, int coluna, T dado) {
        this.linha = linha;
        this.coluna = coluna;
        this.dado = dado;
        this.seguinte = null;
    }
    public int getLinha() {
        return linha;
    }
    public void setLinha(int linha) {
        this.linha = linha;
    }
    public int getColuna() {
        return coluna;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    public T getDado() {
        return dado;
    }
    public void setDado(T dado) {
        this.dado = dado;
    }
    public No<T> getSeguinte() {
        return seguinte;
    }
    public void setSeguinte(No<T> seguinte) {
        this.seguinte = seguinte;
    }
            
}
