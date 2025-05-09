/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vitorrural.trabalho01;

import com.vitorrural.trabalho01.Classes.Automato;
import com.vitorrural.trabalho01.Serializacao.Serializador;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Trabalho01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            String caminho = "Automato3.csv";

            Automato automato = Serializador.lerAutomatoDeArquivo(caminho);
        
            
            System.out.println("\nDigite palavras para testar (ou 'sair' para encerrar):");
            while (true) {
                String palavra = scanner.nextLine();
                if (palavra.equalsIgnoreCase("sair")) {
                    break;
                }
                boolean resultado = automato.reconhecer(palavra);
                System.out.println("Resultado: " + resultado);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    }

