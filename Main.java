/** Programmers:  [your names here]
* Course:  CS 212
* Due Date:
* Lab Assignment:
* Problem Statement:
* Data In:
* Data Out:
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Sphere sun = new Sphere(0.0, 0.0, 0.0, 43.26);
        Sphere earth = new Sphere(26.0, 42.0, 79.0, 0.395);
        Sphere planetX = new Sphere(25.3, 43.1, 77.8, 1.4);

        System.out.println("Sun volume: " + sun.volume());
        System.out.println("Earth volume: " + earth.volume());
        System.out.println("PlanetX volume: " + planetX.volume());

        if (sun.collide(earth)){
            System.out.println("The Sun and Earth collide");
        }
        if (sun.collide(planetX)){
            System.out.println("The Sun and PlanetX collide");
        }
        if (earth.collide(planetX)){
            System.out.println("The Earth and PlanetX collide");
        }
    }
}
