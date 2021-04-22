package sample.Model;

public class chat extends Animal  {
    private  String nom;
    private  String age;
    private  String type;
    private  float prix;
    private static chat uniqueInstance=null;
    //private AnimalState state;

private chat(String nom,String age,String type,float prix){
    this.nom=nom;
    this.age=age;
    this.type=type;
    this.prix=prix;

}
private synchronized static void effectuersync(String nom,String age,String type,float prix){
    if(uniqueInstance==null)uniqueInstance=new chat(nom,age,type,prix);
}
public static chat getInstance(String nom,String age,String type,float prix){
if(uniqueInstance==null){
    effectuersync(nom,age,type,prix);
}
return uniqueInstance;
}
    @Override
    public chat getAnimal() {
        return null;
    }
    @Override
    public float getPrix() {
        return this.prix;
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
    public void setPrix(float prix) {
            this.prix=prix;
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


    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

   /* @Override
    public Object changeState() {
        return this.state.changeState();
    }

    public void setState(AnimalState state){
    this.state=state;
    }
    public AnimalState getState(){
    return this.state;
    }*/
}
