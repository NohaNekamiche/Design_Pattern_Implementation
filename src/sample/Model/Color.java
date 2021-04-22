package sample.Model;

public abstract class Color {

    abstract String getColor();
    abstract void setColor(String c);

    @Override
    public String toString(){
        return "color= "+this.getColor();
    }
}
