package sample.interfaces;

public interface AbstractFactory<T>  {
    T create(String choix) ;
}
