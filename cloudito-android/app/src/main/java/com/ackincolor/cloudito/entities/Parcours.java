package com.ackincolor.cloudito.entities;

import java.util.ArrayList;
import java.util.UUID;

public class Parcours {
    private UUID id;
    private ArrayList<Noeud> liste;

    public Parcours(UUID id, ArrayList<Noeud> liste) {
        this.id = id;
        this.liste = liste;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList<Noeud> getListe() {
        return liste;
    }

    public void setListe(ArrayList<Noeud> liste) {
        this.liste = liste;
    }

    public String toString(){
        String str = "Parcours : ";
        for(Noeud n : this.liste){
            str+=" n:"+n.toString();
        }
        return str;
    }
}