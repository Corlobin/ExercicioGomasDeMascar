/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciogomas.util;

import java.util.HashMap;

/**
 *
 * @author Ricardo
 */
public class Maquina {
    public HashMap<String, EstadoMaquina> maquinas;
    public EstadoMaquina estadoAtual;
    public int gomas;

    public Maquina(int gomas) {
        maquinas = new HashMap<>();
        maquinas.put("sem moeda", new EstadoSemMoeda(this));
        maquinas.put("gomas vendidas", new EstadoGomaVendida(this));
        maquinas.put("recebeu moeda", new EstadoRecebeuMoeda(this));
        maquinas.put("gomas acabaram", new EstadoGomasAcabaram(this));        
        
        this.setState("sem moeda");
        this.gomas = gomas;
                        
    }
    public EstadoMaquina getState(){
        return this.estadoAtual;
    }
    public void setState(String estado) {
        try {
            this.estadoAtual = maquinas.get(estado);
        } catch(Exception e) {
            System.out.println("Erro ao inserir moeda, estado " + estado + " não existe!");
        }
    }
    public void insereMoeda(int moeda) {
        this.estadoAtual.insereMoeda(moeda);
    }
    public void acionaAlavanca() {
        this.estadoAtual.acionaAlavanca();
    }
    public void entregaGoma() {        
        this.estadoAtual.insereMoeda(0);
    }

    public int getGomas() {
        return gomas;
    }

    public EstadoMaquina getEstadoAtual() {
        return estadoAtual;
    }
    
    
          
}
