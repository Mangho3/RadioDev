package com.aluracursos.radiodev.principal;

import com.aluracursos.radiodev.modelos.Cancion;
import com.aluracursos.radiodev.modelos.MisFavoritos;
import com.aluracursos.radiodev.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("La cotorrisa");
        miPodcast.setTitulo("Especial 5 años");


        //cancion
        for (int i = 0; i < 200 ; i++){
            miCancion.meGusta();
        }
        for (int i = 0; i<15000; i++){
            miCancion.reproduce();
        }

        //podcast
        for (int i = 0; i < 100 ; i++){
            miPodcast.meGusta();
        }
        for (int i = 0; i<2000; i++){
            miPodcast.reproduce();
        }


        System.out.println("El total de reproducciones es: "+miCancion.getTotalDeReproducciones());
        System.out.println("Tu cancion tiene : "+miCancion.getTotalDeMeGusta()+ " me gustas.");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);


    }

}
