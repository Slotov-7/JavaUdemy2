package curingas_delimitados.hash_code_e_equals.application;

import curingas_delimitados.hash_code_e_equals.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "test"; //faz um tratamento especial
        String s2 = "test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); //Compara a posicao na memoria

        System.out.println(s1 == s2);
    }
}
