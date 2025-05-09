/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vitorrural.trabalho01.Classes;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Automato {
        private final int[][] matrizTransicao;
        private final List<Integer> estadosFinais;
        private final String alfabeto = "ab";

        public Automato(int[][] matrizTransicao, List<Integer> estadoFinal) {
            this.matrizTransicao = matrizTransicao;
            this.estadosFinais = estadoFinal;
        }

        public boolean reconhecer(String palavra) {
            int estadoAtual = 0;
            
            for (char c : palavra.toCharArray()) {
                int indiceSimbolo = alfabeto.indexOf(c);
                
                if (indiceSimbolo == -1) {
                    return false;
                }
                
                estadoAtual = matrizTransicao[estadoAtual][indiceSimbolo];
            }
            if(estadosFinais.contains(estadoAtual))
                return true;
            
            return false;
        }
    }
