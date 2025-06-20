import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Audio;
import entities.Video;
import entities.enums.Tipo;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Audio a1 = new Audio("Dance");
        a1.setTipo(Tipo.AUDIO);
        a1.setVolume(7);
        a1.setDurata(8);
        a1.alzaVolume();
        a1.abbassaVolume();

        Video a2 = new Video("Battle");
        a2.setTipo(Tipo.VIDEO);
        a2.setVolume(2);
        a2.setDurata(8);
        a2.setLuminosita(5);
        a2.abbassaVolume();
        a2.alzaVolume();
        */

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] arrayElementi= new ElementoMultimediale[5];

        System.out.println("Benvenuto nel programma per creare un array con i tuoi elementi multimediali");
        for (int i=0 ; i<arrayElementi.length; i++) {

            String tipoElemento;
            do {
                System.out.println("Scegli il tipo di elemento multimediale da implementare tra immagine, video, audio");
                tipoElemento = scanner.nextLine().toUpperCase();
                if(!tipoElemento.equals("IMMAGINE") && !tipoElemento.equals("VIDEO") && !tipoElemento.equals("AUDIO")){
                    System.out.println("Hai scelto un tipo di elemento non valido");
                }
            } while (!tipoElemento.equals("IMMAGINE") && !tipoElemento.equals("VIDEO") && !tipoElemento.equals("AUDIO"));

            switch (tipoElemento) {
                case "IMMAGINE":
                    String titoloImmagine;
                    do {
                    System.out.println("Scegli il titolo dell'immagine");
                    titoloImmagine = scanner.nextLine();
                    if (Objects.equals(titoloImmagine, ""))
                    {
                        System.out.println("Inserisci un titolo al tuo elemento!!!");
                    }
                    }while (Objects.equals(titoloImmagine, ""));

                    Immagine immagine = new Immagine(titoloImmagine);
                    immagine.setTipo(Tipo.IMMAGINE);

                    int luminositaImmagine;
                    do {
                        System.out.println("Scegli la luminosità dell'immagine tra 0 e 10");
                        luminositaImmagine = Integer.parseInt(scanner.nextLine());
                        if (luminositaImmagine < 0){
                            System.out.println("Hai scelto una luminosità troppo bassa");
                        }else if (luminositaImmagine > 10)
                        {
                            System.out.println("Hai scelto una luminosità troppo alta");
                        }
                    } while (luminositaImmagine < 0 || luminositaImmagine > 10);
                    immagine.setLuminosita(luminositaImmagine);

                    arrayElementi[i]=immagine;

                    break;

                case "VIDEO":
                    String titoloVideo;
                    do {
                        System.out.println("Scegli il titolo del video");
                        titoloVideo = scanner.nextLine();
                        if (Objects.equals(titoloVideo, ""))
                        {
                            System.out.println("Inserisci un titolo al tuo elemento!!!");
                        }
                    }while (Objects.equals(titoloVideo, ""));

                    Video video= new Video(titoloVideo);
                    video.setTipo(Tipo.VIDEO);

                    int luminositaVideo;
                    do {
                        System.out.println("Scegli la luminosità del Video tra 0 e 10");
                        luminositaVideo = Integer.parseInt(scanner.nextLine());
                        if (luminositaVideo < 0){
                            System.out.println("Hai scelto una luminosità troppo bassa");
                        }else if (luminositaVideo > 10)
                        {
                            System.out.println("Hai scelto una luminosità troppo alta");
                        }
                    } while (luminositaVideo < 0 || luminositaVideo > 10);
                    video.setLuminosita(luminositaVideo);

                    int volumeVideo;
                    do {
                        System.out.println("Scegli il volume del Video tra 0 e 10");
                        volumeVideo = Integer.parseInt(scanner.nextLine());
                        if (volumeVideo < 0){
                            System.out.println("Hai scelto un volume troppo basso");
                        }else if (volumeVideo > 10)
                        {
                            System.out.println("Hai scelto un volume troppo alto");
                        }
                    } while (volumeVideo < 0 || volumeVideo > 10);
                    video.setVolume(volumeVideo);

                    int durataVideo;
                    do {
                        System.out.println("Scegli la durata del video in modo che sia maggiore di zero");
                        durataVideo = Integer.parseInt(scanner.nextLine());
                        if(durataVideo <= 0)
                        {
                            System.out.println("Un video non può avere una durata uguale a zero o inferiore");
                        }
                    } while (durataVideo <=0);
                    video.setDurata(durataVideo);

                    arrayElementi[i]=video;

                    break;

                case "AUDIO":
                    String titoloAudio;
                    do {
                        System.out.println("Scegli il titolo dell'audio");
                        titoloAudio = scanner.nextLine();
                        if (Objects.equals(titoloAudio, ""))
                        {
                            System.out.println("Inserisci un titolo al tuo elemento!!!");
                        }
                    }while (Objects.equals(titoloAudio, ""));

                    Audio audio = new Audio(titoloAudio);
                    audio.setTipo(Tipo.AUDIO);

                    int volumeAudio;
                    do {
                        System.out.println("Scegli il volume dell'audio tra 0 e 10");
                        volumeAudio = Integer.parseInt(scanner.nextLine());
                        if (volumeAudio < 0){
                            System.out.println("Hai scelto un volume troppo basso");
                        }else if (volumeAudio > 10)
                        {
                            System.out.println("Hai scelto un volume troppo alto");
                        }
                    } while (volumeAudio < 0 || volumeAudio > 10);
                    audio.setVolume(volumeAudio);

                    int durataAudio;
                    do {
                        System.out.println("Scegli la durata dell'audio in modo che sia maggiore di zero");
                        durataAudio = Integer.parseInt(scanner.nextLine());
                        if(durataAudio <= 0)
                        {
                            System.out.println("Un'audio non può avere una durata uguale a zero o inferiore");
                        }
                    } while (durataAudio <=0);
                    audio.setDurata(durataAudio);

                    arrayElementi[i]=audio;

                    break;
            }

        }

        int key;
        System.out.println("Desideri entrare nel ciclo per visualizzare gli elementi multimediali del tuo array? Se si digita un qualsiasi numero , se no digita 0");
        key= Integer.parseInt(scanner.nextLine());
        while (key!=0){
            int selezione;
            do {
            System.out.println("Scegli quale elemento multimediale riprodurre digitando un valore da 0 a 4");
            selezione = Integer.parseInt(scanner.nextLine());
            if (selezione<0 || selezione>4)
            {
                System.out.println("Per favore scegli un elemento esistente compreso tra 0 e 4");
            }
            }while(selezione<0 || selezione>4);

            if (arrayElementi[selezione] instanceof Immagine)
            {
                         ((Immagine) arrayElementi[selezione]).show();
            }
            else if (arrayElementi[selezione] instanceof Video)
            {
                        ((Video) arrayElementi[selezione]).play();
            }
            else if (arrayElementi[selezione] instanceof Audio)
            {
                        ((Audio) arrayElementi[selezione]).play();
            }
            System.out.println("Se desideri uscire dal ciclo inserisci 0 sennò un qualsiasi altro numero");
            key= Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
    }
}