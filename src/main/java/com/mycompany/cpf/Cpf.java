package com.mycompany.cpf;

import java.util.ArrayList;

public class Cpf {

    static ArrayList<Integer> listaNumAlea = new ArrayList<>();

    public static void main(String[] args) {
        
        /* 
            GERA NUMERO ALEATORIO
        for (int i = 0; i <= 8; i++) {
            listaNumAlea.add(geraNumAlea());
        }*/

        listaNumAlea.add(0);
        listaNumAlea.add(6);
        listaNumAlea.add(9);
        listaNumAlea.add(4);
        listaNumAlea.add(6);
        listaNumAlea.add(3);
        listaNumAlea.add(4);
        listaNumAlea.add(5);
        listaNumAlea.add(9);

        System.out.println(listaNumAlea);
        validadorDigitos validador = new validadorDigitos();
        listaNumAlea = validador.ValidarDigitos(listaNumAlea);

        System.out.println(listaNumAlea);
    }

    public static int geraNumAlea() {

        int numero = (int) (Math.random() * 10);
        return numero;

    }

}
