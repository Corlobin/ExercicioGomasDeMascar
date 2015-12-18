/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciogomas;

import com.mycompany.exerciciogomas.util.Maquina;

/**
 *
 * @author Ricardo
 */
public class application {
    public static void main(String args[]) {
        
        Maquina maquina = new Maquina(1);
        maquina.insereMoeda(1);
        maquina.acionaAlavanca();
        
        Maquina maquina2 = new Maquina(0);
        maquina2.insereMoeda(2);
        maquina2.acionaAlavanca();
        
    }
}
