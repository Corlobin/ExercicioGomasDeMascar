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
public class EstadoSemMoeda extends AbstractEstadoMaquina {

    EstadoSemMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void insereMoeda(int moedas) {
        if(moedas == 1) {
            System.out.println("Recebeu moeda! " + moedas);
            this.maquina.setState("recebeu moeda");            
        } else { 
            System.out.println("Moeda invalida");
            
        }
        
    }

    @Override
    public void acionaAlavanca() {
        System.out.println("Você ainda não inseriu uma moeda!");
    }

    
}
