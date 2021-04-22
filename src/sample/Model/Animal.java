package sample.Model;

public abstract class Animal {

    abstract  Object getAnimal();
    abstract float getPrix();
    abstract String getType();
    abstract String getage();
    abstract void setPrix(float prix);
    abstract void setNom(String n);
    abstract void setAge(String n);
    abstract  void setType(String n);
    abstract String makeSound();
    abstract String getNom();
    @Override
    public String toString(){
        return "nom :"+this.getNom()+"\n type: "+this.getType()+"\n AGE:"+this.getage()
                +"\n prix :"+this.getPrix();
    }


}
