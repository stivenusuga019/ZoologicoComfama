package org.example;

public class Animal {

    //ATRIBUTOS
   protected Integer edad;
    String nombre;
   private String especie;
    Double peso;
    Double estatura;
    String colorPredominante;
    Boolean genero;
    String clasificacion; //Domestio o Salvaje
    Integer numeroPatas;
    String dieta;

    //METODOS ESPECIALES

    public Animal() {
    }

    public Animal(Integer edad, String nombre, String especie, Double peso, Double estatura, String colorPredominante, Boolean genero, String clasificacion, Integer numeroPatas, String dieta) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.estatura = estatura;
        this.colorPredominante = colorPredominante;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.dieta = dieta;
        this.clasificacion = clasificacion;
    }

    //METODOS ORDINARIOS
}
