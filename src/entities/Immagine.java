package entities;

import entities.interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {

    private int luminosita;

    //COSTRUTTORE
    public Immagine(String titolo) {
        super(titolo);
    }

    //SETTER
    public void setLuminosita(int luminosita){
        if (luminosita >= 0 && luminosita <= 10) {
            this.luminosita = luminosita;
        } else {
            System.out.println("La luminosità deve essere tra 0 e 10");
        }
    }

    //METODI
    public void show(){
        String stringa = " Luminosità: ";
        for( int i=0 ; i<this.luminosita ; i++)
        {
            stringa = stringa.concat("*");
        }
        System.out.println(this.titolo+ stringa);
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
}
