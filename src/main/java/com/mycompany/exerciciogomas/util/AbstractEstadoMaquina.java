/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.exerciciogomas.util;

/**
 *
 * @author 20122bsi0387
 */
public abstract class AbstractEstadoMaquina implements EstadoMaquina {
    protected Maquina maquina;
    public AbstractEstadoMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
    
    
}
