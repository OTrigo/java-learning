package org;

import org.example.ExemploClasse;
import org.user.User;
import org.brincandoComArray.ClasseDeArray;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ExemploClasse exemploClasse = new ExemploClasse();

        User usuario = new User();

        String nomeDoUsuario = "Genivaldo";

        usuario.setName(nomeDoUsuario);

        String nomeDoUsuarioNoObjeto = usuario.getName();
        System.out.println(nomeDoUsuarioNoObjeto);

        exemploClasse.saudar("Jorge");
        exemploClasse.getVezesSaudadas();

        ClasseDeArray arrayMeme = new ClasseDeArray();

        arrayMeme.populate();
        ArrayList array = arrayMeme.getArray();
        array.forEach(System.out::println);
    }
}