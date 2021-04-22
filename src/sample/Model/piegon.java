package sample.Model;

public class piegon extends Animal {
    private  String nom;
    private  String age;
    private  String type;
    private  float prix;
    private static piegon uniqueInstance=null;

    private piegon(String nom,String age,String type,float prix){
        this.nom=nom;
        this.age=age;
        this.type=type;
        this.prix=prix;
    }
    private synchronized static void effectuersync(String nom,String age,String type,float prix){
        if(uniqueInstance==null)uniqueInstance=new piegon(nom,age,type,prix);
    }

    public static piegon getInstance(String nom,String age,String type,float prix){
        if(uniqueInstance==null){
            effectuersync(nom,age,type,prix);
        }
        return uniqueInstance;
    }

    @Override
    String getType() {
        return this.type;
    }

    @Override
    String getage() {
        return this.age;
    }
    @Override
    public float getPrix() {
        return this.prix;
    }
    @Override
    public String getAnimal() {
        return null;
    }


    @Override
    public void setPrix(float prix) {

    }
    @Override
    public String makeSound() {
        return null;
    }

    @Override
    String getNom() {
        return this.nom;
    }

    @Override
    public void setNom(String n) {
        this.nom=n;
    }

    @Override
    public void setAge(String n) {
        this.age=n;
    }

    @Override
    public void setType(String n) {
        this.type=n;
    }


}
