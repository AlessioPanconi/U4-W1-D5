package entities;

public class Immagine extends ElementoMultimediale{

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
}
