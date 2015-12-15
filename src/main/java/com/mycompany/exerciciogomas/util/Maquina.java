/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciogomas.util;

/**
 *
 * @author Ricardo
 */
public class Maquina {
    public EstadoMaquina semMoeda;
    public EstadoMaquina gomaVendida;
    public EstadoMaquina recebeuMoeda;
    public EstadoMaquina gomasAcabaram;
    
    public EstadoMaquina estadoAtual;
    private int quantidadeMoedas;

    public Maquina(int quantidadeMoedas) {
        this.semMoeda = new EstadoSemMoeda(this);
        this.gomaVendida = new EstadoGomaVendida(this);
        this.recebeuMoeda = new EstadoRecebeuMoeda(this);
        this.gomasAcabaram = new EstadoGomasAcabaram(this);
        
        this.setState(this.semMoeda);
        this.quantidadeMoedas = quantidadeMoedas;
                        
    }
    public EstadoMaquina getState(){
        return this.estadoAtual;
    }
    public void setState(EstadoMaquina estado) {
        this.estadoAtual = estado;
    }
    
    
    
          
}
