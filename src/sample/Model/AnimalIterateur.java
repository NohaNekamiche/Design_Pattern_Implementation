package sample.Model;



import sample.interfaces.Iterator;

import java.util.ArrayList;

public class AnimalIterateur implements Iterator {
    public ArrayList<Animal> animals;
    int index;

    public AnimalIterateur(ArrayList<Animal> list){
        this.animals=list;
    }
    @Override
    public boolean hasNext() {
        if (index<animals.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return animals.get(index++);
        }
        return null;
    }
}
