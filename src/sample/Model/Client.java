package sample.Model;



import sample.interfaces.AbstractFactory;
import sample.interfaces.Iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args){
        AnimalFactory animalFactory=new AnimalFactory("cat","15ans","ciamo",1500);
     //   ColorFactory colorFactory=new ColorFactory();
      //  chat cat=new AnimalFactory("cat","15ans","ciamo",1500);;
        chat c = (chat) animalFactory.create("chat");
        System.out.println(c.getNom()+c.toString());
        chien dog=(chien)animalFactory.create("chien");
        System.out.println(dog.toString());
        ColorFactory colorFactory=new ColorFactory("marron");
        marron m=(marron) colorFactory.create("marron");
        System.out.println(        m.toString());

        ArrayList<Animal> list=new ArrayList<>();
        list.add(c);
        list.add(dog);
        AnimalAgregat animalAgregat=new AnimalAgregat(list);
        System.out.println("iterator");
        for(Iterator it = animalAgregat.getIterator(); it.hasNext();){
            Animal animal= (Animal) it.next();
            System.out.println(animal.toString());
        }


    }

    public static  Animal getAnimal(AbstractFactory factory, String animalType){
        return (Animal) factory.create(animalType);
    }
}
