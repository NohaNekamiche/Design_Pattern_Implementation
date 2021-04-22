package sample.Model;


import sample.interfaces.AbstractFactory;

public class AnimalFactory  implements AbstractFactory<Animal> {

    private  String nom;
    private  String age;
    private  String type;
    private  float prix;
    public  AnimalFactory(String nom,String age,String type,float prix){
        this.nom=nom;
        this.age=age;
        this.type=type;
        this.prix=prix;
    }
    @Override
    public Animal create(String animalType) {
        if ("chat".equalsIgnoreCase(animalType)) {
            return chat.getInstance(nom,age,type,prix);
        } else if ("chien".equalsIgnoreCase(animalType)) {
            return chien.getInstance(nom,age,type,prix);
        }else if ("piegon".equalsIgnoreCase(animalType)) {
            return piegon.getInstance(nom,age,type,prix);
        }

        return null;
    }

}
