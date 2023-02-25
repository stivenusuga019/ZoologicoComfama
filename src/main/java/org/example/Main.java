package org.example;

import org.example.clases.Familia;

public class Main {
    public static void main(String[] args) {

        //En el Main usamos la clases que nosotros programamos
        Integer notaFInal=5;

        //Para usar una clase debo crear UN OBJETO DE LA CLASE
        //UN OBJETO es cualquier lenguaje ES UNA VARIABLE ESPECIAL
        Animal animal = new Animal();
        //si ya tengo un objeto lo uso para acceder alos atributos y metodos de una clase
        animal.nombre="Caballo";
        animal.edad=10;



        Familia familia = new Familia();
        familia.setNombrePapa("Charly");
        familia.setNombreMama("Gaby");
        familia.setNombreDelHijo("Pablito");
        familia.setEdadPapa(600);

        System.out.println("El Papa Tiene: "+familia.getEdadPapa());


    }
}