package Herencia;

public class Persona {
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    public Persona(){}

    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    public int cacularIMC(){
        double imc = this.peso/(Math.pow(this.altura, 2));
        if(imc < 20) return -1;
        if(imc >= 20 && imc <= 25) return 0;
        return 1;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public String toString(){
        return this.nombre + " tiene " + this.edad + " años. Su DNI es: " + this.dni + ". Pesa: " + this.peso + "kg, y mide " + this.altura + "cms.";
    }
}
