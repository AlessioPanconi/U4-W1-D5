package entities;

import entities.enums.Tipo;

public abstract class ElementoMultimediale {

    protected String titolo;
    protected Tipo tipo;

    //COSTRUTTORE
    public ElementoMultimediale(String titolo){
        this.titolo=titolo;
    }

    //SETTER
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
