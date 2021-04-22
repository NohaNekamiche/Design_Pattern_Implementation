package sample.Model;

public class blanc extends Color{
    private String color;
    public blanc(String animalColor){
        this.color=animalColor;
    }
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String c) {
        this.color=c;
    }
}
