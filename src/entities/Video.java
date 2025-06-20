package entities;

import entities.enums.Tipo;
import entities.interfaces.Luminosita;
import entities.interfaces.Riproduci;
import entities.interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Riproduci , Luminosita {

    private int durata;
    private int volume;
    private int luminosita;

    //COSTRUTTORE
    public Video(String titolo) {
        super(titolo);
    }

    //SETTER
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Volume deve essere tra 0 e 10");
        }
    }
    public void setDurata(int durata) {
        if (durata >= 0 && durata <= 10) {
            this.durata = durata;
        } else {
            System.out.println("La durata deve essere tra 0 e 10");
        }
    }
    public void setLuminosita(int luminosita){
        if (luminosita >= 0 && luminosita <= 10) {
            this.luminosita = luminosita;
        } else {
            System.out.println("La luminosità deve essere tra 0 e 10");
        }
    }

    //METODI
    @Override
    public void alzaVolume() {
        if (this.volume < 10) {
            this.volume++;
            System.out.println("Hai aumentato il volume di uno. Il tuo volume è a " + this.volume);
        } else {
            System.out.println("Il tuo volume è già al massimo");
        }
    }
    @Override
    public void abbassaVolume() {
        if (this.volume != 0) {
            this.volume--;
            System.out.println("Hai diminuito il volume di uno. Il tuo volume è a " + this.volume);
        } else {
            System.out.println("Il tuo volume è già al minimo");
        }
    }

    @Override
    public void aumentaLuminosita() {
        if (this.luminosita < 10) {
            this.luminosita++;
            System.out.println("Hai aumentato la luminosità di uno. La tua luminosità è a " + this.luminosita);
        } else {
            System.out.println("La tua luminosità è già al massimo");
        }
    }
    @Override
    public void diminuisciLuminosita() {
        if (this.luminosita != 10) {
            this.luminosita--;
            System.out.println("Hai diminuito la luminosità di uno. La tua luminosità è a " + this.luminosita);
        } else {
            System.out.println("La tua luminosità è già al minimo");
        }
    }

    @Override
    public void play(){
        String stringa = " Volume: ";
        for( int i=0 ; i<this.volume ; i++)
        {
            stringa = stringa.concat("!");
        }
        stringa = stringa.concat(" Luminosità: ");
        for( int i=0 ; i<this.luminosita ; i++)
        {
            stringa = stringa.concat("*");
        }
        for (int a=0 ; a<this.durata ; a++)
        {
            System.out.println(this.titolo+ stringa);
        }
    }
}
