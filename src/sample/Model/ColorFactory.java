package sample.Model;


import sample.interfaces.AbstractFactory;

public  class ColorFactory implements AbstractFactory {
    private String animalColor;

    public ColorFactory( String color){
        this.animalColor=color;
    }

    @Override
    public Color create(String color) {
        if ("marron".equalsIgnoreCase(color)) {
            return new marron(animalColor);
        } else if ("noir".equalsIgnoreCase(color)) {
            return new noir(animalColor);
        }else if ("blanc".equalsIgnoreCase(color)) {
            return new blanc(animalColor);
        }

        return null;
    }
}
