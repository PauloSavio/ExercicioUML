package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Magos mago = new Magos("Malzahar", 100, 50);
        Guerreiros guerreiro = new Guerreiros("Darius", 500, 100);
        Voadores voador = new Voadores("Ridley", 1000, 80);
        Rasteiros rasteiro = new Rasteiros("Medusa", 200, 60);

        guerreiro.trocarNome("Brand");
        System.out.println(guerreiro.getNome());
    }
}
