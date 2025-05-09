/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vitorrural.trabalho01.Serializacao;

import com.vitorrural.trabalho01.Classes.Automato;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Serializador {
    public static List<Integer> converterParaInteiros(String[] array){
        List<Integer> inteiros = new ArrayList<>();
        for(String c : array){
            inteiros.add(Integer.parseInt(c));
        }
        return inteiros;
    }
    public static Automato lerAutomatoDeArquivo(String caminhoArquivo) throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            List<Integer> estadosFinais;
            String[] Finais = leitor.readLine().trim().split(";");
            estadosFinais = converterParaInteiros(Finais);
            
            List<int[]> linhas = new ArrayList<>();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] estados = linha.trim().split(";");
                if (estados.length == 2) {
                    linhas.add(new int[] {
                        Integer.parseInt(estados[0]),
                        Integer.parseInt(estados[1])
                    });
                }
            }
            
            int[][] matrizTransicao = new int[linhas.size()][2];
            for (int i = 0; i < linhas.size(); i++) {
                matrizTransicao[i] = linhas.get(i);
            }
            
            return new Automato(matrizTransicao, estadosFinais);
        }
    }
}
