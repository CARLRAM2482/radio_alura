package com.aluracursos.radioalura.modelos;

public class Favoritos {
   public void adicione(Audio audio){
        if (audio.getClasificacion() >= 4){
            System.out.println(audio.getTitulo()  + "es de los favoritos");
        }else {
            System.out.println(audio.getTitulo()  + "esta en los favritos");
        }
    }
}
