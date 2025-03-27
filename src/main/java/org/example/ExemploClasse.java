package org.example;

public class ExemploClasse {
    private int vezesSaudadas;

    public void saudar(String nome) {
        System.out.println("Olá, " + nome);
        this.vezesSaudadas += 1;
    }

    public void getVezesSaudadas() {
        System.out.println(vezesSaudadas);
    }
}

