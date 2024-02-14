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

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    //initalize the three spheres
        Sphere[] spheres = new Sphere[3];

        spheres[0] = new Sphere(0.0, 0.0, 0.0, 43.26);
        spheres[1] = new Sphere(26.0, 42.0, 79.0, 0.395);
        spheres[2] = new Sphere(25.3, 43.1, 77.8, 1.4);

    //Output the volume
        System.out.println("Sun volume: " + spheres[0].volume());
        System.out.println("Earth volume: " + spheres[1].volume());
        System.out.println("PlanetX volume: " + spheres[2].volume());
    //Output the area
        System.out.println("Sun area: " + spheres[0].Area());
        System.out.println("Earth area: " + spheres[1].Area());
        System.out.println("PlanetX area: " + spheres[2].Area());
    //Output if any of the spheres collided with each other
        if (spheres[0].collide(spheres[1])){
            System.out.println("The Sun and Earth collide");
        }
        if (spheres[0].collide(spheres[2])){
            System.out.println("The Sun and PlanetX collide");
        }
        if (spheres[0].collide(spheres[2])){
            System.out.println("The Earth and PlanetX collide");
        }


    //Extra Credit: Locate the sphere based on new input points (x,y,z)
        System.out.println("Enter a location in space");
        double x = doubleInput("Enter x: ");
        double y = doubleInput("Enter y: ");
        double z = doubleInput("Enter z: ");
    //Initalize the smallest ditance
        double smallestDist = spheres[0].Distance(x,y,z);
    //Find the closest sphere 
        int closest = 0;
        for(int i = 1; i < spheres.length; i ++){
            double temp = spheres[i].Distance(x, y, z);
            if (temp < smallestDist){
                smallestDist = temp;
                closest = i;
            }
        }
        //Output which sphere is closer 
        if (closest == 0){
            System.out.println("The point is closest to the Sun");
        } else if (closest == 1) {
            System.out.println("The point is closest to the Earth");
        }else {
            System.out.println("The point is closest to PlanetX");
        }
    }
    
    public static double doubleInput(String prompt) {
        //initialize the variables
        double num = 0;
        boolean valid = false;
        //loops until the input is valid
        while (!valid) {
            //outputs the prompt
            System.out.println(prompt);
            //tries to get the input and set as an double
            try {
                num = input.nextDouble();
                valid = true;
                //if the program gets an error output invalid input and trys again
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ");
                input.next();
            }
        }
        //returns a valid num
        return num;
    }
}
