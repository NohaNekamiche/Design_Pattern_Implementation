package sample.Model;

public class marron extends Color {
    private String color;

    public marron(String animalColor){
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
