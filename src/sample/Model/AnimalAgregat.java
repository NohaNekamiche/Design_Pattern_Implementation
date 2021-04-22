package sample.Model;


import sample.interfaces.Container;
import sample.interfaces.Iterator;

import java.util.ArrayList;

public class AnimalAgregat implements Container {
    public ArrayList<Animal> animals;
    public AnimalAgregat(ArrayList<Animal> list){
        this.animals=list;
    }
    public Iterator getIterator() {
        return new AnimalIterateur(animals);
    }
}
