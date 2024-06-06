package main;

import dominio.Especie;

public class Main {
    public static void main(String[] args) {
        Especie pirarucu = new Especie("Pirarucu", "São Paulo", "Dezembro a março");
        Especie pacu = new Especie("Pacu", "Rio de Janeiro", "Março a Maio");
        
        System.out.println(pirarucu.exibirEspecie());
        System.out.println(pacu.exibirEspecie());
        
    }
}
