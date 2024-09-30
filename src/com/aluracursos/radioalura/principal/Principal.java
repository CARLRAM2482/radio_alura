package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("ImgenD");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("maira perez");
        miPodcast.setTitulo("emprendiendo");

        for (int i = 0; i< 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i< 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("total de reproduciones  " + miCancion.getTotalDeReproduciones());
        System.out.println( "total de megusta " + miCancion.getTotalDeMeGusta());

        System.out.println("total de reproduciones  " +miPodcast.getTotalDeReproduciones());
        System.out.println("total de megusta  " + miPodcast.getTotalDeMeGusta());


    }
}
