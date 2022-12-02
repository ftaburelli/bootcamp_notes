package Herencia;

// la clase Herencia hereda de Persona, sus atributos y metodos
public class Herencia extends Persona{

    int edades;

    public Herencia(int edades){
        this.edades = edades;
    }

    // Override sobreescribe el metodo de la clase padre, siempre que tenga el mismo nombre y tipo de datos
    @Override public boolean esMayorDeEdad(){
        return this.edades >= 20;
    }
}
