package sample.Model;

public class noir extends Color {

    private String color;
    public noir(String animalColor){
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
