/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;


public class AnimalApp {


    public static void main(String[] args) {
        Perro p = new Perro("Stich", "Carnivoro", 15, "Doberman");
        p.alimentarse();
        
        Animal pp = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        pp.alimentarse();
        
        Animal g = new Gato("Pelusa", "Galletas", 10, "Siames");
        g.alimentarse();
        
        Animal c = new Caballo("Cid", "Pasto", 28, "Fino");
        c.alimentarse();
        
    }
    
}
