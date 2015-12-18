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
public class EstadoGomasAcabaram extends AbstractEstadoMaquina{

    EstadoGomasAcabaram(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void insereMoeda(int moedas) {
        System.out.println("Sem gomas de mascar!");
    }

    @Override
    public void acionaAlavanca() {
        System.out.println("Sem gomas de mascar!");
    }

}
