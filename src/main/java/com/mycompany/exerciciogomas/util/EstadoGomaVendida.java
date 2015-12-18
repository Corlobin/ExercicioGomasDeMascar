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
public class EstadoGomaVendida extends AbstractEstadoMaquina {
    
    public EstadoGomaVendida(Maquina maquina) {
        super(maquina);
    }
    
    @Override
    public void insereMoeda(int moedas) {
        if(this.maquina.gomas > 0) {
            System.out.println("Goma vendida! aproveite");
            this.maquina.setState("sem moeda");
        } else {
            System.out.println("Sem goma de mascar!");
            this.maquina.setState("gomas acabaram");
                    
        }
    }

    @Override
    public void acionaAlavanca() {
    }

    
}
