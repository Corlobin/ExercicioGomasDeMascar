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
public class EstadoRecebeuMoeda extends AbstractEstadoMaquina {

    EstadoRecebeuMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void insereMoeda(int moedas) {
        System.out.println("Moeda ejetada!");
        this.maquina.setState("sem moeda");
    }
    
    @Override
    public void acionaAlavanca() {
        this.maquina.setState("gomas vendidas");
        this.maquina.entregaGoma();
    }

   
    
}
